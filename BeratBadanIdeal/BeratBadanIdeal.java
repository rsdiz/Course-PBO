/**
 *
 * @author Muhammad Rosyid Izzulkhaq
 */
public class BeratBadanIdeal{
	public static void main(String[] args) {
		//Deklarasi variabel
		String jenisKelamin = "pria";
		float bbi = 0,
			tinggiBadan = 153,
			beratBadan = 45;

		//Rumus BBI
		if (jenisKelamin == "pria") {
			bbi = (tinggiBadan - 100) - ((tinggiBadan-100) * 10/100);
		} else if (jenisKelamin == "wanita") {
			bbi = (tinggiBadan - 100) - ((tinggiBadan-100) * 15/100);
		}

		//Cetak Hasil
		if (bbi != 0) {
			System.out.println(
				"Jenis Kelamin: "+jenisKelamin+
				"\nTinggi Badan : "+tinggiBadan+
				"\nBerat Badan  : "+beratBadan);
			if (beratBadan > bbi) {
				System.out.println("Berat Badan anda tidak ideal!");
			} else {
				System.out.println("Berat Badan anda ideal!");
			}
		} else {
			System.out.println("Tentukan Jenis Kelamin Anda!");
		}
	}
}