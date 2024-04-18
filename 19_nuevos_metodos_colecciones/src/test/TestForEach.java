package test;

import java.util.List;

public class TestForEach {

	public static void main(String[] args) {
		List <Integer> nums = List.of(3,18,9);
		/*for(Integer num : nums) {
			System.out.println(num);
		}*/
		//Programación funcional foreach
		nums.forEach(num -> System.out.println(num));

	}

}
