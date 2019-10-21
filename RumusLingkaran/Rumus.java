/**
 *
 * @author Muhammad Rosyid Izzulkhaq
 */
public class Rumus {
    private final double phi = 3.14d;
    
    //Deklarasi Variabel
    private double jari;
    
    //Setter
    public void setJari(double jari){
        this.jari = jari;
    }
    
    //Getter
    public double getJari(){
        return jari;
    }
    
    //Rumus Menghitung Keliling Lingkaran
    public double hitungKeliling(){
        double keliling = 2 * phi * getJari();
        return keliling;
    }
    
    //Rumus Menghitung Luas Lingkaran
    public double hitungLuas(){
        double luas = phi * Math.pow(getJari(), 2);
        return luas;
    }
    
    //Tampilkan Hasil
    public void hasilHitung(){
        System.out.println("Jari-jari Lingkaran: "+getJari());
        System.out.printf("Keliling Lingkaran : %.2f \n", hitungKeliling());
        System.out.printf("Luas Lingkaran     : %.2f \n", hitungLuas());
    }
}