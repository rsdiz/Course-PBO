class Triangle extends Shape{
	private double alas, tinggi;
	public Triangle(double alas, double tinggi, String color){
		super(color);
		setAlas(alas);
		setTinggi(tinggi);
		setColor(color);
	}
	public void setAlas(double alas){
		this.alas = alas;
	}
	public void setTinggi(double tinggi){
		this.tinggi = tinggi;
	}	
	public double getAlas(){
		return alas;
	}
	public double getTinggi(){
		return tinggi;
	}
	public void getLuas(){
		double luas;
		luas = getAlas() * getTinggi() / 2;
		System.out.println(">> Triangle "+getColor());
		System.out.println(" Panjang Alas  = "+getAlas()+" cm");
		System.out.println(" Tinggi        = "+getTinggi()+" cm");
		System.out.println(" Luas Segitiga = "+luas);
	}
}