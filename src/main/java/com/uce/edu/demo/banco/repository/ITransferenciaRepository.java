package com.uce.edu.demo.banco.repository;


import com.uce.edu.demo.banco.modelo.Transferencia;

public interface ITransferenciaRepository {
	
	//CRUD
	//C: crear/insertar
	public void insertar(Transferencia t);
	
	//R: leer/buscar
	public Transferencia buscar(String numeroCuentaOrigen);
	
	//U: actualizar
	public void actualizar(String numeroCuentaOrigen);
		
	//D: eliminar
	public void eliminar(String numeroCuentaOrigen);
}
