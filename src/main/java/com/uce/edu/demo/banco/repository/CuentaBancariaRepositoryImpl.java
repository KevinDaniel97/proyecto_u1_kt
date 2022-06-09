package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;

@Repository
public class CuentaBancariaRepositoryImpl implements ICuentaBancariaRepository{


	@Override
	public void insertar(CuentaBancaria c) {
		// TODO Auto-generated method stub
		System.out.println("se ha insertado una cuenta Bancaria: "+c);

	}
	
	@Override
	public CuentaBancaria buscar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Se busca la cuenta bancaria "+numero);
		CuentaBancaria cta= new CuentaBancaria();
		cta.setNumero(numero);
		cta.setSaldo(new BigDecimal(100));
		return cta;
	}
	@Override
	public void actualizar(CuentaBancaria c) {
		// Aqui hay construir los SQL´s 
		System.out.println("cuenta bancaria actualizada a: "+c);
	}


	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("se ha eliminado el la cuenta bancaria: "+numero);

	}

}
