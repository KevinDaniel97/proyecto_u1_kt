package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Deposito;
import com.uce.edu.demo.banco.repository.IDepositoRespository;

@Service
public class DepositoServiceImpl implements IDepositoService{

	@Autowired
	@Qualifier("ahorros")
	private ICuentaBancariaService bancariaService;
	@Autowired
	private IDepositoRespository depositoRepository;
	
	@Override
	public void realizarDeposito(String numeroCtaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		CuentaBancaria ctaDestino= this.bancariaService.buscar(numeroCtaDestino);
		BigDecimal saldoCtaDestino=ctaDestino.getSaldo();
		BigDecimal saldoFinal= saldoCtaDestino.add(monto);
		ctaDestino.setSaldo(saldoFinal);
		this.bancariaService.actualizar(ctaDestino);
		
		Deposito deposito=new Deposito();
		deposito.setFecha(LocalDateTime.now());
		deposito.setNumeroCuentaDestino(numeroCtaDestino);
		deposito.setMonto(monto);
		this.depositoRepository.insertar(deposito);
	}

	@Override
	public Deposito buscarDeposito(String numeroCtaDestino) {
		// TODO Auto-generated method stub
		return this.depositoRepository.buscar(numeroCtaDestino);
	}
	@Override
	public void actualizarDeposito(String numeroCtaDestino) {
		// TODO Auto-generated method stub
		this.depositoRepository.actualizar(numeroCtaDestino);
	}
	@Override
	public void borrarDeposito(String numeroCtaDestino) {
		// TODO Auto-generated method stub
		this.depositoRepository.eliminar(numeroCtaDestino);
	}
	
}
