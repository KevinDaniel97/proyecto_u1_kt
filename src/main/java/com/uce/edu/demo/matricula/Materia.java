package com.uce.edu.demo.matricula;

import org.springframework.stereotype.Component;

//metadata
@Component
public class Materia {

	private String nombreMateria;
	private int semestre;
	
	//SET Y GET 
	
	public String getNombreMateria() {
		return nombreMateria;
	}
	public void setNombreMateria(String nombreMateria) {
		this.nombreMateria = nombreMateria;
	}
	public int getSemestre() {
		return semestre;
	}
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	

	
	
}
