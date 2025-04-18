import com.desafios.projeto.Aluno;
import com.desafios.projeto.IdadePessoa;
import com.desafios.projeto.Produto;

public class Main {
    public static void main(String[] args) {
        IdadePessoa pessoa = new IdadePessoa();
        Produto produto1 = new Produto();
        Aluno aluno1 = new Aluno("Keven", 10, 10, 9);
        Aluno aluno2 = new Aluno("Beatriz", 0, 5, 10);

        pessoa.setNome("Keven");
        pessoa.setIdade(20);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

        pessoa.verificarIdade();

        produto1.setPreco(100);
        System.out.println(produto1.aplicarDesconto(10));

        System.out.println("Aluno 1:");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Nota 1: " + aluno1.getNota());
        System.out.println("Nota 2: " + aluno1.getNota2());
        System.out.println("Nota 3: " + aluno1.getNota3());
        System.out.println("Média: " + aluno1.calcularMedia());
        System.out.println();

        System.out.println("Aluno 2:");
        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("Nota 1: " + aluno2.getNota());
        System.out.println("Nota 2: " + aluno2.getNota2());
        System.out.println("Nota 3: " + aluno2.getNota3());
        System.out.println("Média: " + aluno2.calcularMedia());
    }
}
