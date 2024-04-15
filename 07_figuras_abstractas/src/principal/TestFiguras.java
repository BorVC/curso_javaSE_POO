package principal;

import service.Circulo;
import service.Figura;
import service.Operaciones;
import service.Triangulo;

public class TestFiguras {

	public static void main(String[] args) {
		// Crear triángulo y círculo con color y propiedades cualquiera,y 
		//después mostrar color y area de cualquiera
		Circulo cr = new Circulo ("amarillo",5);
		Triangulo tr = new Triangulo("marrón",5,8);
		System.out.println("Color: " + cr.getColor());
		System.out.println("Area: " + cr.area());
		System.out.println("Color: " + tr.getColor());
		System.out.println("Area: " + tr.area());
		
		//Polimorfismo . Método q recibe como pará,etro objeto de la superclase
		System.out.println("FUNCIÓN");
		info(cr);
		info(tr);
		
		//Lamada a método q recibe interfaz
		operar(tr);//Se puede pasar un objeto triángulo q implementa la interfaz Operaciones
		//operar(cr) NO sería posible xq Círculo no implementa la interfaz Operaciones

		
		
	}
	
	public static void info(Figura fg) {//Polimorfismo
		System.out.println("Color: " + fg.getColor());
		System.out.println("Area: " + fg.area());
	}
	
	public static void operar(Operaciones op) {//Polimorfismo interface
		op.girar(100);
		System.out.println(op.invertir());
	}

}
