package service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.Cuenta;

public class CuentasService extends Cuenta{

	List<Cuenta> cuentas=new ArrayList<Cuenta>(List.of(
			new Cuenta("ES1420800222823000247854",
		            "Fernando López Gómez", LocalDate.parse("2018-04-14"),
		            "EUR", Double.valueOf("125477.44")),
		    new Cuenta("ES3520800014523000687719",
		            "Marcos Pérez Sánchez", LocalDate.parse("1998-10-01"),
		            "EUR", Double.valueOf("9465.59")),		
		    new Cuenta("ES4720800136253000145866",
		            "Francisco González Fernández", LocalDate.parse("2000-11-03") ,
		            "JPY", 3258745.7),
		   new Cuenta("8747-369", "Kenji Nakamura",
				   LocalDate.parse("1984-06-17") , "JPY", 985471.4))); 
	
	//método q a partir de número de cuenta nos inidica si existe o no dicha cuenta
	
	public boolean existeCuenta(String numCuenta) {
		return cuentas.stream().anyMatch(c -> c.getNumeroCuenta().equals(numCuenta));
	}
	
	//método q a partir de divisa nos dice cuantas cuentas hay de dicha cuenta
	public int cuentasPorDivisa(String divisa) {
		return (int)cuentas.stream().filter(c -> c.getDivisa().equals(divisa)).count();
	}
	
	//método q a partir de una fecha indique cuantas cuentas se crearon desde esa fecha
}
