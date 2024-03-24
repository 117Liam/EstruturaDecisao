import java.util.Scanner;
public class Repeticao24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas notas você deseja inserir? ");
        int quantidadeNotas = scanner.nextInt();

        if (quantidadeNotas <= 0) {
            System.out.println("Quantidade inválida de notas.");
            return;
        }

        double soma = 0;

        for (int i = 1; i <= quantidadeNotas; i++) {
            System.out.print("Digite a nota " + i + ": ");
            double nota = scanner.nextDouble();
            soma += nota;
        }

        double media = soma / quantidadeNotas;

        System.out.println("A média aritmética das " + quantidadeNotas + " notas é: " + media);
    }
}
