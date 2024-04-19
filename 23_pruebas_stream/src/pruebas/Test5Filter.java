package pruebas;

import java.util.List;

public class Test5Filter {

	public static void main(String[] args) {
		List <Integer> nums = List.of(25,2,8,-3,4,11,-1,-22,8);
		System.out.println(nums.stream().filter(n -> n > 0).distinct().count());

	}

}
