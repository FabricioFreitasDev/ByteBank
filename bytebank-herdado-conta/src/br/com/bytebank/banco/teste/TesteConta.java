package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteConta {
	
	public static void main(String[] args) throws SaldoInsuficienteException {
		ContaCorrente cc = new ContaCorrente(1582, 45657);
		cc.deposita(200);
		
		
		ContaPoupanca cp = new ContaPoupanca(5421, 668854);
		cp.deposita(300);
		
		cc.transfere(50, cp);
		
		System.out.println("CC:" + cc.getSaldo());
		System.out.println("CP:" + cp.getSaldo());
			
	}

}
