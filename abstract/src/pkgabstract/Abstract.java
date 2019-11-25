/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgabstract;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author  Muhammad Rosyid Izzulkhaq
 * @nim     5180411122
 */
public class Abstract {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        
        Manusia[] menungso = new Manusia[2];
        
        int x = 0;
        
        do{
            System.out.println("User " + (x+1));
            System.out.print("Masukkan tinggi badan anda (cm)   : ");
            double tinggi = Double.parseDouble(buff.readLine());
            System.out.print("Masukkan jenis kelamin anda (L/P) : ");
            String jk = buff.readLine();
            
            if (jk.toUpperCase().equals("L")) {
                menungso[x] = new Laki(tinggi);
                System.out.println("Berat badan ideal laki-laki: " + menungso[x].hitungBBI());
                System.out.println();
            } else if (jk.toUpperCase().equals("P")) {
                menungso[x] = new Perempuan(tinggi);
                System.out.println("Berat badan ideal perempuan: " + menungso[x].hitungBBI());
                System.out.println();
            }
            x++;
        } while(x<2);
    }
    
}