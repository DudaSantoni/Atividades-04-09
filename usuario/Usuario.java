package usuario;

public class Usuario {
	String nome, permissao, usuario, logar, deslogar;
	int id, senha;

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
	public String getPermissao() {
		return permissao;
	}
	public void setPermissao (String permissao) {
		this.permissao = permissao;
	}
	public String getUsuario(){
		return usuario;
	}
	public void setUsuario (String usuario){
		this.usuario = usuario;
	}
	public String getLogar() {
		return logar;
	}
	public void setLogar (String logar) {
		this.logar = logar;
	}
	public String getDeslogar() {
		return deslogar;
	}
	public void setDeslogar (String deslogar) {
		this.deslogar = deslogar;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha (int senha) {
		this.senha = senha;
	}
}
