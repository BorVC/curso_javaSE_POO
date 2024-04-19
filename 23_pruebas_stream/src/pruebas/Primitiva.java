package pruebas;

import java.util.stream.Stream;

public class Primitiva {

	public static void main(String[] args) {
		Stream.generate(() -> (int)(Math.random() * 49 + 1)).distinct().limit(6).forEach(n -> System.out.println(n));

	}

}
