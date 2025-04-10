import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira o número que deseja saber se é par ou ímpar: ");
        int number = leitor.nextInt();
        if (number % 2 == 0){
            System.out.println("O número é par");
        } else {
            System.out.println("O número é ímpar");
        }
    }
}
