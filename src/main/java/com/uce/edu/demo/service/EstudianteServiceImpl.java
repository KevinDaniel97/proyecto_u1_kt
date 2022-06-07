package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.repository.IEstudianteRepository;

@Service
public class EstudianteServiceImpl implements IEstudianteService{

	@Autowired
	private IEstudianteRepository estudianteRepository;
	
	public void ingresarEstudiante(Estudiante e) {
		// TODO Auto-generated method stub
		this.estudianteRepository.insertar(e);
	}

	@Override
	public Estudiante buscarPorApellido(String apellido) {
		// TODO Auto-generated method stub
		return this.buscarPorApellido(apellido);
	}

	@Override
	public void actualizarEstudiante(Estudiante e) {
		// TODO Auto-generated method stub
		this.estuRepository.actualizar(e);
		
	}

	@Override
	public void borrarEstudiante(String cedula) {
		// TODO Auto-generated method stub
		this.estuRepository.eliminar(cedula);
	}

}