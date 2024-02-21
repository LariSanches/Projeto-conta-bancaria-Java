package conta;

import conta.model.Conta;

public class Menu {

	public static void main(String[] args) {

		// Teste da Calsse Conta
		Conta conta1 = new Conta(1456, 123, 1, "Larissa Sanches", 50000.0f);

		conta1.visualizar();
		conta1.setAgencia(456);
		System.out.println(conta1.getAgencia());

		if (conta1.sacar(1000))
			System.out.println("\nSaque efetuado com sucesso. O novo saldo é de: " + conta1.getSaldo());
		else
			System.out.println("\nO Saldo é insuficiente!");

		conta1.depositar(1000);
		System.out.println("\nO novo saldo é: " + conta1.getSaldo());

	}
}