package test;

import java.util.ArrayList;
import java.util.List;

public class TestRreplaceAlll {

	public static void main(String[] args) {
		List <Double> nums = new ArrayList<>(List.of(3.0,18.0,9.0,-4.0,-15.0,13.0,-8.0));
		//sustituir cada elemento por su mitad
		nums.replaceAll(n -> n /2);
		nums.forEach(n -> System.out.println(n));

	}

}
