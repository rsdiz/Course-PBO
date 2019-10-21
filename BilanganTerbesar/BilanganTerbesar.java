import java.util.Scanner;
/**
 * @author Muhammad Rosyid Izzulkhaq
 */
public class BilanganTerbesar {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Deklarasi Variabel
        int a,b,c; float rata;
        //Instansi Class Scanner
        Scanner input = new Scanner(System.in);
        //Masukkan user
        System.out.print("Masukkan angka ke-1 : "); a = input.nextInt();
        System.out.print("Masukkan angka ke-2 : "); b = input.nextInt();
        System.out.print("Masukkan angka ke-3 : "); c = input.nextInt();
        //menghitung rata-rata
        rata = (a + b + c) / 3;
        System.out.println("Rata-rata : " + rata);
        //logika mencari angka terbesar
        System.out.println("Angka terbesar adalah ");
        if (a > b) {
            if (a > c) { System.out.println("angka ke-1, "+a); }
            else { System.out.println("angka ke-3, "+c); }
        }
        else if (b > c) { System.out.println("angka ke-2, "+b); }
        else { System.out.println("angka ke-3, "+c); }
    }
}