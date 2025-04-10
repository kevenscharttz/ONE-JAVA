import java.util.Scanner;

public class Comparacao {
    public static void main(String[] args) {
        Scanner impressao = new Scanner(System.in);

        int numero = impressao.nextInt();
        int numeroDois = impressao.nextInt();

        if (numero == numeroDois ) {
            System.out.println("Os números são iguais");
        } else if (numero > numeroDois) {
            System.out.println("O primeiro número é maior");
        } else {
            System.out.println("O segundo número é maior");
        }
    }
}
