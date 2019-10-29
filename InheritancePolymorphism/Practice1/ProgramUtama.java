/**
 *
 * @author	Muhammad Rosyid Izzulkhaq
 */

public class ProgramUtama{
	public static void main(String[] args) {
		//Inisialisasi BujurSangkar
		BujurSangkar kotak = new BujurSangkar(5, "Pink");
		//Inisialisasi Lingkaran
		Lingkaran bunder = new Lingkaran(7, "Hitam");
		//Inisialisasi Silinder
		Silinder kaleng = new Silinder(5, 7, "Hijau");

		//printInfo
		kotak.printInfo();
		bunder.printInfo();
		kaleng.printInfo();
	}
}