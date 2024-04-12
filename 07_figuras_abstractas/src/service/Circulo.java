package service;

public class Circulo extends Figura {
	//Atributo
	private double radio;
	
	//Constructores
	//Constructor con parámetros. De no estar daría error ya q la clase padre no tiene constructor sin parámetros.
	//De haberlo no sería necesario tener este.(Crear constructo sin parámetros en clase padre abstracta)
	public Circulo(String color, double radio) {
		super(color);
		this.radio = radio;
	}
	
	public Circulo(String color) {
		super(color);
	}


	//Getter y Setter
	public double getRadio() {
		return radio;
	}



	public void setRadio(double radio) {
		this.radio = radio;
	}

	//Métodos heredados de la superclase abstracta

	@Override
	public double area() {
		return Math.PI * Math.pow(radio, 2);
	}

}
