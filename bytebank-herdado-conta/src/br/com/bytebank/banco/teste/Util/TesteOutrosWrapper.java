package br.com.bytebank.banco.teste.Util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrapper {

	public static void main(String[] args) {
		
        Integer idadeRef = Integer.valueOf(29); //autoboxing
		System.out.println(idadeRef.doubleValue()); //unboxing

		
		Double dRef = Double.valueOf(3.2); //autoboxing
		System.out.println(dRef.doubleValue()); //unboxing
		
		
		Boolean bRef = Boolean.FALSE;
		System.out.println(bRef.booleanValue());
		
		
		Number refNumero = Integer.valueOf(28);
		Number refNumero1 = Double.valueOf(29.8);
		Number refNumero3 = Float.valueOf(30.5f);
		
		
		List<Number> lista = new ArrayList<>();
		lista.add(10);
		lista.add(35.5);    // "só funciona por causa da classe Number."
		lista.add(66.5f);
		
		
		
		
	}

}
