package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.Deposito;
import com.uce.edu.demo.banco.modelo.Retiro;
import com.uce.edu.demo.banco.modelo.Transferencia;
import com.uce.edu.demo.banco.repository.IDepositoRespository;
import com.uce.edu.demo.banco.repository.IRetiroRepository;
import com.uce.edu.demo.banco.repository.ITransferenciaRepository;
import com.uce.edu.demo.banco.to.TransaccionTo;

@Service
public class TransaccionServiceImpl  implements ITransaccion{
	
	@Autowired
	private ITransferenciaService iTransferenciaService;
	@Autowired
	private IDepositoService iDepositoService;
	@Autowired
	private ITransferenciaRepository iTransferenciaRepository;
	@Autowired
	private IDepositoRespository depositoRespository;
	@Autowired
	private IRetiroRepository iRetiroRepository;
	@Autowired
	private IRetiroService iRetiroService;
	
	
	@Override
	public void transferencia(String origen, String destino, BigDecimal monto) {
		// TODO Auto-generated method stub
		this.iTransferenciaService.realizarTransferencia(origen, destino, monto);
	}

	@Override
	public void deposito(String destino, BigDecimal monto) {
		// TODO Auto-generated method stub
		this.iDepositoService.realizarDeposito(destino, monto);
	}

	@Override
	public void retiro(String ctaRetiro, BigDecimal monto) {
		// TODO Auto-generated method stub
		this.iRetiroService.realizarRetiro(ctaRetiro, monto);
	}

	@Override
	public List<TransaccionTo> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		List<Transferencia> listaTrans =this.iTransferenciaRepository.consultar(cuenta, fechaInicio, fechaFin);
		List<Deposito> listaDepo=this.depositoRespository.consultar(cuenta, fechaInicio, fechaFin);
		List<Retiro> listaReti=this.iRetiroRepository.consultar(cuenta, fechaInicio, fechaFin);
		
		//vamos a unir todas las listas
		List<TransaccionTo> listaFinal=new ArrayList<>();
		
		for(Transferencia t:listaTrans) {
			TransaccionTo transacciontTo=this.transformar(t);
			listaFinal.add(transacciontTo);
		}
		for(Deposito d:listaDepo) {
			TransaccionTo transacciontTo=this.transformar(d);
			listaFinal.add(transacciontTo);
		}
		for(Retiro r:listaReti) {
			TransaccionTo transacciontTo=this.transformar(r);
			listaFinal.add(transacciontTo);
		}
		return listaFinal;
	}

	private TransaccionTo transformar(Transferencia tranferencia) {
		TransaccionTo tranTo=new TransaccionTo();
		tranTo.setFecha(tranferencia.getFechaTransferencia());
		tranTo.setMonto(tranferencia.getMontoTransferir());
		tranTo.setTipo("T");
		
		return tranTo;
	}
	private TransaccionTo transformar(Deposito deposito) {
		TransaccionTo tranTo=new TransaccionTo();
		tranTo.setFecha(deposito.getFecha());
		tranTo.setMonto(deposito.getMonto());
		tranTo.setTipo("D");
		
		return tranTo;
	}
		
	private TransaccionTo transformar(Retiro retiro) {
		TransaccionTo tranTo=new TransaccionTo();
		tranTo.setFecha(retiro.getFecha());
		tranTo.setMonto(retiro.getMonto());
		tranTo.setTipo("R");
		
		return tranTo;
	}
	
}
