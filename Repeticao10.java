import java.util.Scanner;
public class Repeticao10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = leitor.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = leitor.nextInt();

        System.out.println("Números no intervalo entre " + numero1 + " e " + numero2 + ":");

        int menor = Math.min(numero1, numero2);
        int maior = Math.max(numero1, numero2);

        for (int i = menor; i <= maior; i++) {
            System.out.println(i);
        }

        leitor.close();
    }
}
