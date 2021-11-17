
public class TesteGerente {
	
	public static void main(String[] args) {
		
		Autenticavel referencia =new Cliente();		
		
		Gerente g1 = new Gerente();
		g1.setNome("Pedro");
		g1.setCpf("55555.55");
		g1.setSalario(1000.00);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(3333);
		boolean autenticou = g1.autentica(3333);
		
		System.out.println(autenticou);
		System.out.println(g1.getBonificacao());
		
	}

}
