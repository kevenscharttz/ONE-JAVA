import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira o número que deseja saber o fatorial: ");
        int number = leitor.nextInt();
        int resultado = 1;

        for (int i = 1; i < number; i++) {
            resultado *= i;
        }
        System.out.println("O resultado é: "+resultado);
    }
}
