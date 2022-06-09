package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;

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

}
