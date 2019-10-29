class Silinder extends Lingkaran{
	//Deklarasi variabel
	private double tinggi;

	//Constructor
	public Silinder(double tinggi, double radius, String warna){
		super(radius, warna);
		this.tinggi = tinggi;
		setRadius(radius);
		setWarna(warna);
	}

	//Getter
	public double getTinggi(){
		return tinggi;
	}

	//Setter
	public void setTinggi(double t){
		tinggi = t;
	}

	//Function hitungVolume()
	public double hitungVolume(){
		return this.hitungLuas() * tinggi;
	}

	//Method printInfo()
	public void printInfo(){
		System.out.println("Silinder warna "+getWarna()+", volume = "+hitungVolume());
	}
}