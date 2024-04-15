package principal;
class C1{
	//Variable
	int a = 3;
	//Método C1
	public void print() {
		System.out.println("C1");
	}
}

class C2 extends C1{
	//Variable
	int a = 5;
	//Métodos C2
	public void print() {
		System.out.println("C2");
	}
	
	public void send() {
		System.out.println("Enviando...");
	}
}
public class Prueba1 {

	public static void main(String[] args) {
		C1 c = new C2();
		c.print();//Lllama al método de C2 xq vienen de la superclase y se sobreescribe
		//c.send();NO xq este método no está definido en la superclase
		System.out.println(c.a);//Imprime la variable declarada en la superclase ya q estan no se sobreescriben

		
	}

}
