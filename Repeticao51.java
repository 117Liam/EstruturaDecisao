import java.util.Scanner;
public class Repeticao51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de n (quantidade de termos da série): ");
        int n = scanner.nextInt();

        double soma = calcularSerie(n);

        System.out.println("Soma da série: " + soma);
    }

    public static double calcularSerie(int n) {
        double soma = 0.0;

        for (int i = 1; i <= n; i++) {
            soma += (double) i / (2 * i - 1);
            System.out.println("Termo " + i + ": " + i + "/" + (2 * i - 1));
        }

        return soma;
    }
}
