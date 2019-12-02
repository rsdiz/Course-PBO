package pkginterface;

/**
 *
 * @author  Muhammad Rosyid Izzulkhaq
 * @nim     5180411122
 */
public class Kalkulator implements Operasi{
    
    // Inisialisasi variabel
    
    private double bil1, bil2;
    
    // Constructor
    
    public Kalkulator() {
        
    }
    
    public Kalkulator(double bil1, double bil2) {
        this.bil1 = bil1;
        this.bil2 = bil2;
    }
    
    // Getter
    
    public double getBil1() {
        return bil1;
    }
    
    public double getBil2() {
        return bil2;
    }
    
    // Implements method from Operasi
    
    @Override
    public void Penjumlahan() {
        System.out.println(bil1 + bil2);
    }
    
    @Override
    public void Pengurangan() {
        System.out.println(bil1 - bil2);
    }
    
    @Override
    public double Perkalian() {
        return bil1 * bil2;
    }
    
    @Override
    public double Pembagian() {
        return bil1 / bil2;
    }
    
}
