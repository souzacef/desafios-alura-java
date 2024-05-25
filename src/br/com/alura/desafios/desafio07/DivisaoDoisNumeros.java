package br.com.alura.desafios.desafio07;

import java.util.Scanner;

public class DivisaoDoisNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int resultado, n1, n2;

        System.out.println("informe o 1º número");
        n1 = scanner.nextInt();
        System.out.println("informe o 2º número");
        n2 = scanner.nextInt();

        try {
            resultado = n1 / n2;
            System.out.println("O resultado é: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: impossível dividir por zero!");
        }


    }
}
