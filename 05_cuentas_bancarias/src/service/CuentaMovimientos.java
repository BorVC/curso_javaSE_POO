package service;

import java.time.LocalDate;
import java.util.ArrayList;

import model.Movimiento;
public class CuentaMovimientos extends CuentaLimite {
	//Atributo
	ArrayList<Movimiento> movimientos= new ArrayList<>();

	//Constructor
	public CuentaMovimientos(double saldo, double limite) {
		super(saldo, limite);
	}
	
	
	
	public CuentaMovimientos() {
		
	}



	//Sobreescribir de métodos para añadir 
	@Override
	public void extraer(double cantidad) {
		Movimiento movimiento = new Movimiento(cantidad,LocalDate.now(),"extracción");
		movimientos.add(movimiento);
		super.extraer(cantidad);
	}
	
	@Override
	public void ingresar(double cantidad) {
		Movimiento movimiento = new Movimiento(cantidad,LocalDate.now(),"ingreso");
		movimientos.add(movimiento);
		super.ingresar(cantidad);
	}

	public ArrayList<Movimiento> obtenerMovimientos(){
		return movimientos;
	}

	


}
