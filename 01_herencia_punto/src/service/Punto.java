package service;

public class Punto {

	private int x;
	private int y;
	//Constructores
	public Punto(int x, int y) {
		
		this.x = x;
		this.y = y;
	}
	public Punto() {
		x = 5;
		y = 10;
	}
	//Si no se crea ningún constructor, java crea el constructor por defecto(default constructor)
	/*
	 * public Punto()}
	 * 
	 * }
	 */
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	/*Modificadores de acceso.Si no tubiera ambito (public / private) solo se podria usar en el mismo paquete en el 
	 * que se encuentra la clase
	 */
	public void imprimir() {
		System.out.println("Las coordenadas son " + x + ","+ y);
	}
}
