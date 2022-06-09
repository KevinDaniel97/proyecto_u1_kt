package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Deposito;

@Repository
public class DepositoRespositoryImpl implements IDepositoRespository{
	
	@Override
	public void insertar(Deposito d) {
		// TODO Auto-generated method stub
		System.out.println("se ha insertado una Deposito: "+d);

	}
	
	@Override
	public Deposito buscar(String numeroCuentaDestino) {
		// TODO Auto-generated method stub
		System.out.println("Se busca el deposito de la cuenta "+numeroCuentaDestino);
		Deposito cta= new Deposito();
		cta.setNumeroCuentaDestino(numeroCuentaDestino);
		cta.setMonto(new BigDecimal(200));
		return cta;
		
	}
	@Override
	public void actualizar(String numeroCuentaDestino) {
		// Aqui hay construir los SQL´s 
		System.out.println("deposito actualizado");
	}


	@Override
	public void eliminar(String numeroCuentaDestino) {
		// TODO Auto-generated method stub
		System.out.println("se ha eliminado el deposito de la cuenta: "+numeroCuentaDestino);

	}

}
