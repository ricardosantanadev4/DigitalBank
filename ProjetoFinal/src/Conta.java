
public abstract class Conta extends Pessoa {

	// Atributos
	private int agencia;
	private int numero;
	private String tipo;
	private double saldo;
	private boolean status;
	private boolean pix;
	private int senha;

	// Métodos abstratos

	public abstract void abrirConta(String nome, int idade, String endereco, String cpf, String rg, boolean pix,
			int senha);

	public abstract void fecharConta();

	public abstract void statusConta();
	
	public abstract void statusOperacao();

	public abstract void depositar(double valor);

	public abstract void sacar(double valor);
	
	public abstract void transferir(Conta outra, double valor);

	public abstract void consultarSaldo();
	
	public abstract void trocarSenha(String nome, String rg, String cpf, int senha);

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public boolean isPix() {
		return pix;
	}

	public void setPix(boolean pix) {
		this.pix = pix;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

}
