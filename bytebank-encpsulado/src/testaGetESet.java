
public class testaGetESet {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24556);
	    System.out.println(conta.getNumero());
	    
	    
	    Cliente fabricio = new Cliente();
	    fabricio.setNome("Fabrici Freitas");
	    conta.setTitular(fabricio);
	    System.out.println(conta.getTitular().getNome());
	    
	    conta.getTitular().setProfissao("programador");
	    
	    Cliente titularDaConta = conta.getTitular();
	    titularDaConta.setProfissao("programador");
	    
	    System.out.println(titularDaConta);
	    System.out.println(fabricio);
	    System.out.println(conta.getTitular());
	    
	}

}
