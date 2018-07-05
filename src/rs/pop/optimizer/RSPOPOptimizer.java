/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.pop.optimizer;

/**
 *
 * @author 0x2
 */
public class RSPOPOptimizer {
    private static String version = "1.01";  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OptimizerInterface op = new OptimizerInterface();
        op.setVersion(version);
        op.setVisible(true);
    }
    
}
