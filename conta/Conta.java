package conta;

public class Conta {
	String tipo;
	int id;
	double saldo, sacar, depositar;

	public String getTipo() {
		return tipo;
	}
	public void setTipo (String tipo) {
		this.tipo = tipo;
	}
	public int getId() {
		return id;
	}
	public void setId (int id) {
		this.id = id;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo (double saldo) {
		this.saldo = saldo;
	}
	public double getSacar() {
		return sacar;
	}
	public void setSacar (double sacar) {
		this.sacar = sacar;
	}
	public double getDepositar() {
		return depositar;
	}
	public void setDepositar (double depositar) {
		this.depositar = depositar;
	}
}
