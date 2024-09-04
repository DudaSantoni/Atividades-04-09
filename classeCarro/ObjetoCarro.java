package classeCarro;

public class ObjetoCarro {

	public static void main(String[] args) {
		Carro car1 = new Carro();
		Carro car2 = new Carro();
		Carro car3 = new Carro();
		Carro car4 = new Carro();


		car1.setModelo("SU7 Ultra");
		car1.setTipo("Esportivo");
		car1.setCor("Branco");
		car1.setQuantPortas("Quatro");
		car1.setAcelerar("Não");
		car1.setLigarFarol("Baixo");
		car1.setDesacelerar("Sim");
		car1.setDarSeta("Para a esqueda");

		car2.setModelo("Chevrolet Camaro");
		car2.setTipo("Conversível");
		car2.setCor("Amarelo");
		car2.setQuantPortas("Duas");
		car2.setAcelerar("Sim");
		car2.setLigarFarol("Alto");
		car2.setDesacelerar("Não");
		car2.setDarSeta("Para a direira");

		car3.setModelo("Cruze");
		car3.setTipo("Sedan");
		car3.setCor("Prata");
		car3.setQuantPortas("Quatro");
		car3.setAcelerar("Sim");
		car3.setLigarFarol("Médio");
		car3.setDesacelerar("Não");
		car3.setDarSeta("Para a esquerda");

		car4.setModelo("Montana");
		car4.setTipo("Picape");
		car4.setCor("Preto");
		car4.setQuantPortas("Duas");
		car4.setAcelerar("Não");
		car4.setLigarFarol("Alto");
		car4.setDesacelerar("Sim");
		car4.setDarSeta("Para a direita");

		System.out.println("----- CARRO 1 -----");
		System.out.println("Modelo: " + car1.getModelo());
		System.out.println("Tipo: " + car1.getTipo());
		System.out.println("Cor: " +car1.getCor());
		System.out.println("Quantidade de portas: " +car1.getQuantPortas());
		System.out.println("Acelerando: " +car1.getAcelerar());
		System.out.println("Farol ligado: " +car1.getLigarFarol());
		System.out.println("Desacelerando: " +car1.getDesacelerar());
		System.out.println("Dando seta: " +car1.getDarSeta());

		System.out.println("----- CARRO 2 -----");
		System.out.println("Modelo: " + car2.getModelo());
		System.out.println("Tipo: " + car2.getTipo());
		System.out.println("Cor: " + car2.getCor());
		System.out.println("Quantidade de portas: " + car2.getQuantPortas());
		System.out.println("Acelerando: " + car2.getAcelerar());
		System.out.println("Farol ligado: " + car2.getLigarFarol());
		System.out.println("Desacelerando: " + car2.getDesacelerar());
		System.out.println("Dando seta: " + car2.getDarSeta());

		System.out.println("----- CARRO 3 -----");
		System.out.println("Modelo: " + car3.getModelo());
		System.out.println("Tipo: " + car3.getTipo());
		System.out.println("Cor: " + car3.getCor());
		System.out.println("Quantidade de portas: " + car3.getQuantPortas());
		System.out.println("Acelerando: " + car3.getAcelerar());
		System.out.println("Farol ligado: " + car3.getLigarFarol());
		System.out.println("Desacelerando: " + car3.getDesacelerar());
		System.out.println("Dando seta: " + car3.getDarSeta());

		System.out.println("----- CARRO 4 -----");
		System.out.println("Modelo: " + car4.getModelo());
		System.out.println("Tipo: " + car4.getTipo());
		System.out.println("Cor: " + car4.getCor());
		System.out.println("Quantidade de portas: " + car4.getQuantPortas());
		System.out.println("Acelerando: " + car4.getAcelerar());
		System.out.println("Farol ligado: " + car4.getLigarFarol());
		System.out.println("Desacelerando: " + car4.getDesacelerar());
		System.out.println("Dando seta: " + car4.getDarSeta());
	}

}
