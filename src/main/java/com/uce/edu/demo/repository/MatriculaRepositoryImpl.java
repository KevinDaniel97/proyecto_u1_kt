package com.uce.edu.demo.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Matricula;

@Repository
public class MatriculaRepositoryImpl implements IMatriculaRepository{
	
	@Override
	public void insertar(Matricula mt) {
		// TODO Auto-generated method stub
		//Aqui se hace la insercion en la base de datos
		System.out.println("se ha insertado la matricula: "+mt);
	}

	@Override
	public Matricula buscar(String numero) {
		// TODO Auto-generated method stub
		//Aqui se hace la busqueda en la base de datos
		System.out.println("se ha buscado la matricula: "+numero);
		Matricula mt= new Matricula();
		mt.setNumero(numero);
		return mt;
	}

	@Override
	public void actualizar(Matricula mt) {
		// TODO Auto-generated method stub
		//Aqui se hace le actualiza en la base de datos
		System.out.println("se ha actualizado la matricula: "+mt);
		
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		//Aqui se hace la eliminado en la base de datos
		System.out.println("se ha eliminado la matricula: "+numero);
	}



}
