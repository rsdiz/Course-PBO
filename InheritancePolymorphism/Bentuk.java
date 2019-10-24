class Bentuk{
	//Deklarasi variabel
	private String warna;

	//Constructor
	public Bentuk(String warna){
		this.warna = warna;
	}

	//Getter
	public String getWarna(){
		return warna;
	}

	//Setter
	public void setWarna(String warna){
		this.warna = warna;
	}

	//Print Info
	public void printInfo(){
		System.out.println("Bentuk berwarna: "+warna);
	}
}