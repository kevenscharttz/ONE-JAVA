public class Filme {
    String nome;
    int anoLancamento;
    int duracaoMinutos;
    boolean incluidoPlano;
    double somaAvalicoes;
    int totalAvaliacoes;

    void exibeFichaTecnica () {
        System.out.println("Nome do filme: "+nome);
        System.out.println("Ano de lançamento: "+anoLancamento);
        System.out.println("Duração do filme: "+duracaoMinutos);
        System.out.println("Está incluido no plano: "+incluidoPlano);
    }
    void avalia (double nota){
        somaAvalicoes += nota;
        totalAvaliacoes++;
    }
    double pegaMedia () {
        return somaAvalicoes / totalAvaliacoes;
    }
}


