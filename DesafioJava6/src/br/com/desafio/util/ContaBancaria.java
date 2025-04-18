package br.com.desafio.util;

public class ContaBancaria {
    protected double saldo;

    public void sacar (double dinheiro) {
        if (dinheiro > saldo) {
            System.out.println("Saldo insuficiente!");
        } else {
            saldo -= dinheiro;
        }
    }

    public void depositar (double dinheiro) {
        if (dinheiro < 0) {
            System.out.println("Insira um valor valido");
        } else {
            saldo += dinheiro;
        }
    }

    public void consultarSaldo() {
        System.out.println("Seu saldo é: " + saldo);
    }
}
