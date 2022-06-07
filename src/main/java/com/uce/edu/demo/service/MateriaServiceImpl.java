package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.repository.IMateriaRepository;

public class MateriaServiceImpl {
	
	@Autowired
	private IMateriaRepository materiaRepository;
	
	public void ingresarEstudiante(Estudiante e) {
		// TODO Auto-generated method stub
		this.materiaRepository.insertar(e);
	}

	@Override
	public Estudiante buscarMateria(String nombre) {
		// TODO Auto-generated method stub
		return this.buscarMateria(nombre);
	}

	@Override
	public void actualizarMateria(Materia m) {
		// TODO Auto-generated method stub
		this.materiaRepository.actualizar(e);
		
	}

	@Override
	public void borrarMateria(String nombre) {
		// TODO Auto-generated method stub
		this.materiaRepository.eliminar(nombre);
	}

}
