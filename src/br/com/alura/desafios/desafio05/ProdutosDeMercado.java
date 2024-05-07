package br.com.alura.desafios.desafio05;

public class ProdutosDeMercado {
    public String nome;
    public double preco;
    public int quantidade;

    public ProdutosDeMercado(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    @Override
    public String toString() {
        return this.nome + " Preço: R$ " + this.preco + " Quantidade: " + this.quantidade;
    }
}
