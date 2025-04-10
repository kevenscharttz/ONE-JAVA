import java.util.Scanner;

public class Numero {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numero = leitor.nextInt();
        if (numero < 0) {
            System.out.println("O número é negativo");
        } else {
            System.out.println("O número é positivo");
        }
    }
}
