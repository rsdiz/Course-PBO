package pkginterface;

import java.io.*;
/**
 *
 * @author  Muhammad Rosyid Izzulkhaq
 * @nim     5180411122
 */
public class Interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        Kalkulator calc = new Kalkulator();
        
        System.out.print("Masukkan Bilangan Pertama: ");
        double a = Double.parseDouble(input.readLine());
        System.out.print("Masukkan Bilangan Kedua: ");
        double b = Double.parseDouble(input.readLine());
        
        calc = new Kalkulator(a, b);
        
        System.out.println("=======================================");
        
        System.out.print("Hasil Penjumlahan: "); calc.Penjumlahan();
        System.out.print("Hasil Pengurangan: "); calc.Pengurangan();
        System.out.println("Hasil Perkalian  : " + calc.Perkalian());
        System.out.println("Hasil Pembagian  : " + calc.Pembagian());
    }
    
}