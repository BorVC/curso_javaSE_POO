package pruebas;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test10Partition {

	public static void main(String[] args) {
		List <Integer> nums = List.of(25,2,8,-3,4,11,-1,-22,8);
		
		Map <Boolean,List<Integer>> tabla = nums.stream()
				.collect(Collectors.partitioningBy(n -> n > 0));//Lista true con los positivos
		
		Map <Boolean,Integer> tabla1 = nums.stream()
				.collect(Collectors.partitioningBy(n -> n > 0,
						 Collectors.summingInt(n -> n)));//n -> n se refiere así mismo
		
		

	}

}
