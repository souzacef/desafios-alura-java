package br.com.alura.desafios.desafio01;

public class Carro {
    public String modelo, cor;
    public int ano;

    public void fichaTecnica() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

   public int calculaIdade() {
        return 2024 - ano;
    }
}
