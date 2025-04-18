package br.com.projeto.desafio;

public class ProdutoFisico implements Calculavel{
    @Override
    public double calcularPrecoFinal(double dinheiro) {
        return dinheiro + (dinheiro * ((double) 10 /100));
    }
}
