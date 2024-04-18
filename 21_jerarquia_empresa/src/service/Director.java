package service;

import java.time.LocalDate;

public class Director extends Empleado {

	public String departamento;
	public int personal;
	
	public Director(String nombre, int edad, LocalDate fechaIngreso, double salario, String departamento,
			int personal) {
		super(nombre, edad, fechaIngreso, salario);
		this.departamento = departamento;
		this.personal = personal;
	}
	
	public Director() {
		super();
	}
	
	public Director(String nombre, int edad, LocalDate fechaIngreso, double salario) {
		super(nombre, edad, fechaIngreso, salario);
	}
	
	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public int getPersonal() {
		return personal;
	}

	public void setPersonal(int personal) {
		this.personal = personal;
	}

	@Override
	public void incentivar() {
		
		if(getPersonal() > 20 && )
		
	}
	
	
	
	
	

}
