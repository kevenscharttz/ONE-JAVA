import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        //strings
        System.out.println("Qual é o seu nome?");
        String nome = leitura.nextLine();

        //int
        System.out.println("Qual o ano de lançamento do filme?");
        int anoDeLancamento = leitura.nextInt();

        //double
        System.out.println("Quanto dinheiro você tem?");
        Double dinheiro = leitura.nextDouble();

        System.out.println("Que nome legal, "+nome);
        System.out.println("O ano de lançamento do filme é: "+anoDeLancamento);
        System.out.println("Puxa, "+dinheiro+" é muito dinheiro");
    }
}
