class BujurSangkar extends Bentuk{
	//Deklarasi variabel
	private double sisi;

	//Constructor
	public BujurSangkar(double sisi, String warna) {
		super(warna);
		this.sisi = sisi;
		this.setWarna(warna);
	}

	//Getter
	public double getSisi(){
		return sisi;
	}

	//Setter
	public void setSisi(double sisi){
		this.sisi = sisi;
	}

	//Function HitungLuas()
	public double HitungLuas(){
		return sisi*sisi;
	}

	//Function printInfo()
	public void printInfo(){
		System.out.println("BujurSangkar berwarna "+this.getWarna()+", luas = "+this.HitungLuas());
	}
}