import java.util.Scanner;
public class Repeticao05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        char continuar;

        do {
            System.out.print("Digite o valor da população A: ");
            int populacaoA = leitor.nextInt();
            while (populacaoA <= 0) {
                System.out.println("População A deve ser um valor positivo.");
                System.out.print("Digite novamente o valor da população A: ");
                populacaoA = leitor.nextInt();
            }

            System.out.print("Digite o valor da população B: ");
            int populacaoB = leitor.nextInt();
            while (populacaoB <= 0) {
                System.out.println("População B deve ser um valor positivo.");
                System.out.print("Digite novamente o valor da população B: ");
                populacaoB = leitor.nextInt();
            }

            System.out.print("Digite a taxa de crescimento da população A (em %): ");
            double taxaA = leitor.nextDouble();
            while (taxaA <= 0) {
                System.out.println("A taxa de crescimento da população A deve ser um valor positivo.");
                System.out.print("Digite novamente a taxa de crescimento da população A (em %): ");
                taxaA = leitor.nextDouble();
            }

            System.out.print("Digite a taxa de crescimento da população B (em %): ");
            double taxaB = leitor.nextDouble();
            while (taxaB <= 0) {
                System.out.println("A taxa de crescimento da população B deve ser um valor positivo.");
                System.out.print("Digite novamente a taxa de crescimento da população B (em %): ");
                taxaB = leitor.nextDouble();
            }

            int anos = 0;
            while (populacaoA <= populacaoB) {
                populacaoA += (populacaoA * taxaA) / 100;
                populacaoB += (populacaoB * taxaB) / 100;
                anos++;
            }

            System.out.println("População A: " + populacaoA);
            System.out.println("População B: " + populacaoB);
            System.out.println("Anos necessários: " + anos);

            System.out.print("Deseja realizar outra operação? (s/n): ");
            continuar = leitor.next().charAt(0);
            leitor.nextLine();
        } while (continuar == 's' || continuar == 'S');

        leitor.close();
    }
}
