package service;

public class CuentaLimite extends Cuenta{
	private double limite;

	public CuentaLimite(double saldo, double limite) {
		super(saldo);
		this.limite = limite;
	}
	
	public CuentaLimite(double limite) {
		this.limite = limite;
	}
	
	public CuentaLimite() {
		limite = 50;//Ajusta el límite por defecto si no se asigna ninguno
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	@Override
	public void extraer(double cantidad) {
		if(cantidad < limite) {//No s puede sacar mas de la mitad de lo que tenga la cuenta
		super.extraer(cantidad);
		}
	}
	
	public void ajustarLimite() {
		limite = getSaldo() / 2;//
		
	}

	
	
	
	

}
