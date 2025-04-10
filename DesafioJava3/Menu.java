import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("1. Calcular a área do quadrado\n2. Calcular a área do circulo");
        System.out.println("Digite abaixo: ");

        int escolha = leitura.nextInt();

        switch (escolha){
            case 1:
                System.out.println("Digite o primeiro valor:");
                int numeroUm = leitura.nextInt();
                System.out.println("Digite o segundo valor:");
                int numeroDois = leitura.nextInt();

                System.out.println("A área do quadrado é: "+(numeroUm * numeroDois));
                break;

            case 2:
                System.out.println("Digite o raio do círculo: ");
                int raio = leitura.nextInt();

                System.out.println("A área do círculo é: "+((raio*raio)*3.1415));
        }
    }
}
