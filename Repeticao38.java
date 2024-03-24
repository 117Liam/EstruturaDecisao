import java.util.Scanner;
public class Repeticao38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário inicial do funcionário: ");
        double salarioInicial = scanner.nextDouble();

        double salarioAtual = salarioInicial;

        for (int ano = 1996; ano <= 2024; ano++) {
            salarioAtual *= 1.015; 
        }

        System.out.printf("O salário atual do funcionário é: R$ %.2f%n", salarioAtual);
    }
}
