package curso.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LectorTeclado extends BufferedReader{//Hereda todo lo q tiene la clase BufferReader
	/*EJERCICIOS
	crear una clase para lectura de datos por teclado.
	MÉTODOS:
	-readString()
	-readInt();
	-readDouble();*/
	
	//Crear un constructor sin parámetros
	public LectorTeclado() {
		super (new InputStreamReader(System.in));//Heredando un objeto  InputStreamReader para poder leer de teclado  
	}
	
	//Métodos de la clase
	public String readString () {
		try {
			return readLine();//Hereda el método de la clase BufferReader
		} catch (IOException e) {
			e.printStackTrace();
			return null;//Si falla la lectura
		}
	}
	
	public int readInt() {
		try {
			return Integer.parseInt(readLine());//Hereda el método readLine() de la clase BufferReader
		} catch (IOException e) {
			e.printStackTrace();
			return 0;//Si falla la lectura
		}
	}
	
	public double readDouble() {
		try {
			return Double.parseDouble(readLine());//Hereda el método readLine() de la clase BufferReader
		} catch (IOException e) {
			e.printStackTrace();
			return 0.0;//Si falla la lectura
		}
	}
}
