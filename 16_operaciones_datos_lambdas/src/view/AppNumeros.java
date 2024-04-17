package view;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;
import java.util.function.Predicate;

import service.OperacionesService;

/*class Pares implements Condicion{

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
	
}*/

public class AppNumeros {

	public static void main(String[] args) {
		List <Integer>numeros = List.of(3,-2,8,5,1,17,22,-9,6,12);
		/*imprimir la suma de los pares y suma de los negativos
		 * 
		 */
		
		OperacionesService service = new OperacionesService();
		/*Positivo pos = new Positivo();
		Pares par = new Pares();*/
		
		//System.out.println("Suma positivos: " + service.sumarPorCondicion(numeros,pos));
		//System.out.println("Suma positivos: " + service.sumarPorCondicion(numeros,par));
		
		//Expresión LAMBDA implementado en una variable
		/*Condicion po = (Integer n) -> n > 0;
		System.out.println("Sumam positivos: " + service.sumarPorCondicion(numeros, po));*/
		//Expresión LAMBDA dentro del propio método
		System.out.println("Suma positivos: " + service.sumarPorCondicion(numeros,n -> n > 0));
		//Suma los números mayore que -5
		System.out.println("Suma mayores -5: " + service.sumarPorCondicion(numeros, n -> n > -5 && n < 0));
		//Con interface Predicate
		Predicate<Integer> negativo = n -> n  < 0;
		System.out.println("Suma con Predicate: " + service.sumarPorCondicion(numeros, negativo.and(n -> n > -5)));
		
		System.out.println("Imrimir los positivos");
		service.porcesarPorCondicion(numeros, n -> n > 0, n -> System.out.println(n));
		//Imprimir en fichero los números pares
		System.out.println("Guardar los pares");
		String archivo = "archivo.txt";
		service.porcesarPorCondicion(numeros, n -> n %2 == 0, n -> {
			try(FileOutputStream fo = new FileOutputStream (archivo,true);
			PrintStream out = new PrintStream(fo)){
				out.println(n);
				System.out.println("Número par guardado " + n);
			}catch (IOException ex) {
				ex.printStackTrace();
			}
		});
	
	
	
	}
	

}


