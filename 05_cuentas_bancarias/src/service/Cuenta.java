package service;

public class Cuenta {
	
	//Atributo
	private double saldo;

	public Cuenta(double saldo) {
		super();
		this.saldo = saldo;
	}
	
	public Cuenta() {
		saldo = 100;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//Métodos
	public void extraer(double cantidad) {
		saldo -=cantidad;
	}
	
	public void ingresar(double cantidad) {
		saldo +=cantidad;
	}
	
	public double obtenerSaldo() {
		return saldo;
	}
	
	
	

}
