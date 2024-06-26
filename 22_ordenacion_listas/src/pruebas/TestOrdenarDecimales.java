package pruebas;

import java.util.ArrayList;
import java.util.List;

public class TestOrdenarDecimales {

	public static void main(String[] args) {
		List<Double> nums=new ArrayList<>(List.of(4.5,4.2,4.0,4.8,4.1,4.2));
		//nums.sort((a,b)->a>b?1:-1);
		//nums.sort((a,b)->a.compareTo(b));//Método no static
		nums.sort((a,b)->Double.compare(a, b));//Método static llamado a través del nombre de la clase
		nums.forEach(n->System.out.println(n));

	}

}
