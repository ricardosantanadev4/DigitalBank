
public class Principal {

	public static void main(String[] args) {

		ContaCorrente cc1 = new ContaCorrente();

		cc1.abrirConta("Ricardo", 31, "Rua Central 194 Recife", "0713140400", "9487556", true, 145263);
		System.out.println();
//		cc1.fecharConta();
		cc1.depositar(500);
//		cc1.sacar(300);
//		cc1.trocarSenha("Ricardo", "9487556", "0713140400", 152636);

		ContaPoupanca cp1 = new ContaPoupanca();
		System.out.println();
		cp1.abrirConta("Anderson", 32, "Rua Amós nº 252  2Unidos", "071496145200", "9485442", false, 123456);
//	    cp1.fecharConta();
		System.out.println();
		cp1.depositar(500);
//		cp1.sacar(200);
//		cp1.trocarSenha("Anderson", "9485442", "071496145200", 1452858);
		System.out.println();
		cp1.transferir(cc1, 100);
		System.out.println();
		cc1.consultarSaldo();
	}

}
