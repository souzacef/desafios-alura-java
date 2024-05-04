package br.com.alura.desafios.desafio03;

public class Carro {
    private String modelo;
    private double precoAno1, precoAno2, precoAno3;

   public void definirModelo(String modelo) {
       this.modelo = modelo;
   }

   public void definirPreco(double precoAno1, double precoAno2, double precoAno3) {
       this.precoAno1 = precoAno1;
       this.precoAno2 = precoAno2;
       this.precoAno3 = precoAno3;
   }

   public void exibirInfo() {
       System.out.println("Modelo: " + modelo);
       System.out.println("Preço no primeiro ano: R$ " + precoAno1);
       System.out.println("Preço no segundo ano: R$ " + precoAno2);
       System.out.println("Preço no terceiro ano: R$ " + precoAno3);
       System.out.println("Menor preço: R$ " + calculaMenorPreco());
       System.out.println("Maior preço: R$ " + calculaMaiorPreco() + "\n");
   }

   private double calculaMenorPreco() {
       double menorPreco = precoAno1;

       if (precoAno2 < menorPreco) {
           menorPreco = precoAno2;
       }

       if (precoAno3 < menorPreco) {
           menorPreco = precoAno3;
       }

       return menorPreco;
   }

   private double calculaMaiorPreco() {
       double maiorPreco = precoAno1;

       if (precoAno2 > maiorPreco) {
           maiorPreco = precoAno2;
       }

       if (precoAno3 > maiorPreco) {
           maiorPreco = precoAno3;
       }
       return maiorPreco;
   }
}
