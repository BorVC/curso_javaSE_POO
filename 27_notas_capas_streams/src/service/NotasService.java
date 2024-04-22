package service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class NotasService {
	ArrayList<Double> notas = new ArrayList<>();
	
	//Métodos
	//Método agregar nota
	public void agregarNota(double nota) {
		notas.add(nota);
	}
	
	//Calcular media
	public double calcularMedia() {
		/*return notas.stream().mapToDouble(n -> n).average()
				.orElse(0.0);*/
		return notas.stream().collect(Collectors.averagingDouble(n -> n));
	}
	
	//Calcular nota máxima
	public double notaMax() {
		/*return notas.stream().mapToDouble(n -> n).max()
				.orElse(0.0);*/
		return notas.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(n -> n)))
				.orElse(0.0);
	}
	
	//Calcular nota mínima
	public double notaMin() {
		return notas.stream().mapToDouble(n -> n).min()
				.orElse(0.0);
	}
	
	//Total aprobados
	public double totalAprobados() {
		//return notas.stream().filter(n -> n > 5).count();
		return notas.stream().collect(Collectors.filtering(n -> n > 5, Collectors.counting()))
				.intValue();
	}
	
	//Mostrar notas como un array
	public Double[]obtenerNotas(){
		//FORMA tradicional. Ha de devolver un array primitivo(double)
		/*//Array donde guardar las notas del ArrayList
		double [] todas = new double[notas.size()];
		//Bucle q recorre el ArrayList
		for(int i = 0; i < notas.size();i++) {
			todas[i] = notas.get(i);
		}
		return todas;*/
		
		//Utilizando función toArray.Combierte ArrayList en arry de objetos
		return notas.toArray(new Double[0]);//Devuelve array de objetos dobles
	}
}
