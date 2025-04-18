package br.com.desafio.util;

public class Carro {
    private String nome;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    public void definirModelo (String nome) {
        this.nome = nome;
    }

    public void definirPreco (double precoAno1, double precoAno2, double precoAno3) {
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }

    public double calculoPrecoMaior (){
        double maiorPreco = precoAno1;

        if (precoAno2 > precoAno1) {
            maiorPreco = precoAno2;
        } else if (precoAno3 > precoAno1) {
            maiorPreco = precoAno3;
        }

        return maiorPreco;
    }

    public double calculoPrecoMenor (){
        double menorPreco = precoAno1;

        if (precoAno2 < precoAno1) {
            menorPreco = precoAno2;
        } else if (precoAno3 < precoAno1) {
            menorPreco = precoAno3;
        }
        return menorPreco;
    }

    public void impressaoDados () {
        System.out.println("Modelo do veiculo: "+nome);
        System.out.println("Preco no ano 1: "+precoAno1);
        System.out.println("Preco no ano 2: "+precoAno2);
        System.out.println("Preco no ano 3: "+precoAno3);
    }
}
