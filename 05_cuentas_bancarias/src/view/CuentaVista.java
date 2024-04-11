package view;

import java.util.Scanner;

import service.CuentaMovimientos;

public class CuentaVista {

	public static void main(String[] args) {
		static CuentaMovimientos service = new CuentaMovimientos(); 
		Scanner scn = new Scanner(System.in);
		int opcion = 0;
		do {
			presentarMenu();
			try {
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
					break;
				break;
				default:
					System.out.println("La opcoión elegida no es valida");
				}
				}catch(NumberFormatException ex) {
					System.out.println("Debe ser un valor numérico!!");
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
		double cantidad = Double.parseDouble(scn.next());
		
	}

}
