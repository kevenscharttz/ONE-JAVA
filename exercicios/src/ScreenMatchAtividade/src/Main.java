public class Main {
    public static void main(String[] args) {
        Filme filme1 = new Filme();

        filme1.nome = "Matrix";
        filme1.anoLancamento = 2000;
        filme1.duracaoMinutos = 180;
        filme1.incluidoPlano = true;

        filme1.exibeFichaTecnica();

        filme1.avalia(10);
        filme1.avalia(7);
        filme1.avalia(6.5);

        System.out.println("A nota total do filme foi de: "+filme1.somaAvalicoes);
        System.out.println("A quantidade de avaliações foram de: "+filme1.totalAvaliacoes);

        System.out.println("A média do filme é de: "+filme1.pegaMedia());
    }
}
