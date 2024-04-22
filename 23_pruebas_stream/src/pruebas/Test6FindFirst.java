package pruebas;

import java.util.List;

public class Test6FindFirst {

	public static void main(String[] args) {
		List <Integer> nums = List.of(25,2,8,-3,4,11,-1,-22,8);
		//mostrar primer negativo
		nums.stream().filter(n -> n < 0).findFirst()
		.ifPresentOrElse(n -> System.out.println(n), () -> System.out.println("No hay negativos"));

	}

}
