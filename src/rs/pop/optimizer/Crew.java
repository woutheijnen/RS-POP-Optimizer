/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.pop.optimizer;

import java.io.Serializable;

/**
 *
 * @author 0x2
 */
public class Crew implements Serializable {
    private String name = "";
    private int morale = 0;
    private int combat = 0;
    private int seafaring = 0;
    private Boolean available = true;
    private Boolean[] traits = {false, false, false, false, false, false, false, false, false};
    private int solidBonus = 25;
    
    public void setName(String s)
    {
        name = s;
    }
    
    public void setStats(int m, int c, int s)
    {
        morale = m;
        combat = c;
        seafaring = s;
    }
    
    public void setTraits(Boolean[] t)
    {
        traits = t;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int[] getStats()
    {
        int[] r = {morale, combat, seafaring};
        return r;
    }
    
    public Boolean[] getTraits()
    {
        return traits;
    }
    
    public Boolean isAvailable()
    {
        return available;
    }
    
    public void setAvailable(Boolean a)
    {
        available = a;
    }
    
    public void setBonus(int s)
    {
        solidBonus = s;
    }
    
    public int getBonus()
    {
        return solidBonus;
    }
}
