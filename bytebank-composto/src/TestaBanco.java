
public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente fabricio = new Cliente();
		fabricio.nome = "Fabricio Freitas";
		fabricio.cpf = "85555888554";
		fabricio.profissao = "programador";
		
		
		Conta contaDoFabricio = new Conta();
		contaDoFabricio.deposita(100);
		
		
		contaDoFabricio.titular = fabricio;
		System.out.println(contaDoFabricio.titular.nome);
		
		
	
	}

}
