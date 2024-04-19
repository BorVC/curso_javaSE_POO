package pruebas;

import java.util.List;

public class test2Distinc {

	public static void main(String[] args) {
		List <Integer> nums = List.of(25,2,8,-3,4,11,-1,-22,8);
		System.out.println(nums.stream().distinct());//Devuelve Stream sin duplicados

	}

}
