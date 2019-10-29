public class Shape{
	private String color;
	public Shape(String color){
		this.color = color;
	}
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color = color;
	}
	public void getLuas(){
		System.out.println("Bentuk belum diketahui!");
	}

	public static void main(String[] args) {
		Circle bunder = new Circle(7, "Hitam");
		Rectangle kotak = new Rectangle(2, 4, "Biru");
		Triangle bucu = new Triangle(5, 4, "Kuning");
		bunder.getLuas();
		kotak.getLuas();
		bucu.getLuas();
	}
}