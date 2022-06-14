package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Retiro;
import com.uce.edu.demo.banco.repository.IRetiroRepository;

@Service
public class RetiroServiceImpl implements IRetiroService{

	@Autowired
	@Qualifier("ahorros")
	private ICuentaBancariaService bancariaService;
	@Autowired
	private IRetiroRepository retiroRepository;
	
	@Override
	public void realizarRetiro(String numeroCuentaOrigen, BigDecimal monto) {
		// TODO Auto-generated method stub
		Retiro retiro=new Retiro();
		retiro.setFecha(LocalDateTime.now());
		retiro.setNumeroCuentaOrigen(numeroCuentaOrigen);
		retiro.setMonto(monto);
		this.retiroRepository.insertar(retiro);
		
		CuentaBancaria cuentaOrigen= this.bancariaService.buscar(numeroCuentaOrigen);
		BigDecimal saldoOrigen=cuentaOrigen.getSaldo();
		BigDecimal saldoFinal= saldoOrigen.subtract(monto);
		cuentaOrigen.setSaldo(saldoFinal);
		this.bancariaService.actualizar(cuentaOrigen);
	
	}

	@Override
	public Retiro buscarPorNumero(String numeroCuentaOrigen) {
		// TODO Auto-generated method stub
		return this.retiroRepository.buscar(numeroCuentaOrigen);
	}
	@Override
	public void actualizar(String numeroCuentaOrigen) {
		// TODO Auto-generated method stub
		this.retiroRepository.actualizar(numeroCuentaOrigen);
	}
	@Override
	public void borrarRetiroCuenta(String numeroCuentaOrigen, BigDecimal monto) {
		// TODO Auto-generated method stub
		this.retiroRepository.eliminar(numeroCuentaOrigen);
	}

	
}
