package br.com.bytebank.banco.modelo;


/**
 * 
 * Classe representa moldura de uma conta.
 * 
 * @author Fabricio Freitas
 *
 */




public abstract class Conta extends Object implements Comparable<Conta>{
	
   protected double saldo;
   private int agencia;
   private int numero;
   private Cliente titular;
   private static int total = 0;
   
   
     public Conta(int agencia, int numero) {
    	 Conta.total++;
    	// System.out.println("o total de conta é" + Conta.total);
    	 this.agencia = agencia;
    	 this.numero = numero;
    	 this.saldo = 0;
    	 
    	// System.out.println("estou criando uma conta." + this.numero);
    	 
     }
   
    
   public void deposita(double valor) {
    	this.saldo += valor;
    }
    
    public boolean saca(double valor) throws SaldoInsuficienteException {
    	if(this.saldo >= valor) {
    		this.saldo -= valor;
    		return true;
    	}else {
    		return false;
    	}
 	
    }
    
   	
    public boolean transfere(double valor, Conta destino) {
	     if(this.saldo >= valor) {
		 this.saldo -= valor;
		 destino.deposita(valor);
		 return true;
	 }
	 return false;
	  
   }
    
   public double getSaldo() {
	   return this.saldo;
   }
   
   public int getNumero() {
	   return this.numero;
   }
   
    public void setNumero(int numero) {
    	if(numero <= 0) {
    		System.out.println("nao pode valor <=");
    		return;
    	}
	  this.numero = numero;
   }
    
   public int getAgencia() {
	return this.agencia;
   } 
   
   public void setAgencia(int agencia) {
	   if(agencia <= 0) {
		   System.out.println("nao pode valor menor igual a 0");
		   return;
	   }
	this.agencia = agencia;
	
   }
   
   public void setTitular(Cliente titular) {
	this.titular = titular;

   }
   
   public Cliente getTitular() {
	return titular;
	
   }
   
   public static int getTotal() {
	   return Conta.total;
   }
   
   @Override
	public int compareTo(Conta outra) {
		return Double.compare(this.saldo, outra.saldo);
	}
   
   
   @Override
	public String toString() {
		return " Numero: " + this.numero + ", Agencia: " + this.agencia + ", saldo: " + this.saldo;
	}
      
}