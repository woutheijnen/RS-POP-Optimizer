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
public class Ship implements Serializable{
    private int[] decks;
    private int[] hulls;
    private int[] rams;
    private String wright = "Dilapidated shipwright";
    private Boolean enabled = true;
    private int[] dfltStats = {0, 0, 0};
    
    public int[] getDeck()
    {
        return decks;
    }
    
    public int[] getHull()
    {
        return hulls;
    }
    
    public int[] getRam()
    {
        return rams;
    }
    
    public String getWright()
    {
        return wright;
    }
    
    public void setDeck(int[] d)
    {
        decks = d;
    }
    
    public void setHull(int[] h)
    {
        hulls = h;
    }
    
    public void setRam(int[] r)
    {
        rams = r;
    }
    
    public void setWright(String w)
    {
        wright = w;
    }
    
    public Boolean getEnabled()
    {
        return enabled;
    }
    
    public void setEnabled(Boolean b)
    {
        enabled = b;
    }
    
    public void setDfltStats(int[] stats)
    {
        dfltStats = stats;
    }
    
    public int[] getDfltStats()
    {
        return dfltStats;
    }
}
