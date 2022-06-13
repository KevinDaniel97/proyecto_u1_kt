package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.uce.edu.demo.banco.modelo.Transferencia;

@Repository
public class TransferenciaRepositoryImpl implements ITransferenciaRepository {

	@Override
	public void insertar(Transferencia t) {
		// TODO Auto-generated method stub
		System.out.println("Aqui se inserta la transferencia en la base de datosa" + t);
	}

	@Override
	public Transferencia buscar(String numeroCuentaOrigen) {
		// TODO Auto-generated method stub
		System.out.println("Se busca el deposito de la cuenta "+numeroCuentaOrigen);
		Transferencia cta= new Transferencia();
		cta.setNumeroCuentaOrigen(numeroCuentaOrigen);;
		cta.setMontoTransferir(new BigDecimal(100));
		return cta;
	}

	@Override
	public void actualizar(String numeroCuentaOrigen) {
		// TODO Auto-generated method stub
		System.out.println("transferencia actualizada");

	}

	@Override
	public void eliminar(String numeroCuentaOrigen) {
		// TODO Auto-generated method stub
		System.out.println("se ha eliminado el deposito de la cuenta: "+numeroCuentaOrigen);

	}

	@Override
	public List<Transferencia> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		//aqui deberia estar el SQL a la base
		List<Transferencia> listaConsultada= new ArrayList<>();
		Transferencia trans1= new Transferencia();
		trans1.setFechaTransferencia(LocalDateTime.now());
		trans1.setMontoTransferir(new BigDecimal(100));
		trans1.setNumeroCuentaOrigen("1234");
		trans1.setNumeroCuentaDestino("12323");
		
		listaConsultada.add(trans1);
		return listaConsultada;
	}

}
