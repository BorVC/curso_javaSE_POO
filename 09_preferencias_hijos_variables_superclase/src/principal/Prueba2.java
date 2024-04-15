package principal;

public class Prueba2 {

	public static void main(String[]args) {
		Object ob = "hello";//Object Superclase de String
		String s = (String)ob;//Casting del objeto Object a objeto String.Hay relación de herencia
		
		String n = "100";
		//Integer in = (Integer)n;//error de compilación xq no hay relación de herencia
		
		System.out.println(ob);
		System.out.println(s);
	}
}
