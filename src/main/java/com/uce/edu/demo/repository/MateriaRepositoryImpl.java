package com.uce.edu.demo.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Materia;

@Repository
public class MateriaRepositoryImpl implements IMateriaRepository{

	@Override
	public void insertar(Materia m) {
		// TODO Auto-generated method stub
		//Aqui se hace la insercion en la base de datos
		System.out.println("se ha insertado la materia: "+m);
	}

	@Override
	public Materia buscar(String nombre) {
		// TODO Auto-generated method stub
		//Aqui se hace la busqueda en la base de datos
		System.out.println("se ha buscado la materia: "+nombre);
		Materia m= new Materia();
		m.setNombre(nombre);
		return m;
	}

	@Override
	public void actualizar(Materia m) {
		// TODO Auto-generated method stub
		//Aqui se hace le actualiza en la base de datos
		System.out.println("se ha actualizado la materia: "+m);
		
	}

	@Override
	public void eliminar(String nombre) {
		// TODO Auto-generated method stub
		//Aqui se hace la eliminado en la base de datos
		System.out.println("se ha eliminado la materia: "+nombre);
	}


}
