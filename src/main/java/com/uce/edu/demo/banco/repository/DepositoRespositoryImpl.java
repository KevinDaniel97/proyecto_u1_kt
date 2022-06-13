package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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
	@Override
	public List<Deposito> consultar (String cuenta, LocalDateTime fechaInoiicio, LocalDateTime FechaFin){
		// TODO Auto-generated method stub
		List<Deposito> listaDepositos = new ArrayList<>();
	    Deposito depo1 = new Deposito();
	    depo1.setFecha(LocalDateTime.of(2021,2,10,8,50,2));
	    depo1.setMonto(new BigDecimal(20));
	    depo1.setNumeroCuentaDestino("124560");

	    listaDepositos.add(depo1);
	    
	    Deposito depo2 = new Deposito();
	    depo2.setFecha(LocalDateTime.of(2021,3,15,9,31,5));
	    depo2.setMonto(new BigDecimal(50));
	    depo2.setNumeroCuentaDestino("124560");

	    listaDepositos.add(depo2);
	 
	    return listaDepositos;
		
	}

}
