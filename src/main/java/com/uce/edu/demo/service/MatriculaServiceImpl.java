package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.modelo.ProfesorGeneral;
import com.uce.edu.demo.modelo.ProfesorMateria;
import com.uce.edu.demo.repository.IMatriculaRepository;

@Service
public class MatriculaServiceImpl implements IMatriculaService{

	@Autowired
	private IMatriculaRepository iMatriculaRepository;
	
	@Autowired
	private ProfesorGeneral profesorGeneral;
	@Autowired
	private ProfesorMateria profesorMateria;
	
	@Lookup
	public ProfesorGeneral obtenerProfesorG() {
		System.out.println("*****************");
		return null;
	}
	
	@Lookup
	public ProfesorMateria obtenerProfesorM() {
		ProfesorMateria profeM= new ProfesorMateria();
				profeM.setApellido("Tapia");
				profeM.setNombre("Jose");
				System.out.println("*****************");
				return profeM;
	}
	public void ingresarMatricula(Matricula mt) {
		// TODO Auto-generated method stub
		System.out.println("DI desde Service Singleton "+this.profesorGeneral);
		System.out.println("DI desde Service Prototype "+this.profesorMateria);
		System.out.println("DI un metodo General "+this.obtenerProfesorG());
		System.out.println("DI un metodo Materia "+this.obtenerProfesorM());

		this.iMatriculaRepository.insertar(mt);
		
	}

	@Override
	public Matricula buscarMatricula(String numero) {
		// TODO Auto-generated method stubb
		return this.iMatriculaRepository.buscar(numero);
	}

	@Override
	public void actualizarMatricula(Matricula mt) {
		// TODO Auto-generated method stub
		this.iMatriculaRepository.actualizar(mt);
	}

	@Override
	public void borrarMatricula(String numero) {
		// TODO Auto-generated method stub
		this.iMatriculaRepository.eliminar(numero);
	}
}
