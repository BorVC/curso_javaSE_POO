package principal;

import service.Punto3D;

public class Test {

	public static void main(String[] args) {
		Punto3D p1  =new Punto3D(25);//Crea el objeto Punto3D CON CONSTRUCTOR DE SU PROPIA CLASE.
		
		Punto3D p2 = new Punto3D(3,15,25);//Crea un objeto llamando al constructor heredado de la clase Punto(Sobrecarga de constructores)
		p1.imprimir();//El objeto llama a un método heredado de la clase Punto cuyyos valores ya han sido definidos en dicha clase porque también hereda sus vaiables

	}

}
