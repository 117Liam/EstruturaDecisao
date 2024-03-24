import java.util.Scanner;
public class Repeticao40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigoCidade, numVeiculos, numAcidentes;
        int maiorIndiceAcidentes = Integer.MIN_VALUE, menorIndiceAcidentes = Integer.MAX_VALUE;
        int codigoMaiorIndice = 0, codigoMenorIndice = 0;
        int totalVeiculos = 0, totalCidadesMenos2000 = 0, totalAcidentesMenos2000 = 0;
        int totalCidades = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Cidade " + i + ":");
            System.out.print("Digite o código da cidade: ");
            codigoCidade = scanner.nextInt();
            System.out.print("Digite o número de veículos de passeio em 1999: ");
            numVeiculos = scanner.nextInt();
            System.out.print("Digite o número de acidentes de trânsito com vítimas em 1999: ");
            numAcidentes = scanner.nextInt();

            totalVeiculos += numVeiculos;
            totalCidades++;

            if (numVeiculos < 2000) {
                totalCidadesMenos2000++;
                totalAcidentesMenos2000 += numAcidentes;
            }

            double indiceAcidentes = (double) numAcidentes / numVeiculos;
            if (indiceAcidentes > maiorIndiceAcidentes) {
                maiorIndiceAcidentes = (int) indiceAcidentes;
                codigoMaiorIndice = codigoCidade;
            }
            if (indiceAcidentes < menorIndiceAcidentes) {
                menorIndiceAcidentes = (int) indiceAcidentes;
                codigoMenorIndice = codigoCidade;
            }
        }

        System.out.println("\nMaior índice de acidentes de trânsito:");
        System.out.println("Cidade: " + codigoMaiorIndice);
        System.out.println("Índice de acidentes: " + maiorIndiceAcidentes);

        System.out.println("\nMenor índice de acidentes de trânsito:");
        System.out.println("Cidade: " + codigoMenorIndice);
        System.out.println("Índice de acidentes: " + menorIndiceAcidentes);

        System.out.println("\nMédia de veículos nas cinco cidades juntas: " + (totalVeiculos / totalCidades));

        if (totalCidadesMenos2000 > 0) {
            System.out.println("Média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio: " + (totalAcidentesMenos2000 / totalCidadesMenos2000));
        } else {
            System.out.println("Nenhuma cidade com menos de 2.000 veículos de passeio foi registrada.");
        }
    }
}
// Não consegui fazer direito