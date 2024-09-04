package classeAviao;

public class ObjetoAviao {

	public static void main(String[] args) {
		Aviao avi1 = new Aviao();
		Aviao avi2 = new Aviao();
		Aviao avi3 = new Aviao();
		Aviao avi4 = new Aviao();

		avi1.setModelo("Airbus A320");
		avi1.setTipo("Comercial de corredor único");
		avi1.setCor("Branco");
		avi1.setQuantLugares("150");
		avi1.setDecolar("Não");
		avi1.setAterrissar("Sim");
		avi1.setPousar("Não");
		avi1.setAbrirPorta("Não");

		avi2.setModelo("Boeing 747");
		avi2.setTipo("Comercial de fuselagem larga");
		avi2.setCor("Azul");
		avi2.setQuantLugares("370");
		avi2.setDecolar("Não");
		avi2.setAterrissar("Sim");
		avi2.setPousar("Não");
		avi2.setAbrirPorta("Não");

		avi3.setModelo("Cessna 172");
		avi3.setTipo("Monomotor de pequeno porte");
		avi3.setCor("Vermelho");
		avi3.setQuantLugares("4");
		avi3.setDecolar("Não");
		avi3.setAterrissar("Sim");
		avi3.setPousar("Não");
		avi3.setAbrirPorta("Não");

		avi4.setModelo("Embraer E190");
		avi4.setTipo("Comercial de corredor único");
		avi4.setCor("Branco");
		avi4.setQuantLugares("100");
		avi4.setDecolar("Não");
		avi4.setAterrissar("Sim");
		avi4.setPousar("Não");
		avi4.setAbrirPorta("Não");

		System.out.println("----- AVIÃO 1 -----");
		System.out.println("Modelo: " + avi1.getModelo());
		System.out.println("Tipo: " + avi1.getTipo());
		System.out.println("Cor: " + avi1.getCor());
		System.out.println("Quantidade de portas: " + avi1.getQuantLugares());
		System.out.println("Decolando: " + avi1.getDecolar());
		System.out.println("Aterrissando: " + avi1.getAterrissar());
		System.out.println("Pousar: " + avi1.getPousar());
		System.out.println("Abrindo a porta: " + avi1.getAbrirPorta());

		System.out.println("----- AVIÃO 2 -----");
		System.out.println("Modelo: " + avi2.getModelo());
		System.out.println("Tipo: " + avi2.getTipo());
		System.out.println("Cor: " + avi2.getCor());
		System.out.println("Quantidade de portas: " + avi2.getQuantLugares());
		System.out.println("Decolando: " + avi2.getDecolar());
		System.out.println("Aterrissando: " + avi2.getAterrissar());
		System.out.println("Pousar: " + avi2.getPousar());
		System.out.println("Abrindo a porta: " + avi2.getAbrirPorta());

		System.out.println("----- AVIÃO 3 -----");
		System.out.println("Modelo: " + avi3.getModelo());
		System.out.println("Tipo: " + avi3.getTipo());
		System.out.println("Cor: " + avi3.getCor());
		System.out.println("Quantidade de portas: " + avi3.getQuantLugares());
		System.out.println("Decolando: " + avi3.getDecolar());
		System.out.println("Aterrissando: " + avi3.getAterrissar());
		System.out.println("Pousar: " + avi3.getPousar());
		System.out.println("Abrindo a porta: " + avi3.getAbrirPorta());

		System.out.println("----- AVIÃO 4 -----");
		System.out.println("Modelo: " + avi4.getModelo());
		System.out.println("Tipo: " + avi4.getTipo());
		System.out.println("Cor: " + avi4.getCor());
		System.out.println("Quantidade de portas: " + avi4.getQuantLugares());
		System.out.println("Decolando: " + avi4.getDecolar());
		System.out.println("Aterrissando: " + avi4.getAterrissar());
		System.out.println("Pousar: " + avi4.getPousar());
		System.out.println("Abrindo a porta: " + avi4.getAbrirPorta());
	}

}
