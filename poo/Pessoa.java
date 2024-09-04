package poo;

public class Pessoa {
	String nome, endereco, profissao, rg;
	int idade;
	long cpf;

	public String getNome() {
		return nome;
	}
	public void setNome (String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade (int idade) {
		this.idade = idade;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco (String endereco) {
		this.endereco = endereco;
	}
	public String getProfissao(){
		return profissao;
	}
	public void setProfissao (String profissao){
		this.profissao = profissao;
	}
	public long getCpf(){
		return cpf;
	}
	public void setCpf (long cpf){
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg (String rg) {
		this.rg = rg;
	}
}

