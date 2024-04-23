package pruebas;

import java.util.List;

public class Test13Peek {

	public static void main(String[] args) {
		List <Integer> nums = List.of(11,4,5,8);
		//muestra cada número de la lista sin contar duplicados y despues el total
		System.out.println("Total: "+nums.stream()
				.distinct()
				.peek(n->System.out.println("Número: "+ n))//Strean<Integer>
				.count());

	}

}
