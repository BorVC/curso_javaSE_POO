package pruebas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test12FlatMap {

	public static void main(String[] args) {
		List<Integer[]> nums=List.of(new Integer[] {3,7,5,2,9},
				new Integer[] {8,3,4},
				new Integer[] {9,2,5,6,1,4,8},
				new Integer[] {7,5,4}); 
		
		//nota media de todos los alumnos del centro
		System.out.println(nums.stream()//Strem<Integer[]>
		.flatMap(a -> Arrays.stream(a))//De cada Array genera un Stream<Integer>
		.collect(Collectors.averagingInt(n -> n)));

	}

}
