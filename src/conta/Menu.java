package conta;

import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;

public class Menu {

	public static void main(String[] args) {
		
		//Teste da Classe Conta
		Conta c1 = new Conta(2, 123, 1, "Tadeu", 4000.0f);

		c1.visualizar();
		c1.sacar(1200.0f);
		c1.visualizar();
		c1.depositar(5000.0f);
		c1.visualizar();


		// Teste da Classe Conta Corrente
		ContaCorrente cc1 = new ContaCorrente(32, 33, 1, "Tadeu", 4000.0f, 3000.0f);

		cc1.visualizar();
		cc1.sacar(1200.0f);
		cc1.visualizar();
		cc1.depositar(5000.0f);
		cc1.visualizar();

		// Teste da Classe Conta Poupança

		ContaPoupanca cp1 = new ContaPoupanca(3, 123, 2, "Victor", 14000.0f, 15);

		cp1.visualizar();
		cp1.sacar(1500.0f);
		cp1.visualizar();
		cp1.depositar(7000.0f);
		cp1.visualizar();
	}
}
