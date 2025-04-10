import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual tabuada você quer ver?");

        int number = leitor.nextInt();
        int i = 1;

        for (i = 1; i <=10; i++){
            System.out.println(number+" x "+i+" = "+(number * i));
        }
    }
}
