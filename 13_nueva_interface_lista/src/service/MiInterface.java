package service;

import java.util.ArrayList;
import java.util.List;

public interface MiInterface extends List<Integer> {
	
	
	//Profe.Evita el tener q definir dentro del método el tipo de lista
	static List<Integer> ofPares(int n){//n primeros números pares
		Integer[] result=new Integer[n];
		int num=0,cont=0;
		while(cont<n){
			result[cont]=num;
			num+=2;
			cont++;
		}
		return List.of(result);
	}
	
	
	static List <Integer> numerosPoitivos(int...data){//Números pares
		var result=new ArrayList<Integer>();
		for(int n:data) {
			if(n>0) {
				result.add(n);
			}
		}
		return result;
	}
}
