package br.com.projeto.desafio;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{

    @Override
    public void celsiusParaFahrenheit(double temperatura) {
        double fahrenheitConvertido = ((temperatura * 1.8) + 32);
        System.out.println(fahrenheitConvertido);
    }

    @Override
    public void fahrenheitParaCelcius(double temperatura) {
        double celsiusConvertido = ((temperatura - 32) / 1.8);
        System.out.println(celsiusConvertido);
    }
}
