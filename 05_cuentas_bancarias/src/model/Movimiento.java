package model;

import java.time.LocalDate;

public class Movimiento {
	//Atributos
	private double cantidad;
	private LocalDate fecha;
	private String tipo;
	
	//Constructores
	public Movimiento(double cantidad, LocalDate fecha, String tipo) {
		super();
		this.cantidad = cantidad;
		this.fecha = fecha;
		this.tipo = tipo;
	}

	public Movimiento() {
		super();
	}

	//Gettre y Setter
	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	
	
	

}
