/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.pop.optimizer;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author 0x2
 */
public class Container implements Serializable{
    private ArrayList<Crew> team = new ArrayList<>();
    private Ship ship = null;
    
    public ArrayList<Crew> getCrew(){
        return team;
    }
    
    public Ship getShip()
    {
        return ship;
    }
    
    public void setCrew(ArrayList<Crew> c){
        team = c;
    }
    
    public void setShip(Ship s)
    {
        ship = s;
    }
    
    public void addCrew(Crew c)
    {
        team.add(c);
    }
    
    public void emptyContents()
    {
        ship = null;
        team.clear();
    }
    
    public void setContents(Container c)
    {
        team.clear();
        for(int i=0; i<c.getCrew().size(); i++)
        {
            team.add(c.getCrew().get(i));
        }
    }
}
