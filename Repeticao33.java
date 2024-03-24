import java.util.Scanner;
public class Repeticao33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as temperaturas (digite 'fim' para encerrar):");

        double soma = 0;
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;
        int quantidade = 0;

        while (true) {
            String entrada = scanner.nextLine();
            if (entrada.equalsIgnoreCase("fim")) {
                break;
            }
            try {
                double temperatura = Double.parseDouble(entrada);
                soma += temperatura;
                quantidade++;
                if (temperatura < menor) {
                    menor = temperatura;
                }
                if (temperatura > maior) {
                    maior = temperatura;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite um número ou 'fim' para encerrar.");
            }
        }

        if (quantidade == 0) {
            System.out.println("Nenhuma temperatura foi inserida.");
        } else {
            double media = soma / quantidade;
            System.out.println("Menor temperatura: " + menor);
            System.out.println("Maior temperatura: " + maior);
            System.out.println("Média das temperaturas: " + media);
        }
    }
}
