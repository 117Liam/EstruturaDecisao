import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Repeticao46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      List<Double> saltos = new ArrayList<Double>();

        while (true) {
            System.out.print("Nome do atleta: ");
            String nome = scanner.nextLine();

            if (nome.isEmpty()) {
                break;
            }

            System.out.println("Informe as distâncias alcançadas nos cinco saltos:");
            for (int i = 1; i <= 5; i++) {
                System.out.print("Salto " + i + ": ");
                double distancia = scanner.nextDouble();
                saltos.add(distancia);
            }
            scanner.nextLine(); 

            double melhorSalto = Double.MIN_VALUE;
            double piorSalto = Double.MAX_VALUE;
            double soma = 0;

            for (double salto : saltos) {
                if (salto > melhorSalto) {
                    melhorSalto = salto;
                }
                if (salto < piorSalto) {
                    piorSalto = salto;
                }
                soma += salto;
            }

            soma -= melhorSalto;
            soma -= piorSalto;
            double media = soma / 3;

            System.out.println("\nResultado final:");
            System.out.println("Melhor salto: " + melhorSalto + " m");
            System.out.println("Pior salto: " + piorSalto + " m");
            System.out.println(nome + ": " + String.format("%.1f", media) + " m\n");
            saltos.clear();
        }
    }
}
