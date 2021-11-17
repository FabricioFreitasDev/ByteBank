
public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		
		Cliente cliente = new Cliente();
		
		
		Gerente fabricio = new Gerente();
        fabricio.setNome("Carlos Fabricio");
        fabricio.setCpf("222222.45");
        fabricio.setSalario(2600.00);
        
        System.out.println(fabricio.getNome());
        System.out.println(fabricio.getBonificacao());
        System.out.println(fabricio.getSalario());
	}

}
