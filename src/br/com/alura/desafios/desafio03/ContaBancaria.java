package br.com.alura.desafios.desafio03;

public class ContaBancaria {
    protected double saldo = 5000;

    public void consultaSaldo() {
        System.out.println("Seu saldo atual é de: R$ " + saldo + "\n");
    }

    public void depositar(double quantiaDeposito) {
        saldo += quantiaDeposito;
        System.out.println("R$ " + quantiaDeposito + " depositado com sucesso! Saldo: R$ " + saldo + "\n");
    }

    public void sacar(double quantiaSaque) {
        if (quantiaSaque < saldo) {
            saldo -= quantiaSaque;
            System.out.println("Saque de R$ " + quantiaSaque + " realizado com sucesso! Saldo: " + saldo + "\n");
        } else {
            System.out.println("Saldo insuficiente para realizar esta operação!\n");
        }
    }
}
