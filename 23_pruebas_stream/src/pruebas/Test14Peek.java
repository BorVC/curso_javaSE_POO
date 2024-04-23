package pruebas;

import java.util.List;

public class Test14Peek {

	public static void main(String[] args) {
		List <Integer> nums = List.of(5,7,1,-3,8,14,-9);
		System.out.println("hay negativos?: " + nums.stream()
		.peek(n -> System.out.println(n))
		.anyMatch(n -> n < 0));//Encuentra una coincidencia y no busca mas.Solo imprime hasta ahi

	}

}
