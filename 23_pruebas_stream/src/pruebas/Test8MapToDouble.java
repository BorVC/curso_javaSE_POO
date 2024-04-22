package pruebas;

import java.util.List;

public class Test8MapToDouble {

	public static void main(String[] args) {
		List <Integer> nums = List.of(25,2,8,-3,4,11,-1,-22,8);
		//suma de todos los números negativos
		System.out.println(nums.stream().filter(n -> n < 0)
		.mapToInt(n -> n)
		.sum())
		;
		
		//media de los positivos sin duplicado
		nums.stream().filter(n -> n < 0)//Stream <Integer>
				.distinct()//Stream <Integer>
				.mapToInt(n -> n)//IntStream
				.average()
				.ifPresentOrElse(resultado -> System.out.println(resultado),() -> System.out.println("No hay media"));//OpcionalDouble
		
	}

}
