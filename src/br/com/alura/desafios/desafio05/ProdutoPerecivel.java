package br.com.alura.desafios.desafio05;

public class ProdutoPerecivel extends ProdutosDeMercado{
    public String dataValidade;

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public ProdutoPerecivel(String nome, double preco, int quantidade){
        super(nome,preco,quantidade);
        this.dataValidade = getDataValidade();
    }
}
