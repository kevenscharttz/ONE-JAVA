import br.com.projeto.desafio.Pessoa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pessoa individuo = new Pessoa();
        Pessoa individuo2 = new Pessoa();
        Pessoa individuo3 = new Pessoa();

        individuo.setPessoa("Keven", 21);
        individuo2.setPessoa("Matheus", 12);
        individuo3.setPessoa("Isabella", 47);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(individuo);
        listaDePessoas.add(individuo2);
        listaDePessoas.add(individuo3);

        System.out.println(listaDePessoas.size());
        System.out.println(listaDePessoas.getFirst());
        System.out.println(listaDePessoas.toString());

    }
}
