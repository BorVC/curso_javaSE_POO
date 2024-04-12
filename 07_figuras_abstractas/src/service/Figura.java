package service;

public abstract class  Figura {//Clase abstracta
	private String color;

	//Constructores
	public Figura(String color) {
		super();
		this.color = color;
	}
	
	public Figura() {
	
	}
	
	
	//Getter y Setter
	
	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	//Métodos abstractos
	public abstract double area();
}
