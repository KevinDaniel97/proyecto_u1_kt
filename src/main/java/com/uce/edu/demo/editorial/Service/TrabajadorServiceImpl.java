package com.uce.edu.demo.editorial.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.editorial.Trabajador;
import com.uce.edu.demo.editorial.repository.ITrabajadorRepo;
@Service
public class TrabajadorServiceImpl implements ITrabajadorService {

	@Autowired
	private ITrabajadorRepo trabajadorteRepo;
	
	@Override
	public void ingresarTrabajador(Trabajador e) {
		// TODO Auto-generated method stub
	this.trabajadorteRepo.insertar(e);
	}

}
