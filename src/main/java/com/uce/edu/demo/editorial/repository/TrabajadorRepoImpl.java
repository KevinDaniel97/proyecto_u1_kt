package com.uce.edu.demo.editorial.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.editorial.Trabajador;
@Repository
public class TrabajadorRepoImpl implements ITrabajadorRepo {

	@Override
	public void insertar(Trabajador e) {
		// TODO Auto-generated method stub
		System.out.println("se ha insertado el trabajador: "+e);

	}

}
