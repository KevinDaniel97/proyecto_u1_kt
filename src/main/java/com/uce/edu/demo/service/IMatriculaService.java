package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Matricula;

public interface IMatriculaService {

	public void ingresarMatricula(Matricula mt);
	
	
	public Matricula buscarMatricula(String numero);
	

	public void actualizarMatricula(Matricula mt);
		

	public void borrarMatricula(String numero);
}
