public class Desconto {
    public static void main(String[] args) {
        double precoOriginal = 65.80;

        double percentualDesconto = 10.0;
        double valorDesconto = (percentualDesconto / 100) * precoOriginal;
        double precoDesconto = precoOriginal - valorDesconto;

        System.out.println(precoDesconto);
    }
}
