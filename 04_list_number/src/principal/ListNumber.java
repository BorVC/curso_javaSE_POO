package principal;

import java.util.ArrayList;

public class ListNumber extends ArrayList<Integer>{
	//Atributo
	private Integer number;
	
	//Constructor
	public ListNumber() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	//Gettr y Setter
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


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
