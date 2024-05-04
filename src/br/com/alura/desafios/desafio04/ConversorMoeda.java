package br.com.alura.desafios.desafio04;

public class ConversorMoeda implements ConversãoFinanceira{
    @Override
    public void converterDolarParaReal(double quantidadeDolar) {
        double cotacao = 5.11;
        double real = quantidadeDolar * cotacao;
        System.out.println("US$ " + quantidadeDolar + " em reais é: R$ " + real + "\n");
    }
}
