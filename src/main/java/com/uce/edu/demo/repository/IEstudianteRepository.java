package com.uce.edu.demo.repository;

import com.uce.edu.demo.matricula.Estudiante;

public interface IEstudianteRepository {
//CRUD
	//C: crear/insertar
	public void insertar(Estudiante e);
	
	//R: leer/buscar
	public Estudiante buscar(String apellido);
	
	//R: actualizar
	public void actualizar(Estudiante e);
		
	//R: eliminar
	public void eliminar(String cedula);
}
