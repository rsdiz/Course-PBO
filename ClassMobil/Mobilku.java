class Mobilku
{
	//Variabel class
	private int merek;
	private String nama;

	//informasi mobil --> METHOD
	public void masuk_info(int mrk, String nm)
	{
		this.merek = mrk;
		this.nama = nm;
	}
	public void info()
	{
		System.out.println("No    = "+this.merek);
		System.out.println("Nama  = "+this.nama);
	}
}