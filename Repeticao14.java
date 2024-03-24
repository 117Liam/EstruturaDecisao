import java.util.Scanner;
public class Repeticao14 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numerosPares = 0;
        int numerosImpares = 0;

        System.out.println("Digite 10 números inteiros:");

        for (int i = 0; i < 10; i++) {
            int numero = leitor.nextInt();

            if (numero % 2 == 0) {
                numerosPares++;
            } else {
                numerosImpares++;
            }
        }

        System.out.println("Quantidade de números pares: " + numerosPares);
        System.out.println("Quantidade de números ímpares: " + numerosImpares);

        leitor.close();
    }
}
