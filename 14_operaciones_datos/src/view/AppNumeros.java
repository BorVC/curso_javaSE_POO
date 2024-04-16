package view;

import java.util.List;

import service.Condicion;
import service.OperacionesService;

class Pares implements Condicion{

	@Override
	public boolean test(Integer n) {
		return n %2 == 0;
	}
	
}

class Positivo implements Condicion{

	@Override
	public boolean test(Integer n) {
		return n > 0;
	}
	
}

public class AppNumeros {

	public static void main(String[] args) {
		List <Integer>numeros = List.of(3,-2,8,5,1,17,22,-9,6,12);
		/*imprimir la suma de los pares y suma de los negativos
		 * 
		 */
		
		OperacionesService service = new OperacionesService();
		Positivo pos = new Positivo();
		
		System.out.println("Suma positivos: " + service.sumarPorCondicion(numeros,pos));
	}
	
	
	
	

}


