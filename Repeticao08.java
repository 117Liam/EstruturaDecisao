import java.util.Scanner;
public class Repeticao08 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite 5 números:");

        int soma = 0;
        for (int i = 0; i < 5; i++) {
            int numero = leitor.nextInt();
            soma += numero;
        }

        double media = (double) soma / 5;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

        leitor.close();
    }
}
