package test;

import java.util.ArrayList;
import java.util.List;

public class TestRemoveIf {

	public static void main(String[] args) {
		//List <Integer> nums = List.of(3,18,9,-4,-15,13,-8);//of genera un alista inmutable
		List <Integer> nums = new ArrayList<>(List.of(3,18,9,-4,-15,13,-8));
		nums.removeIf(n -> n < 0);
		nums.forEach(n -> System.out.println(n));

	}

}
