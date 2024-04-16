package service;

import java.util.List;

public class OperacionesService {
	
	/*//Método q recibe una lista de números enteros y devuelve la suma de los pares
	public int sumaPares(List <Integer> lista) {
		int suma = 0;
		for(Integer num : lista) {
			if(num %2 == 0) {
				suma += num;
			}
		}
		return suma;
	}
	
	//Método q recibe lista de números enteros y devuleve la suma de los positivos
	public int sumaPositivos(List <Integer> lista) {
		int suma = 0;
		for(Integer num : lista) {
			if(num > 0) {
				suma += num;
			}
		}
		return suma;
	}
	
	//Método q recibe lista de números enteros y devuleve la suma de los 
    //múltiplos de 5*/
	/*método q recibe una listad de números y una condición
	 * y devuleve la suma de los números q cumplen la condición
	 */
	
	public int sumarPorCondicion(List<Integer> lista,Condicion condicion) {
		int suma = 0;
		for(Integer num : lista) {
			if(condicion.test(num)) {
				suma += num;
			}
		}
		return suma;
	}
	
	
	

}
