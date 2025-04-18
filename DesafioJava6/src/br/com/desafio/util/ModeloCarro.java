package br.com.desafio.util;

public class ModeloCarro extends Carro{
    private boolean tanqueCheio;

    public String enchaTanque(boolean gasolina) {
        tanqueCheio = gasolina;
        if (tanqueCheio){
            return "Tanque está cheio!";
        } else {
            return "Tanque está vazio!";
        }
    }
}
