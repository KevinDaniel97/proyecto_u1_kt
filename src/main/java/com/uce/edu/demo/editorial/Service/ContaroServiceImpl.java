package com.uce.edu.demo.editorial.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.editorial.Contrato;
import com.uce.edu.demo.editorial.Director;
import com.uce.edu.demo.editorial.Editor;
import com.uce.edu.demo.editorial.repository.IContratoRepo;

@Service
public class ContaroServiceImpl implements IContratoService {
	
	@Autowired
	private IContratoRepo iContratoRepo;
	@Autowired
	private Director director;
	@Autowired
	private Editor editor;
	


	@Override
	public void ingresarContrato(Contrato mt) {
		// TODO Auto-generated method stub
		System.out.println("DI desde Service Singleton "+this.director);
		System.out.println("DI desde Service Prototype "+this.editor);
		this.iContratoRepo.insertar(mt);
	}
}
