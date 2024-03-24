import java.util.Scanner;
public class Repeticao26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número total de eleitores: ");
        int totalEleitores = scanner.nextInt();

        if (totalEleitores <= 0) {
            System.out.println("Número inválido de eleitores.");
            return;
        }

        int[] votos = new int[3]; 

        for (int i = 1; i <= totalEleitores; i++) {
            System.out.println("Eleitor " + i + ":");
            System.out.println("Digite o número do candidato (1, 2 ou 3): ");
            int voto = scanner.nextInt();

            if (voto < 1 || voto > 3) {
                System.out.println("Voto inválido! Por favor, vote nos candidatos 1, 2 ou 3.");
            } else {
                votos[voto - 1]++; 
            }
        }

        System.out.println("Resultado da eleição:");
        for (int i = 0; i < votos.length; i++) {
            System.out.println("Candidato " + (i + 1) + ": " + votos[i] + " votos");
        }
    }
}
