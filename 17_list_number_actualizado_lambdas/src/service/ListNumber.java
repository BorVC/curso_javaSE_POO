package service;

import java.util.ArrayList;
import java.util.Iterator;

public class ListNumber extends ArrayList<Integer>{
	//Atributo
	private Integer number;
	
	//Constructor
	public ListNumber() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	//Getter y Setter
	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}
	
	//Métodos
	public Integer first() {
		if(size() == 0) {
			return null;
		}
		return get(0);
	}
	
	public Integer last() {
		if(size() == 0) {
			return null;
		}
		return get(size() - 1);
	}
	
	public int suma() {
		int suma = 0;
		/*for(int i = 0; i < size(); i++) {
			suma += get(i);
		}*/
		
		for(Integer n : this) {//Se refiere al objeto ArrayList
			suma += n;
		}
		return suma;
	}
	
	@Override
	public boolean add(Integer e) {
		if(!contains(e)) {
			return super.add(e);
		}
		return false;
	}
	
	//nuevo método eliminarNUmeros: eliminar cualquier grupo de números  
	//en base a una condición
	public void remove(Condicion condicion) {
			/*for(Integer num : this) {
				if(condicion.test(num)) {
					this.remove(num);
				}
			}*///Dará error xq elimina el elemento pero queda la posición
		
		//Utilizar Iterator()
		Iterator<Integer> it = iterator();//Objeto Iterator para llamar a  métodos Iterator
		while(it.hasNext()) {//Mientras haya un siguiente
			if(condicion.test(it.next())) {
				it.remove();
			}
		}
	}
	
	//método transformar cada número de la lista en otro. Debería ser
	//capaz de transformar cada número en su cuadrado,en la mitad,
	//en su raíz cúbica,etc.....
	public void transformer(Operacion operacion) {
		for(int i = 0; i <size(); i++) {
			this.set(i, operacion.operar(get(i)));
		}
	}

}
