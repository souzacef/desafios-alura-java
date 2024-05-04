package br.com.alura.desafios.desafio04;

public class CalculadoraSalaRetangular implements CalculoGeometrico{
    @Override
    public void calcularArea(double altura, double largura) {
        double area = altura * largura;
        System.out.println("A area da sala é: " + area + "\n");
    }

    @Override
    public void calcularPerimetro(double lado1, double lado2, double lado3, double lado4) {
        double perimetro = lado1 + lado2 + lado3 + lado4;
        System.out.println("O perímetro da sala é: " + perimetro + "\n");
    }
}
