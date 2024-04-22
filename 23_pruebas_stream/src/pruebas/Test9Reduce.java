package pruebas;

import java.util.List;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Test9Reduce {

	public static void main(String[] args) {
		List <Integer> nums = List.of(25,2,8,-3,4,11,-1,-22,8);
		//Suma todos los números negativos
		System.out.println(nums.stream().filter(n -> n < 0).reduce((a,b) -> a + b).orElse(0));

	}

}
