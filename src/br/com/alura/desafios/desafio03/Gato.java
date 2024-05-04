package br.com.alura.desafios.desafio03;

public class Gato extends Animal{
    @Override
    public void emitirSomDeAnimal() {
        System.out.println("Miau miau miau miau");
    }

    public void arranharMoveis() {
        System.out.println("Arranhando móveis...\n");
    }
}
