package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Retiro;
@Repository
public class RetiroRepositoryImpl implements IRetiroRepository{

	@Override
	public void insertar(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("se va realizar un retiro: "+r);
	}
	
	@Override
	public Retiro buscar(String numeroCuentaOrigen) {
		// TODO Auto-generated method stub
		System.out.println("Busca la cuenta bancariad del retiro "+numeroCuentaOrigen);
		Retiro cta= new Retiro();
		cta.setNumeroCuentaOrigen(numeroCuentaOrigen);
		cta.setMonto(new BigDecimal(100));
		return cta;
	}
	@Override
	public void actualizar(String numeroCuentaOrigen) {
		// Aqui hay construir los SQL´s 
		System.out.println("retiro actualizado ");
	}


	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("se ha eliminado el monto del retiro: "+numero);

	}
}
