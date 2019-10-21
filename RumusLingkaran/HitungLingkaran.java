import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Muhammad Rosyid Izzulkhaq
 */
public class HitungLingkaran {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Rumus circle = new Rumus();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Program Menghitung\nLuas dan Keliling Lingkaran");
        System.out.println("+ + + + + + + + + + + + + +");
        System.out.print("Masukkan Panjang Jari2: ");
        double jari = Double.parseDouble(input.readLine());
        System.out.println("+ + + + + + + + + + + + + +");

        circle.setJari(jari);
        circle.hasilHitung();
    }
    
}