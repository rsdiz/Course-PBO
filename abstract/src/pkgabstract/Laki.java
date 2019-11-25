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
public class Laki extends Manusia{
    
    public Laki(double TB){
        super(TB);
    }
    
    @Override
    public double hitungBBI(){
        return (super.getTB() - 100)*0.9;
    }
    
}
