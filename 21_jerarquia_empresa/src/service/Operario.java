package service;

import java.time.LocalDate;

public class Operario extends Empleado {
	
	private int nivel;
	
	

	public Operario(String nombre, int edad, LocalDate fechaIngreso, double salario, int nivel) {
		super(nombre, edad, fechaIngreso, salario);
		this.nivel = nivel;
	}
	
	
	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	@Override
	public void incentivar() {
		if(this.getEdad() > 30 && this.getNivel() > 2) {
			this.setSalario(BONO);
		}
		
	}
	
	public void actualizarNivel() {
		LocalDate fecha = 
		if(this.getFechaIngreso().compareTo(LocalDate.now() > )) {
			if(this.getNivel() < 5) {
				this.setNivel(5);
			}
		}
	}

}
