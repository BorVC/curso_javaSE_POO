package service;

public class Punto3D extends Punto{
	
	private int z;
	
	//Constructor
	public Punto3D(int z) {
		this.z  =z;
	}
	
	//Constructor q hereda de la superclase.LLAMADA
	//Sobrecarga de constructores
	
	public Punto3D(int x, int y, int z) {
		super(x, y);//trae los atributos y sus posibles valores(ene este caso son 5,10) x,y de la clase punto
		this.z = z;
	}



	//Getter y setter
	public int getZ() {
		return z;
	}
	
	public void  setZ(int z) {
		this.z = z;
	}
	/*@Override
	public void imprimir() {
		System.out.println("Las coordenadas son: " + getX() + getY() + z);
	}*/

	//Con funciones eclipse con Source @Override
	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		/*//Llamda al método de la superclase o clase padre.
		 * Utiliza super porque si no la llamada al método sería recursiva.
		 * Llamaría al propio método imprimir definido en esta clase
		 */
		super.imprimir();
		System.out.println("," + z);//Añadir nueva función (Sobreescribir método imprimir();)
	}
}
