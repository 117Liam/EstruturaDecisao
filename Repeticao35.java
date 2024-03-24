import java.util.Scanner;
public class Repeticao35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int limite = scanner.nextInt();

        System.out.println("Números primos entre 1 e " + limite + ":");
        listarPrimos(limite);
    }

    public static void listarPrimos(int limite) {
        for (int numero = 2; numero <= limite; numero++) {
            if (ehPrimo(numero)) {
                System.out.print(numero + " ");
            }
        }
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
}
