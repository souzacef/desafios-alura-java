package br.com.alura.desafios.desafio03;

public class Cachorro extends Animal{
    @Override
    public void emitirSomDeAnimal() {
        System.out.println("Au au au au");
    }
    public void abanarRabo() {
        System.out.println("Abanando o rabo!\n");
    }
}
