import java.util.Scanner;
public class Repeticao15 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor de n para gerar a série de Fibonacci até o n-ésimo termo: ");
        int n = leitor.nextInt();

        System.out.println("Série de Fibonacci até o " + n + "º termo:");

        int primeiroTermo = 1;
        int segundoTermo = 1;

        if (n >= 1) {
            System.out.print(primeiroTermo + " ");
        }
        if (n >= 2) {
            System.out.print(segundoTermo + " ");
        }

        for (int i = 3; i <= n; i++) {
            int proximoTermo = primeiroTermo + segundoTermo;
            System.out.print(proximoTermo + " ");
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }

        leitor.close();
    }
}
