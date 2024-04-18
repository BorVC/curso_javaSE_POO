package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import service.FuncionalesService;

public class Test {

	public static void main(String[] args) {
		// Realizar una llamada a cada método de service
		FuncionalesService service = new FuncionalesService();
		
		service.m1( Set.of(4,2,5,6),(String a) -> Integer.getInteger(a));
		service.m2(() -> "Hola que tal", (Integer a) -> System.out.println(a));
		service.m3((Double a,Double b) -> (a > b) ? a : b, (Integer a,String b) -> Integer.parseInt(b) + a);
		service.m4((a,b) -> System.out.println(a+b),(a,b) -> a.length() > b);
		service.m5(() -> 10, List.of("Buenas") );
		service.m6(Map.of("a",10,"b",2), (a,b) -> System.out.println(a + b));
		service.m7((a) -> List.of(a.length(),5,1));
		
	}

}
