package principal;

import service.Condicion;
import service.ListNumber;
import service.Operacion;

class Menores30 implements Condicion{

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
		//lst.remove(new Impares());
		System.out.println("Números menores de 30");
		lst.remove(new Menores30());
		System.out.println("Primer número: " + lst.first());
		System.out.println("Último número: " +lst.last());
		System.out.println("Suma: " +lst.suma());
		System.out.println("Raíz cuadrada de los números:");
		lst.transformer(new RaizCuadrada());
		System.out.println("Primer número: " + lst.first());
		System.out.println("Último número: " +lst.last());
		System.out.println("Suma: " +lst.suma());

	}

}
