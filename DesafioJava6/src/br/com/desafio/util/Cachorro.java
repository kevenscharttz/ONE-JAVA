package br.com.desafio.util;

public class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }

    public void abanarRabo () {
        System.out.println("Abanando o rabo");
    }
}
