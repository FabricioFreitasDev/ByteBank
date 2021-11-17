package br.com.bytebank.banco.teste.Util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
		
		//Generics <Conta>
		ArrayList<Conta> lista = new ArrayList<Conta>();		
		
		Conta cc = new ContaCorrente(222, 1526);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(222, 1527);
		lista.add(cc2);
		
		boolean existe = lista.contains(cc2);
		
		System.out.println("Já existe? " + existe);
		
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}

	}

}
