import java.util.Scanner;
public class Repeticao28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de CDs na coleção: ");
        int quantidadeCDs = scanner.nextInt();

        if (quantidadeCDs <= 0) {
            System.out.println("Quantidade inválida de CDs.");
            return;
        }

        double totalInvestido = 0;

        for (int i = 1; i <= quantidadeCDs; i++) {
            System.out.print("Digite o valor do CD " + i + ": ");
            double valorCD = scanner.nextDouble();

            if (valorCD <= 0) {
                System.out.println("Valor inválido para o CD " + i + ".");
                return;
            }

            totalInvestido += valorCD;
        }

        double valorMedioPorCD = totalInvestido / quantidadeCDs;

        System.out.println("Valor total investido na coleção de CDs: R$ " + totalInvestido);
        System.out.println("Valor médio gasto em cada CD: R$ " + valorMedioPorCD);
    }
}
