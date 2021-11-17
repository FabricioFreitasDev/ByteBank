package br.com.bytebank.banco.teste.Util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		
		
		//Generics <Conta>
		List<Conta> lista = new LinkedList<Conta>();
		

		Conta cc = new ContaCorrente(222, 1526);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(222, 1527);
		lista.add(cc2);
		
		
		System.out.println("Tamanho: " + lista.size());
		Conta ref = lista.get(0);
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		
		System.out.println("Tamanho: " + lista.size());
		
		
		Conta cc3 = new ContaCorrente(222, 1528);
		lista.add(cc3);
		
		Conta cc4 = new ContaCorrente(222, 1529);
		lista.add(cc4);
		
		
		
		for(int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(lista.get(i));
		}
		
		System.out.println("Imprime");
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}
		
		

	}

}
