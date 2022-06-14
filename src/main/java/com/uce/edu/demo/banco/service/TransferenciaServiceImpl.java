package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Transferencia;
import com.uce.edu.demo.banco.repository.ITransferenciaRepository;

@Service
public class TransferenciaServiceImpl implements ITransferenciaService{
	
	//Como la logica de CuentaBancariaService no hace nada\
	//si puedo inyectar el Cuenta BnacariaRepository
	

	@Autowired
	@Qualifier("ahorros")
	private ICuentaBancariaService bancariaService;
	@Autowired
	private ITransferenciaRepository iTranferenciaRepository;
	@Autowired
	private IDepositoService depositoRepository;
	@Autowired
	private IRetiroService iRetiroRepository;
	
	
	
	@Override
	public void realizarTransferencia(String ctaOrigen, String ctaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		CuentaBancaria cOrigen = this.bancariaService.buscar(ctaOrigen);
		BigDecimal saldoOrigen = cOrigen.getSaldo();
		BigDecimal nuevoSaldoOrigen = saldoOrigen.subtract(monto);
		cOrigen.setSaldo(nuevoSaldoOrigen);
		this.bancariaService.actualizar(cOrigen);
		
		CuentaBancaria cDestino = this.bancariaService.buscar(ctaDestino);
		BigDecimal saldoDestino = cDestino.getSaldo();
		BigDecimal nuevoSaldoDestino = saldoDestino.add(monto);
		cDestino.setSaldo(nuevoSaldoDestino);
		this.bancariaService.actualizar(cDestino);
		
		Transferencia t = new Transferencia();
		t.setNumeroCuentaOrigen(ctaOrigen);
		t.setNumeroCuentaDestino(ctaDestino);
		t.setMontoTransferir(monto);
		t.setFechaTransferencia(LocalDateTime.now());
		this.iTranferenciaRepository.insertar(t);
	}
	
	@Override
	public Transferencia buscarPorNumero(String ctaOrigen) {
		// TODO Auto-generated method stub
		return this.iTranferenciaRepository.buscar(ctaOrigen);
	}


	@Override
	public void actualizar(String ctaOrigen) {
		// TODO Auto-generated method stub
		this.iTranferenciaRepository.actualizar(ctaOrigen);

	}

	@Override
	public void borrarCuentaBancaria(String ctaOrigen) {
		// TODO Auto-generated method stub
		this.iTranferenciaRepository.eliminar(ctaOrigen);

	}

	@Override
	public List<Transferencia> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		//no hay ninguna logica del negocio
		return this.iTranferenciaRepository.consultar(cuenta, fechaInicio, fechaFin);
	}
	
	
}
