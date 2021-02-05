
public class ContaCorrente extends Conta {

	@Override
	public void abrirConta(String nome, int idade, String endereco, String cpf, String rg, boolean pix, int senha) {
		if (this.isStatus() == true) {
			System.out.println("A conta já está ativa, não preciza ativar novamente!");
		} else {
			this.setNome(nome);
			this.setIdade(idade);
			this.setEndereco(endereco);
			this.setCpf(cpf);
			this.setRg(rg);
			this.setPix(pix);
			this.setSenha(senha);
			this.setTipo("Cc");
			this.setAgencia(1010);
			this.setNumero(745896);
			this.setStatus(true);
			System.out.println("Abertura de conta realizada com sucesso!");
			statusConta();
		}

	}

	@Override
	public void fecharConta() {
		if (this.isStatus() == false) {
			System.out.println("A conta já está fechada, não preciza fechar novamente!");
		} else if (this.getSaldo() > 0) {
			System.out.println("É necessário sacar tudo antes de fechar a conta!");
		} else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso!");
		}
	}

	@Override
	public void statusConta() {
		System.out.println("Dados da conta ");
		System.out.println("Nome " + this.getNome());
		System.out.println("Agência " + this.getAgencia());
		System.out.println("Número da conta " + this.getNumero());
		System.out.println("Tipo " + this.getTipo());
		System.out.println("Status " + this.isStatus());
		System.out.println("Contem Pix " + this.isPix());
	}

	@Override
	public void statusOperacao() {
		System.out.println("Nome " + this.getNome());
		System.out.println("Agencia " + this.getAgencia());
		System.out.println("Número da conta " + this.getNumero());
	}

	@Override
	public void depositar(double valor) {
		if (this.isStatus() == false) {
			System.out.println("A conta está fechada, não é possível depositar!");
		} else {
			this.setSaldo(this.getSaldo() + valor);
			System.out.println("Depósito de " + valor + " realizado com sucesso!");
			this.statusOperacao();
		}
	}

	@Override
	public void sacar(double valor) {
		if (this.isStatus() == false) {
			System.out.println("A conta está fechada, não é possível depositar!");
		} else if (valor > this.getSaldo()) {
			System.out.println("Saldo insuficiente para saque!");
		} else {
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("Saque de " + valor + " realizado com sucesso!");
		}

	}

	@Override
	public void transferir(Conta outra, double valor) {
		if (this.isStatus() == false) {
			System.out.println("Sua conta está desativada, não é possível transferir!");
		} else if (outra.isStatus() == false) {
			System.out.println(
					"Não foi possível concluir a tranferência.\n A conta que você está tentando traferir, está desativada!");
		} 
		else if(valor > this.getSaldo()) {
			System.out.println("Saldo insuficiente! para transferência!");
		}
		else {
			System.out.println("Iniciando transferência... ");
			this.sacar(valor);
			System.out.println("Concluindo a transferência... ");
			outra.depositar(valor);	
		    System.out.println("Valor transferido " + valor);
		    System.out.println("Transferência concluída!");
		}
	}
  
	@Override
	public void consultarSaldo() {
		System.out.println("Seu saldo é " + this.getSaldo());
		
	}
	
	@Override
	public void trocarSenha(String nome, String rg, String cpf, int senha) {
		if (this.isStatus() == false) {
			System.out.println("A conta está desativada, não é possível trocar a senha!");
		} else if (nome == this.getNome() && rg == this.getRg() && cpf == this.getCpf()) {
			this.setSenha(senha);
			System.out.println("Senha alterada com sucesso!");
		} else {
			System.out.println("Dados inválidos, Não é possível trocar a senha!");
		}

	}	

}
