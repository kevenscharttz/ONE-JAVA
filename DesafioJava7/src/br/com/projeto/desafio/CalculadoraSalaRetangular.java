package br.com.projeto.desafio;

public class CalculadoraSalaRetangular implements CalculoGeometrico{

    @Override
    public void calcularArea(double altura, double largula) {
        double areaTotal = altura * largula;
        System.out.println("A área total da sala é: "+areaTotal);
    }

    @Override
    public void calcularPerimetro(double altura, double largula) {
        double perimetroTotal = ((altura * 2) + (largula * 2));
        System.out.println("O perimetro total da sala é: "+perimetroTotal);
    }
}
