import java.util.Scanner;

/**
 * @author Rosyid Iz
 */
public class GanjilGenap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Deklarasi variabel
        int angka;
        
        //Instansi Class Scanner
        Scanner input = new Scanner(System.in);
        
        //Masukkan dari user
        System.out.print("Masukkan angka : "); angka = input.nextInt();
        System.out.print("Angka " + angka + " merupakan angka ");
        
        //Logika menentukan ganjil / genap
        if (angka % 2 == 0) {
            System.out.println("genap");
        } else {
            System.out.println("ganjil");
        }
    }
}