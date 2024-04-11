package view;

import java.util.Scanner;

import model.Movimiento;
import service.CuentaMovimientos;

public class CuentaVista {
	//Objeto clase CuentaMovimientos 
	static CuentaMovimientos service = new CuentaMovimientos(0.0,0.0); 
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int opcion = 0;
		do {
			presentarMenu();
			try {
				opcion=Integer.parseInt(scn.nextLine());
				switch (opcion) {
				case 1: 
					ingreso();
				break;
				case 2: 
					retirada();
				break;
				case 3: 
					mostrarinfo();
				break;
				case 4: 
					System.out.println("Gracias. Le esperamos pronto");
				break;
				default:
					System.out.println("La opcoión elegida no es valida");
				}
				}
			catch(NumberFormatException ex) {
					System.out.println("La opción elegidad ebe ser un valor numérico!!");
			}
		}while(opcion!=4);
	}
	
	static void presentarMenu() {
		System.out.println("""
				1.- Ingreso
				2.- Extraer 
				3.- Saldo y movimientos
				4.- Salir
				
				""");
	}
	
	static void ingreso() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Cantidad a ingresar:");
		double cantidad = Double.parseDouble(scn.next());
		service.ingresar(cantidad);
		service.setLimite(service.ajustarLimite());
		
	}
	
	static void retirada() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Cantidad a retirar:");
		double cantidad = Double.parseDouble(scn.next());
		if(cantidad <= service.getLimite()) {
			service.extraer(cantidad);
			service.setLimite(service.ajustarLimite());
		}else {
		System.out.println("La cantidad que desea retirar excede el límite permitido. \nLIMITE: " + service.getLimite());
		}
	}
	
	static void mostrarinfo() {
		System.out.println("SALDO CUENTA: " + service.obtenerSaldo());
		System.out.println("LIMITE:" + service.getLimite());
		System.out.println("\nMovimientos realizados: ");
		for(Movimiento movimiento : service.obtenerMovimientos()) {
			System.out.println("\nCantidad: " + movimiento.getCantidad());
			System.out.println("Fecha: " + movimiento.getFecha());
			System.out.println("Tipo: " + movimiento.getTipo());
			System.out.println("-------------------");
		}
	}

}
