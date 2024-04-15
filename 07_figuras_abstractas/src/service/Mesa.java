package service;

public class Mesa implements Operaciones{

	double ancho;
	double alto;
	double largo;
	public Mesa(double ancho, double alto, double largo) {
		super();
		this.ancho = ancho;
		this.alto = alto;
		this.largo = largo;
	}
	public Mesa() {
		super();
	}
	public double getAncho() {
		return ancho;
	}
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	public double getAlto() {
		return alto;
	}
	public void setAlto(double alto) {
		this.alto = alto;
	}
	public double getLargo() {
		return largo;
	}
	public void setLargo(double largo) {
		this.largo = largo;
	}
	@Override
	public void girar(int grados) {
		ancho += grados;
		alto += grados;
		largo += grados;
		
	}
	@Override
	public double invertir() {
		
		return 0;
	}
	
	
	
	
}
