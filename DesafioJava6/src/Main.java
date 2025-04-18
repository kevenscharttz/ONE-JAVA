import br.com.desafio.util.*;

public class Main {
    public static void main(String[] args) {
        ModeloCarro veiculo = new ModeloCarro();

        veiculo.definirModelo("Onix");
        veiculo.definirPreco(18000, 14000, 16000);

        veiculo.impressaoDados();

        System.out.println("O maior preço é: "+veiculo.calculoPrecoMaior());
        System.out.println("O menor preço é: "+veiculo.calculoPrecoMenor());
        System.out.println(veiculo.enchaTanque(true));

        Animal animal = new Animal();
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        animal.emitirSom();
        gato.emitirSom();
        gato.arranharMoveis();
        cachorro.emitirSom();
        cachorro.abanarRabo();

        ContaCorrente conta = new ContaCorrente();

        conta.consultarSaldo();
        conta.depositar(2500);
        conta.consultarSaldo();
        conta.sacar(500);
        conta.consultarSaldo();
        conta.cobrarTarifaMensal(10);
        conta.consultarSaldo();
    }
}
