public class Mobil
{
	public static void main(String[] args) {
		//buat 2 buah obyek mobilku yaitu mobil1 dan mobil2

		Mobilku mobil1 = new Mobilku();//obyek 1 bernama mobil1
		Mobilku mobil2 = new Mobilku();//obyek 1 bernama mobil2

		//memberi nomor dan nama obyek mobil1 dan mobil2
		mobil1.masuk_info(1, "HONDA");
		mobil2.masuk_info(2, "TOYOTA");

		//panggil method
		mobil1.info();
		mobil2.info();
	}
}