package pruebas;

import java.util.ArrayList;
import java.util.List;

public class TestOrdenarEnteros {

	public static void main(String[] args) {
		List <Integer> nums = new ArrayList<>(List.of(12,5,9,2,17,4));
		
		System.out.println("De < a > ");
		nums.sort((a,b) -> a - b);//De < a >
		nums.forEach(n -> System.out.println(n));
		
		
		System.out.println("De > a < ");
		nums.sort((a,b) -> b - a );//De > a <
		nums.forEach(n -> System.out.println(n));

	}

}
