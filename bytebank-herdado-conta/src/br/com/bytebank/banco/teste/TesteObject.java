package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {
//		System.out.println("x");
//		System.out.println(3);
//		System.out.println(false);
		
		Object cc = new ContaCorrente(212, 336);
		Object cp = new ContaPoupanca(575, 685);
		Object cliente = new Cliente();
		
		System.out.println(cc.toString());
		System.out.println(cp);
		
		//println(cc);
		
		
		println();
		
	}
	
	static void println() {
		  	 
	}
	
	static void println(int a) {
		
	}
	
	static void println(boolean valor) {
		
	}

static void println(Object referencia) {
		
	}
	
	
}
