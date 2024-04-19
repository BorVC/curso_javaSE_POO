package model;

import java.time.LocalDate;

public class Cuenta {

	private String numeroCuenta;
	private String titular;
	private LocalDate fechaApertura;
	private String divisa;
	private double saldo;
	
	public Cuenta(String numeroCuenta, String titular, LocalDate fechaApertura, String divisa, double saldo) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.titular = titular;
		this.fechaApertura = fechaApertura;
		this.divisa = divisa;
		this.saldo = saldo;
	}
	
	public Cuenta() {
		super();
	}
	
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public LocalDate getFechaApertura() {
		return fechaApertura;
	}
	public void setFechaApertura(LocalDate fechaApertura) {
		this.fechaApertura = fechaApertura;
	}
	public String getDivisa() {
		return divisa;
	}
	public void setDivisa(String divisa) {
		this.divisa = divisa;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
