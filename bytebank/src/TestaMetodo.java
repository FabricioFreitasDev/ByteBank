import javax.swing.plaf.synth.SynthOptionPaneUI;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaCliente = new Conta();
		contaCliente.saldo = 100;
		contaCliente.deposita(50);
		System.out.println(contaCliente.saldo);
		
		boolean conseguiuRetirar = contaCliente.saca(20);
		System.out.println(contaCliente.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaMarcela = new Conta();
		contaMarcela.deposita(1000);
		
		contaMarcela.transfere(300, contaCliente);
		System.out.println(contaMarcela.saldo);
		System.out.println(contaCliente.saldo);
		
	}

}
 
