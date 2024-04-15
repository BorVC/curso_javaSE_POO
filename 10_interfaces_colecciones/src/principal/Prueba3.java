package principal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Prueba3 {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(11);nums.add(7);nums.add(12);nums.add(31);
		nums.add(4);nums.add(41);nums.add(3);nums.add(8);
		
		HashSet<Integer> nums2 = new HashSet<Integer>();
		nums2.add(13);nums2.add(9);nums2.add(12);nums2.add(31);
		nums2.add(4);nums2.add(43);nums2.add(3);nums2.add(8);
		
		//System.out.println(iguales(nums,nums2));
		//Recorremos resultado con Iterator
		Set <Integer> res = iguales(nums,nums2);
		Iterator<Integer> it = res.iterator();
		while(it.hasNext()) {//Mientras quede alguno
			System.out.println(it.next());//Imprime el siguiente
		}

	}
	/*Método q recibe 2 colecciones de elementos de eneteros
	 * y devuelve un conjunto con los números comunes contenidos en ambas
	 * colecciones
	 */
	
	public static Set<Integer> iguales(Collection<Integer> col1,Collection<Integer> col2 ){
		Set<Integer> numeros = new HashSet<Integer>() ;
		for(Integer num : col1) {
			if(col2.contains(num)) {
			numeros.add(num);
			}
		}
		return numeros;
	}

}
