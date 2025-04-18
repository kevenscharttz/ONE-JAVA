import br.com.projeto.desafio.*;

public class Main {
    public static void main(String[] args) {
        ConversorMoeda conversor = new ConversorMoeda();
        conversor.converterDolarParaReal(6.30);

        CalculadoraSalaRetangular sala = new CalculadoraSalaRetangular();
        sala.calcularArea(10, 10);
        sala.calcularPerimetro(10, 10);

        ConversorTemperaturaPadrao clima = new ConversorTemperaturaPadrao();
        clima.celsiusParaFahrenheit(32);
        clima.fahrenheitParaCelcius(100);

        Livro livro = new Livro();
        ProdutoFisico produto = new ProdutoFisico();
        System.out.println(livro.calcularPrecoFinal(100));
        System.out.println(produto.calcularPrecoFinal(100));
    }
}
