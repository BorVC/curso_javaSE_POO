package pruebas;

import java.util.ArrayList;
import java.util.List;

public class TestOrdenarTextos {

	public static void main(String[] args) {
		List<String> textos = new ArrayList<String>(List.of("hello","by","args"));
		textos.sort((a,b) -> a.compareTo(b));
		System.out.println("Ordenar de < a >");
		textos.forEach(t -> System.out.println(t));
		
		textos.sort((a,b) -> b.compareTo(a));
		System.out.println("Ordenar de > a <");
		textos.forEach(t -> System.out.println(t));

	}

}
