package br.com.desafio.util;

public class ContaCorrente extends ContaBancaria{
    private String nome;
    private int codigo;

    public void cobrarTarifaMensal (double porcentagem) {
        saldo = saldo - (saldo * (porcentagem / 100));
    }
}
