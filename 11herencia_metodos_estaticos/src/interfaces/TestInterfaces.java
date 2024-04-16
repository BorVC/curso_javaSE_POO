package interfaces;

interface I1{
	/*//Método estático q no se hereda.Está asociado
	 * únicamente a la interface
	 */
	static void print() {
		System.out.println("I1");
	}
}

class C implements I1{
	
}

interface I2 extends I1{
	
}

public class TestInterfaces {

	public static void main(String[] args) {
		//C.print()//NO se hereda
		//I2.print()//NO se hereda
		I1.print();

	}

}
