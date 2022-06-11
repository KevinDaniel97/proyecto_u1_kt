package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.banco.modelo.Retiro;

public interface IRetiroRepository {

	//CRUD
		//C: crear/insertar
		public void insertar(Retiro r);
		
		//R: leer/buscar
		public Retiro buscar(String numeroCuentaOrigen);
		
		//U: actualizar
		public void actualizar(String numeroCuentaOrigen);
			
		//D: eliminar
		public void eliminar(String numero);
		
		public List<Retiro> consultar(String cuenta,LocalDateTime fechaInicio, LocalDateTime fechaFin);
}
