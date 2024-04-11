package principal;

import java.util.HashSet;
import java.util.Objects;

class Ciudad{
	//Atributos
	private String nombre;
	private int poblacion;
	
	//Constructor
	public Ciudad(String nombre, int poblacion) {
		super();
		this.nombre = nombre;
		this.poblacion = poblacion;
	}
	
	//Getter y Setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}

	//Sobreescritura método equals() para comparar los objetos dentro de la colección
	//Método equals() da siempre false 
	
	//Comparar los atributos del objeto del equals y ademas el hashCode del objeto.
	//Si no sigue utilizando el equals original
	//La comparación la realizan tanto equals como hashCode
	/*@Override
	public boolean equals(Object obj) {
		//Casting Objeto equals
		Ciudad aux = (Ciudad)obj;
		
		if(nombre.equals(aux.getNombre())&& poblacion == aux.getPoblacion()) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return nombre.length() + poblacion;
	}*/
	
	//Realizar lo mismo a través de Source de eclipse automáticamente
	@Override
	public int hashCode() {
		return Objects.hash(nombre, poblacion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ciudad other = (Ciudad) obj;
		return Objects.equals(nombre, other.nombre) && poblacion == other.poblacion;
	}

	@Override
	public String toString() {
		//Return q devuelve Source
		//return "Ciudad [nombre=" + nombre + ", poblacion=" + poblacion + "]";
		
		//Return profe con Json
		return "{\"nombre\":"+nombre+",\"poblacion\":"+poblacion+"}"; 
	}
	
	

}

public class Test {

	public static void main(String[] args) {
		HashSet<Ciudad> ciudades=new HashSet<Ciudad>();
		ciudades.add(new Ciudad("ciudadA",20000));
		ciudades.add(new Ciudad("ciudadB",35000));
		ciudades.add(new Ciudad("ciudadA",20000));
		System.out.println("Ciudades dentro del HashSet " + ciudades.size());
		
		for(Ciudad ciudad : ciudades) {
			//System.out.println(ciudad.getNombre() + "-" + ciudad.getPoblacion());
			System.out.println("Método toString sobreescrito: " + ciudad);//Objeto con método sobreescrito toString
		}
		
		System.out.println("Método toString sobreescrito: " + ciudades);//Colección con método sobreescrito toString
		

	}

}

