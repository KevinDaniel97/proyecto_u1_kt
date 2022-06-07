package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.repository.IEstudianteRepository;
import com.uce.edu.demo.repository.IMatriculaRepository;

public class MatriculaServiceImpl {

	@Autowired
	private IMatriculaRepository matriculaRepository;
	
	public void ingresarEstudiante(Estudiante e) {
		// TODO Auto-generated method stub
		this.matriculaRepository.insertar(m);
	}

	@Override
	public Estudiante Matricula(String apellido) {
		// TODO Auto-generated method stub
		return this.Matricula(numero);
	}

	@Override
	public void actualizarMatricula(Matricula e) {
		// TODO Auto-generated method stub
		this.matriculaRepository.actualizar(e);
		
	}

	@Override
	public void borrarMatricula(String numero) {
		// TODO Auto-generated method stub
		this.matriculaRepository.eliminar(numero);
	}
}
