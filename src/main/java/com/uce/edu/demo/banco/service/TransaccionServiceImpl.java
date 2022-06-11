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
import com.uce.edu.demo.banco.to.TransaccionTo;

@Service
public class TransaccionServiceImpl  implements ITransaccion{
	
	@Autowired
	private ITransferenciaService itransferenciaService;
	@Autowired
	private IDepositoService idepositoService;
	@Autowired
	private IRetiroService iretiroService;

	@Override
	public void transferencia(String origen, String destino, BigDecimal monto) {
		// TODO Auto-generated method stub
		this.itransferenciaService.realizarTransferencia(origen, destino, monto);
	}

	@Override
	public void deposito(String destino, BigDecimal monto) {
		// TODO Auto-generated method stub
		this.idepositoService.realizarDeposito(destino, monto);
	}

	@Override
	public void retiro(String ctaRetiro, BigDecimal monto) {
		// TODO Auto-generated method stub
		this.iretiroService.realizarRetiro(ctaRetiro, monto);
	}

	@Override
	public List<TransaccionTo> consulta(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		List<Transferencia> listaTrans =null;
		List<Deposito> listaDepo=null;
		List<Retiro> listaReti=null;
		
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
