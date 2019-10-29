class Lingkaran extends Bentuk{
	//Deklarasi Variabel
	private double radius;
	private final double phi = 3.14d;

	//Constructor
	public Lingkaran(double radius, String warna){
		super(warna);
		this.radius = radius;
		this.setWarna(warna);
	}

	//Getter
	public double getRadius(){
		return radius;
	}

	//Setter
	public void setRadius(double r){
		this.radius = r;
	}

	//Function hitungLuas()
	public double hitungLuas(){
		return phi * (radius * radius);
	}

	//Method printInfo()
	public void printInfo(){
		System.out.println("Lingkaran "+this.getWarna()+", luas = "+hitungLuas());
	}
}