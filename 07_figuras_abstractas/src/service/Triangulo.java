package service;

public class Triangulo extends Figura implements Operaciones{
	
	//Atributos
	double base;
	double altura;
	
	//Constructores

	public Triangulo(String color, double base, double altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}
	
	public Triangulo(String color) {
		super(color);
	}


	public double getBase() {
		return base;
	}





	public void setBase(int base) {
		this.base = base;
	}





	public double getAltura() {
		return altura;
	}





	public void setAltura(int altura) {
		this.altura = altura;
	}





	@Override
	public double area() {	
		return base * altura / 2;
	}

	@Override
	public void girar(int grados) {
		base +=grados;
		altura +=grados;
		
	}

	@Override
	public double invertir() {
		base--;
		return base + altura;
	}
	
	

}
