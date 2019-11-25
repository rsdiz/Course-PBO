/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgabstract;

/**
 *
 * @author  Muhammad Rosyid Izzulkhaq
 * @nim     5180411122
 */
public abstract class Manusia {
    
    private double tinggibadan;
    
    public Manusia(double TB){
        tinggibadan = TB;
    }
    
    public double getTB(){
        return tinggibadan;
    }
    
    public abstract double hitungBBI();
    
}
