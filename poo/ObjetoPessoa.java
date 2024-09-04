package poo;

public class ObjetoPessoa {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();

		//OBJETO 1
		pessoa1.setNome("Tom Cruise");
		pessoa1.setIdade(60);
		pessoa1.setEndereco("Califórnia, USA");
		pessoa1.setProfissao("Ator");
		pessoa1.setCpf(12345678910l);
		pessoa1.setRg("67583742X");

		//OBJETO 2
		pessoa2.setNome("Messi");
		pessoa2.setIdade(35);
		pessoa2.setEndereco("Miami, USA");
		pessoa2.setProfissao("Jogador de Futebol");
		pessoa2.setCpf(10987654321l);
		pessoa2.setRg("1234567890X");

		//CHAMANDO O MÉTODO GET() PARA APRESENTAR OS OBJETOS
		System.out.println("----- OBJETO 1 -----");
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getIdade());
		System.out.println(pessoa1.getEndereco());
		System.out.println(pessoa1.getProfissao());
		System.out.println(pessoa1.getCpf());
		System.out.println(pessoa1.getRg());

		System.out.println("----- OBJETO 2 -----");
		System.out.println(pessoa2.getNome());
		System.out.println(pessoa2.getIdade());
		System.out.println(pessoa2.getEndereco());
		System.out.println(pessoa2.getProfissao());
		System.out.println(pessoa2.getCpf());
		System.out.println(pessoa2.getRg());
	}
}
