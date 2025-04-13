public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacao;

    void exibeFichaMusical (){
        System.out.println("\n\nO titulo da canção é: "+titulo);
        System.out.println("O artista da canção é: "+artista);
        System.out.println("O ano de lançamento da canção é: "+anoLancamento);
    }

    void avaliaMusica(int nota){
        avaliacao += nota;
        numAvaliacao++;
    }

    double mediaMusica() {
        return avaliacao / numAvaliacao;
    }
}
