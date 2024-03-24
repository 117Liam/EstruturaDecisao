import java.util.Scanner;
public class Repeticao20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;

        do {
            System.out.print("Digite um número inteiro positivo menor que 16 para calcular o fatorial: ");
            int numero = scanner.nextInt();

            if (numero >= 0 && numero < 16) {
                long fatorial = calcularFatorial(numero);
                System.out.println(numero + "! = " + fatorial);
            } else {
                System.out.println("Por favor, digite um número inteiro positivo menor que 16.");
            }

            System.out.print("Deseja calcular o fatorial de outro número? (S/N): ");
            continuar = scanner.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');
    }

    public static long calcularFatorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            long resultado = 1;
            for (int i = 2; i <= numero; i++) {
                resultado *= i;
            }
            return resultado;
        }
    }
}
