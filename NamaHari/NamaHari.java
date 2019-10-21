public class NamaHari{
	public static void main(String[] args) {
		//Variabel lokal
		int nomorHari = 2;

		switch (nomorHari){
			case 1:
				System.out.println("Hari ke-" +nomorHari+ ": Senin");
				break;
			case 2:
				System.out.println("Hari ke-" +nomorHari+ ": Selasa");
				break;
			case 3:
				System.out.println("Hari ke-" +nomorHari+ ": Rabu");
				break;
			case 4:
				System.out.println("Hari ke-" +nomorHari+ ": Kamis");
				break;
			case 5:
				System.out.println("Hari ke-" +nomorHari+ ": Jumat");
				break;
			case 6:
				System.out.println("Hari ke-" +nomorHari+ ": Sabtu");
				break;
			case 7:
				System.out.println("Hari ke-" +nomorHari+ ": Minggu");
				break;
			default:
				System.out.println("Tidak ada hari ke-" +nomorHari);
		}
	}
}