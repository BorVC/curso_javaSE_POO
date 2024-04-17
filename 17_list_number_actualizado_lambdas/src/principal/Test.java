package principal;

import service.ListNumber;

/*class Menores30 implements Condicion{

	@Override
	public boolean test(Integer n) {	
		return n < 30;
	}	
}

class Impares implements Condicion{

	@Override
	public boolean test(Integer n) {
		return n%2 != 0;
	}
	
}

class RaizCuadrada implements Operacion{

	@Override
	public Integer operar(Integer n) {
		return (int)Math.sqrt(n);
	}
	
}
*/

public class Test {

	public static void main(String[] args) {
		ListNumber lst=new ListNumber();
		lst.add(20);
		lst.add(30);
		lst.add(10);
		lst.add(20);
		lst.add(35);
		lst.add(11);
		lst.add(15);
		lst.add(23);
		/*///lst.remove(new Impares());
		System.out.println("Números menores de 30");
		lst.remove(new Menores30());
		System.out.println("Primer número: " + lst.first());
		System.out.println("Último número: " +lst.last());
		System.out.println("Suma: " +lst.suma());
		System.out.println("Raíz cuadrada de los números:");
		lst.transformer(new RaizCuadrada());
		System.out.println("Primer número: " + lst.first());
		System.out.println("Último número: " +lst.last());
		System.out.println("Suma: " +lst.suma());*/
		
		//Solo impares
		System.out.println("Eliminar impares" + lst);
		lst.remove(n ->  n%2 != 0);
		System.out.println("Lista tras eliminarlos: " + lst);
		System.out.println("Primer número: " + lst.first());
		System.out.println("Último número: " +lst.last());
		System.out.println("Suma: " +lst.suma());
		//Raíz cuadrada de todos los números
		System.out.println("Raíz cuadrada de los números" + lst);
		lst.transformer(n -> (int)Math.sqrt(n));
		System.out.println("Lista tras raíz cuadrada: " +lst);
		System.out.println("Primer número: " + lst.first());
		System.out.println("Último número: " +lst.last());
		System.out.println("Suma: " +lst.suma());

	}

}
