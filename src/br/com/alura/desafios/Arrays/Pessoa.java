package br.com.alura.desafios.Arrays;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.idade = idade;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa: " + nome + " (Idade: " + idade + ")";
    }
}
