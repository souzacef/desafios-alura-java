package br.com.alura.desafios.desafio07;

public class ErroSenhaCurtaException extends RuntimeException{
    private String mensagem;

    public ErroSenhaCurtaException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
