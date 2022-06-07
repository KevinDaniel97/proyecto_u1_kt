package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;

public interface IMateriaService {

	public void ingresarMateria(Materia e);
	
	
	public Materia buscarMateria(String apellido);
	

	public void actualizarMateria(Materia e);
		

	public void borrarMateria(String nombre);
}
