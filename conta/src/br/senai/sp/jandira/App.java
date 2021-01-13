package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {

		Conta contaDaMaria = new Conta();

		Conta contaDoJoao;
		contaDoJoao = new Conta();

		// Determinar os dados da conta da Maria
		contaDaMaria.numero = "100-85";
		contaDaMaria.titular = "Maria da Silva";
		contaDaMaria.tipo = "Corrente";
		contaDaMaria.ativa = true;
		contaDaMaria.depositar(100);

		// Determinar os dados da conta do Jo�o
		contaDoJoao.numero = "200-96";
		contaDoJoao.titular = "Jo�o Almeida";
		contaDoJoao.tipo = "Poupan�a";
		contaDoJoao.ativa = true;
		contaDoJoao.depositar(200);

		// Ver o saldo das contas com o nome
		System.out.println("Titular: " + contaDaMaria.titular);
		contaDaMaria.mostrarSaldoDaConta();
		System.out.println("-----------------------------------");
		System.out.println("Titular: " + contaDoJoao.titular);
		contaDoJoao.mostrarSaldoDaConta();
		System.out.println("-----------------------------------");

		// Colocar 100 reais na conta da maria
		contaDaMaria.depositar(58);

		// Ver o saldo das contas com o nome
		System.out.println("Titular: " + contaDaMaria.titular);
		contaDaMaria.mostrarSaldoDaConta();
		System.out.println("-----------------------------------");
		System.out.println("Titular: " + contaDoJoao.titular);
		contaDoJoao.mostrarSaldoDaConta();
		System.out.println("-----------------------------------");

		// Colocar 100 reais na conta da maria
		contaDaMaria.depositar(-20);

		// Ver o saldo das contas com o nome
		System.out.println("Titular: " + contaDaMaria.titular);
		contaDaMaria.mostrarSaldoDaConta();
		System.out.println("-----------------------------------");
		System.out.println("Titular: " + contaDoJoao.titular);
		contaDoJoao.mostrarSaldoDaConta();
		System.out.println("-----------------------------------");

	}

}
