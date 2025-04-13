public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Calculadora dobrarNumero = new Calculadora();
        Musica musica1 = new Musica();
        Carro carro1 = new Carro();
        Aluno aluno1 = new Aluno();

        pessoa1.exibeMensagem();

        System.out.println("O número dobrado é: "+dobrarNumero.dobraNumero(10));;

        musica1.titulo = "New Jeans";
        musica1.artista = "NJZ";
        musica1.anoLancamento = 2018;
        musica1.exibeFichaMusical();
        musica1.avaliaMusica(10);
        musica1.avaliaMusica(10);
        musica1.avaliaMusica(9);
        System.out.println("Notas totais da música: "+musica1.avaliacao);
        System.out.println("Total de avaliações: "+musica1.numAvaliacao);
        System.out.println(musica1.mediaMusica());

        carro1.modelo = "Ferrari";
        carro1.ano = 1998;
        carro1.cor = "Vermelho";
        carro1.fichaCarro();
        System.out.println("O carro tem: "+carro1.anoCarro(2025)+" anos");

        aluno1.nome = "Keven Willians";
        aluno1.idade = 20;
        aluno1.exibeAluno();
    }
}
