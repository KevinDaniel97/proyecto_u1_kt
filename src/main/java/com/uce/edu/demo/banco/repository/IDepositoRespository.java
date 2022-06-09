package com.uce.edu.demo.banco.repository;

import com.uce.edu.demo.banco.modelo.Deposito;

public interface IDepositoRespository {


	//CRUD
	//C: crear/insertar
	public void insertar(Deposito d);
	
	//R: leer/buscar
	public Deposito buscar(String numeroCuentaDestino);
	
	//U: actualizar
	public void actualizar(String numeroCuentaDestino);
		
	//D: eliminar
	public void eliminar(String numeroCuentaDestino);
}
