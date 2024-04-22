package pruebas;

import java.util.List;

public class Test7Map {

	public static void main(String[] args) {
		List <String> cads = List.of("cadena","otras","fin","sale","casa","paraiso");
		//muestra las longitudes de todas las cadenas ,sin repetir longitudes
		cads.stream()//Stream <Stream>
		.map(n -> n.length())//Stream <Integer>
		.distinct()//Elimina repetidos
		.forEach(System.out :: println);//Imprime con referencia a métodos

	}

}
