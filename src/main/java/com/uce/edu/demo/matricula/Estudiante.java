package com.uce.edu.demo.matricula;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

//metadata
@Component
public class Estudiante {

	private String nombreEstudiante;
	private String apellidoEstudiante;
	private LocalDateTime fechaNacimiento;
	
	//SET Y GET
	
	public String getNombre() {
		return nombreEstudiante;
	}
	public void setNombre(String nombre) {
		this.nombreEstudiante = nombre;
	}
	public String getApellido() {
		return apellidoEstudiante;
	}
	public void setApellido(String apellido) {
		this.apellidoEstudiante = apellido;
	}
	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
}
