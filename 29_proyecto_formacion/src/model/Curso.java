package model;

import java.time.LocalDate;
import java.util.List;

public class Curso {

	private String nombre;
	private String tematica;
	private double precio;
	private LocalDate fechaInicio;
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	private LocalDate fechaFin;
	private List <Alumno> alumnos;
	
	public Curso(String nombre, String tematica, double precio, LocalDate fechaInicio, LocalDate fechaFin,
			List<Alumno> alumnoMatriculados) {
		super();
		this.nombre = nombre;
		this.tematica = tematica;
		this.precio = precio;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.alumnos = alumnoMatriculados;
	}

	public Curso() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTematica() {
		return tematica;
	}

	public void setTematica(String tematica) {
		this.tematica = tematica;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public List<Alumno> getAlumnoMatriculados() {
		return alumnos;
	}

	public void setAlumnoMatriculados(List<Alumno> alumnoMatriculados) {
		this.alumnos = alumnoMatriculados;
	}
	
	
	
	
}
