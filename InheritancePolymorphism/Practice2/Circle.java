class Circle extends Shape{
	private final double phi = 3.14d;
	private double radius;
	public Circle(double radius, String color){
		super(color);
		setColor(color);
		setRadius(radius);
	}
	public void setRadius(double radius){
		this.radius = radius;
	}

	public double getRadius(){
		return radius;
	}

	public void getLuas(){
		double luas;
		luas = phi * Math.pow(getRadius(), 2);
		System.out.println(">> Circle "+getColor());
		System.out.println(" Panjang Radius = "+getRadius()+" cm");
		System.out.println(" Luas lingkaran = "+luas);
	}
}