package service;

import java.time.LocalDate;
import java.time.Period;

public class Operario extends Empleado {
	
	private int nivel;
	
	

	public Operario(String nombre, int edad, LocalDate fechaIngreso, double salario, int nivel) {
		super(nombre, edad, fechaIngreso, salario);
		if(nivel <= 5 && nivel >=1) {
		this.nivel = nivel;
		}else {
			this.nivel = 1;
		}
	}
	
	public Operario() {
		super();
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
			this.setSalario(this.getSalario() + (BONO * 2));
		}
		else if(this.getEdad() > 30 || this.getNivel() > 2) {
			this.setSalario(this.getSalario() + BONO);
		}
		
	}

	public void actualizarNivel() {
		Period periodo = Period.between(getFechaIngreso(), LocalDate.now()); 
		if(periodo.getYears() > 2) {
			if(this.getNivel() < 5) {
				this.setNivel(this.getNivel() + 1);
			}
		}
		//Profesor
		/*Period period=Period.between(getFechaIngreso(), LocalDate.now().plusDays(1));
		if(period.toTotalMonths()>24&&this.nivel<5) {
			this.nivel++;
		}*/
		/*long years=ChronoUnit.YEARS.between(getFechaIngreso(), LocalDate.now().plusDays(1));
		if(years>=2&&this.nivel<5) {
			this.nivel++;
		}*/
	}

}
