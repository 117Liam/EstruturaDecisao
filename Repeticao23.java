import java.util.Scanner;
public class Repeticao23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro para encontrar todos os primos até ele: ");
        int limite = scanner.nextInt();

        int[] primos = encontrarPrimos(limite);

        System.out.println("\nNúmeros primos até " + limite + ":");
        for (int primo : primos) {
            if (primo != 0) {
                System.out.print(primo + " ");
            }
        }
        System.out.println("\nNúmero total de divisões: " + contarDivisoes(limite));
    }

    public static int[] encontrarPrimos(int limite) {
        int[] primos = new int[limite + 1];
        int contadorDivisoes = 0;

        for (int i = 2; i <= limite; i++) {
            if (ehPrimo(i)) {
                primos[i] = i;
            }
            contadorDivisoes += i - 1; 
        }

        System.out.println("Número de divisões ao encontrar primos até " + limite + ": " + contadorDivisoes);
        return primos;
    }

    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int contarDivisoes(int limite) {
        int contadorDivisoes = 0;
        for (int i = 2; i <= limite; i++) {
            contadorDivisoes += i - 1; 
        }
        return contadorDivisoes;
    }
}
