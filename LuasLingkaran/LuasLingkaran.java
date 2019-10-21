import java.util.Scanner;

/**
 *
 * @author Muhammad Rosyid Izzulkhaq
 */
public class LuasLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Deklarasi Variabel
        float phi = 3.14f, jari, luas;
        
        //Instansi Class Scanner
        Scanner input = new Scanner(System.in);
        
        //Masukkan dari user
        System.out.print("Masukkan panjang jari-jari : "); jari = input.nextFloat();
        
        //Rumus Luas Lingkaran
        luas = phi * ( jari * jari );
        
        //Print out hasil
        System.out.println("Luas Lingkaran dengan jari-jari "+jari+" cm adalah "+luas+" cm2");
    }
}