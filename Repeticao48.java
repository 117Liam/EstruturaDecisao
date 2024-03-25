import java.util.Scanner;
public class Repeticao48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        int numeroInvertido = inverterNumero(numero);

        System.out.println("Número invertido: " + numeroInvertido);
    }

    public static int inverterNumero(int numero) {
        int numeroInvertido = 0;

        while (numero > 0) {
            int digito = numero % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            numero /= 10;
        }

        return numeroInvertido;
    }
}
