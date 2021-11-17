package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		String vazio = " ";
		System.out.println(vazio.isEmpty());
		
		
		
		String nome = "Fabricio"; //objeto literal
		//String outro = new String ("Fabricio");
		
		System.out.println(nome.length());
		
		for ( int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		
//		char c = nome.charAt(0);
//		System.out.println(c);
//		char c  = 'A';
//		char d = 'a';
//		
//		String outra = nome.replace(c, d );
//		String outra = nome.toUpperCase();
//		String outra = nome.toLowerCase();
//		 
//		 System.out.println(nome);
//		 System.out.println(outra);

	}

}
