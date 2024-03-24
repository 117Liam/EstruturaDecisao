import java.util.Scanner;
public class Repeticao13 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a base: ");
        int base = leitor.nextInt();

        System.out.print("Digite o expoente: ");
        int expoente = leitor.nextInt();

        int resultado = 1;

        if (expoente < 0) {
            System.out.println("O expoente deve ser um número não negativo.");
        } else {
            for (int i = 1; i <= expoente; i++) {
                resultado *= base;
            }
            System.out.println(base + " elevado a " + expoente + " é igual a " + resultado);
        }

        leitor.close();
    }
}
