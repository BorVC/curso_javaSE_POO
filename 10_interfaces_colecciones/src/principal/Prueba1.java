package principal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

public class Prueba1 {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(25);
		nums.add(200);
		nums.add(20);
		nums.add(13);
		nums.add(8);
		System.out.println("Con ArrayList:" + sumaPares(nums));
		
		Vector <Integer> numeros = new Vector<Integer>();
		numeros.add(30);
		numeros.add(55);
		numeros.add(15);
		numeros.add(18);
		
		System.out.println("Con Vector:" +sumaPares(numeros));

	}
	
	//REUTILIZACIÓN DE CÓDIGO
	//crear un método q reciba lista de Integer y devuelva la suma
	//de lo pares de dicha lista
	
	/*Polimorfismo objeto List para cualquier objeto q implemente esta c
	 * colección
	 */
	public static Integer sumaPares(List <Integer> lista) {
		Integer suma = 0;
		for(Integer num : lista) {
			if(num %2 == 0) {
				suma += num;
			}
		}
		return suma;
	}
	
	//crear un método q reciba una colleción de Integer y devuelva la suma
	//de lo pares de dicha lista
	
	/*//Polimorfismo Interface Collection para poder usarse con cualquier 
	 * objeto q implemente la Interface
	 * 
	 */
	public static Integer media (Collection<Integer> coleccion) {
		Integer suma = 0;
		//Integer total = 0;
		for(Integer num : coleccion) {
			suma += num;
			//total++;
		}
		return suma / coleccion.size();//total;
	}

}
