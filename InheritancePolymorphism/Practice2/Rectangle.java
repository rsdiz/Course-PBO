class Rectangle extends Shape{
	private double panjang, lebar;
	public Rectangle(double panjang, double lebar, String color){
		super(color);
		setPanjang(panjang);
		setLebar(lebar);
		setColor(color);
	}
	public void setPanjang(double panjang){
		this.panjang = panjang;
	}
	public void setLebar(double lebar){
		this.lebar = lebar;
	}
	public double getPanjang(){
		return panjang;
	}
	public double getLebar(){
		return lebar;
	}
	public void getLuas(){
		double luas;
		luas = getPanjang() * getLebar();
		System.out.println(">> Rectangle "+getColor());
		System.out.println(" Panjang = "+getPanjang()+" cm");
		System.out.println(" Lebar   = "+getLebar()+" cm");
		System.out.println(" Luas Persegi Panjang = "+luas);
	}
}