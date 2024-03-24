import java.util.Scanner;
public class Repeticao22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro para verificar se é primo: ");
        int numero = scanner.nextInt();

        boolean primo = verificarPrimo(numero);

        if (primo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo. É divisível por:");
            listarDivisores(numero);
        }
    }

    public static boolean verificarPrimo(int numero) {
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

    public static void listarDivisores(int numero) {
        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
