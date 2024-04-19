package pruebas;

import java.util.List;

public class Test4Match {

	public static void main(String[] args) {
		List <Integer> nums = List.of(25,2,8,-3,4,11,-1,-22,8);
		//¿Hay algún número negativo?
		System.out.println("¿Hay algún número negativo?");
		System.out.println(nums.stream().anyMatch(n -> n < 0));
		//Son todos pares?
		System.out.println("Son todos pares?");
		System.out.println(nums.stream().allMatch(n -> n%2 == 0));

	}

}
