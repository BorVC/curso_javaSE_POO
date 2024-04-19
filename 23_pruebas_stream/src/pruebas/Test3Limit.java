package pruebas;

import java.util.List;

public class Test3Limit {

	public static void main(String[] args) {
		List <Integer> nums = List.of(25,2,8,-3,4,11,-1,-22,8);
		nums.stream().distinct().limit(5).forEach(System.out::println);//REFERENCIA A MÉTODO
		nums.stream().distinct().limit(5).forEach(n -> System.out.println(n));//EXPRESIÓN LAMBDA
		
	}

}
