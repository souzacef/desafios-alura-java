package br.com.alura.desafios.desafio03;

public class ContaCorrente extends ContaBancaria{
    public void cobrarTarifaMensal() {
        double tarifa = 24.99;
        saldo -= tarifa;
        System.out.println("Tarifa de R$ " + tarifa + " cobrada com sucesso! Saldo: R$ " + saldo + "\n");
    }
}
