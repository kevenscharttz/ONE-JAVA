package br.com.projeto.desafio;

public class ConversorMoeda implements ConversãoFinanceira{

    @Override
    public void converterDolarParaReal(double dollar) {
        double real = 4.80;
        double dinheiroConvertido = real * dollar;
        System.out.println("O valor convertido é: " + dinheiroConvertido);
    }
}
