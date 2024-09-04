package cliente;

public class ObjetoCliente {

	public static void main(String[] args) {
		Cliente c1= new Cliente ();
		Cliente c2= new Cliente ();

		//nome, telefone, cpf, rg, comprar, reclama, anda, corre, id;
		c1.setNome("Messi");
		c1.setTelefone("32712902");
		c1.setCpf("10987654321l");
		c1.setRg("1234567890X");
		c1.setComprar("Sim");
		c1.setReclama("Sim");
		c1.setAnda("Não");
		c1.setCorre("Sim");
		c1.setId(0001);

		c2.setNome("Ran");
		c2.setTelefone("32712902");
		c2.setCpf("10964920621l");
		c2.setRg("0987654321X");
		c2.setComprar("Sim");
		c2.setReclama("Sim");
		c2.setAnda("Sim");
		c2.setCorre("Não");
		c2.setId(0002);

		System.out.println("----- OBJETO 1 -----");
		System.out.println(c1.getNome());
		System.out.println(c1.getTelefone());
		System.out.println(c1.getCpf());
		System.out.println(c1.getRg());
		System.out.println(c1.getComprar());
		System.out.println(c1.getReclama());
		System.out.println(c1.getAnda());
		System.out.println(c1.getCorre());
		System.out.println(c1.getId());

		System.out.println("----- OBJETO 2 -----");
		System.out.println(c2.getNome());
		System.out.println(c2.getTelefone());
		System.out.println(c2.getCpf());
		System.out.println(c2.getRg());
		System.out.println(c2.getComprar());
		System.out.println(c2.getReclama());
		System.out.println(c2.getAnda());
		System.out.println(c2.getCorre());
		System.out.println(c2.getId());
	}

}
