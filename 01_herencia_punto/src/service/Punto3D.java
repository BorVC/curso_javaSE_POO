package service;

public class Punto3D extends Punto{
	
	public int z;
	
	//Constructor
	public Punto3D(int z) {
		this.z  =z;
	}
	
	//Constructor q hereda de la superclase.LLAMADA
	//Sobrecarga de constructores
	
	public Punto3D(int x, int y, int z) {
		super(x, y);//trae los valores x,y de la clase punto
		this.z = z;
	}



	//Getter y setter
	public int getZ() {
		return z;
	}
	
	public void  setZ(int z) {
		this.z = z;
	}
}
