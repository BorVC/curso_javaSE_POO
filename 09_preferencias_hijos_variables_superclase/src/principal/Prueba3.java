package principal;

public class Prueba3 {

	public static void main(String[] args) {
		Object s  ="100";//Si s fuera 100 y no "100" si lo haría.Objeto de tipo String
		Integer n = (Integer)s;
		System.out.println(n);//Error.ClassCastException.Bien en compilación ,eror en ejecución
		
		
		Number d = 4.5;//Objeo de tipo double
		Integer r = (Integer)d;
		System.out.println(r);//Error.ClassCastException.Bien en compilación ,eror en ejecución

		
	}

}
