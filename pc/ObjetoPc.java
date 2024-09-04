package pc;

public class ObjetoPc {

	public static void main(String[] args) {
		Pc pc1 = new Pc();
		
		//cor, marca, monitor, mouse, liga, desliga, trava, armazena
		
		pc1.setCor("Prata");
		pc1.setMarca("Dell");
		pc1.setMonitor("Sansung");
		pc1.setMouse("Dell");
		pc1.setLiga("Sim");
		pc1.setDesliga("Sim");
		pc1.setTrava("Não");
		pc1.setArmazena("Sim");

		System.out.println("----- OBJETO 1 -----");
		System.out.println(pc1.getCor());
		System.out.println(pc1.getMarca());
		System.out.println(pc1.getMonitor());
		System.out.println(pc1.getMouse());
		System.out.println(pc1.getLiga());
		System.out.println(pc1.getDesliga());
		System.out.println(pc1.getTrava());
		System.out.println(pc1.getArmazena());


	}

}
