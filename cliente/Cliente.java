package cliente;

public class Cliente {
	String nome, telefone, cpf, rg, comprar, reclama, anda, corre;
	int id;

	public String getNome() {
		return nome;
	}
	public void setNome (String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId (int id) {
		this.id = id;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone (String telefone) {
		this.telefone = telefone;
	}
	public String getCpf(){
		return cpf;
	}
	public void setCpf (String cpf){
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg (String rg) {
		this.rg = rg;
	}
	public String getComprar() {
		return comprar;
	}
	public void setComprar (String comprar) {
		this.comprar = comprar;
	}
	public String getReclama() {
		return reclama;
	}
	public void setReclama (String reclama) {
		this.reclama = reclama;
	}
	public String getAnda() {
		return anda;
	}
	public void setAnda (String anda) {
		this.anda = anda;
	}
	public String getCorre() {
		return corre;
	}
	public void setCorre (String corre) {
		this.corre = corre;
	}
}
