package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Estudiante;

public class MatriculaRepositoryImpl {
	
	@Override
	public void insertar(Estudiante e) {
		// TODO Auto-generated method stub
		//Aqui se hace la insercion en la base de datos
		System.out.println("se ha insertado el estudiante: "+e);
	}

	@Override
	public Estudiante buscar(String apellido) {
		// TODO Auto-generated method stub
		//Aqui se hace la busqueda en la base de datos
		System.out.println("se ha buscado el estudiante: "+apellido);
		Estudiante e= new Estudiante();
		e.setApellido(apellido);
		return null;
	}

	@Override
	public void actualizar(Estudiante e) {
		// TODO Auto-generated method stub
		//Aqui se hace le actualiza en la base de datos
		System.out.println("se ha actualizado el estudiante: "+e);
		
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		//Aqui se hace la eliminado en la base de datos
		System.out.println("se ha eliminado el estudiante: "+cedula);
	}

}

}
