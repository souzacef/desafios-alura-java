package br.com.alura.desafios.desafio07;

import java.util.Scanner;

public class VerificaSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Crie uma senha com mais de 8 caracteres.");
        String senha = scanner.nextLine();

        try {
            validarSenha(senha);
            System.out.println("Senha válida!");
        } catch (ErroSenhaCurtaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

        private static void validarSenha(String senha) {
            if (senha.length() < 8) {
                throw new ErroSenhaCurtaException("A senha deve conter pelo menos 8 caracteres.");
            }

    }
}
