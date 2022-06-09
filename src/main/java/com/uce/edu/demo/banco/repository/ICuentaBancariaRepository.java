package com.uce.edu.demo.banco.repository;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;

public interface ICuentaBancariaRepository {


	//CRUD
		//C: crear/insertar
		public void insertar(CuentaBancaria c);
		
		//R: leer/buscar
		public CuentaBancaria buscar(String numero);
		
		//U: actualizar
		public void actualizar(CuentaBancaria c);
			
		//D: eliminar
		public void eliminar(String numero);
		
}
