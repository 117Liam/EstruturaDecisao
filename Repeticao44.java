import java.util.Scanner;
public class Repeticao44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int votosCandidato1 = 0, votosCandidato2 = 0, votosCandidato3 = 0, votosCandidato4 = 0;
        int votosNulos = 0, votosEmBranco = 0, totalVotos = 0;

        System.out.println("Eleição Presidencial:");
        System.out.println("Códigos de votação:");
        System.out.println("1 - Candidato 1");
        System.out.println("2 - Candidato 2");
        System.out.println("3 - Candidato 3");
        System.out.println("4 - Candidato 4");
        System.out.println("5 - Voto Nulo");
        System.out.println("6 - Voto em Branco");
        System.out.println("0 - Encerrar votação");

        int voto;
        do {
            System.out.print("Digite o código do voto (0 para encerrar): ");
            voto = scanner.nextInt();

            switch (voto) {
                case 1:
                    votosCandidato1++;
                    break;
                case 2:
                    votosCandidato2++;
                    break;
                case 3:
                    votosCandidato3++;
                    break;
                case 4:
                    votosCandidato4++;
                    break;
                case 5:
                    votosNulos++;
                    break;
                case 6:
                    votosEmBranco++;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Código de voto inválido.");
            }

            totalVotos++;

        } while (voto != 0);

        System.out.println("\nResultados da Eleição:");
        System.out.println("Total de votos para o Candidato 1: " + votosCandidato1);
        System.out.println("Total de votos para o Candidato 2: " + votosCandidato2);
        System.out.println("Total de votos para o Candidato 3: " + votosCandidato3);
        System.out.println("Total de votos para o Candidato 4: " + votosCandidato4);
        System.out.println("Total de votos nulos: " + votosNulos);
        System.out.println("Total de votos em branco: " + votosEmBranco);
        System.out.println("Percentagem de votos nulos sobre o total de votos: " + (double) (votosNulos * 100) / totalVotos + "%");
        System.out.println("Percentagem de votos em branco sobre o total de votos: " + (double) (votosEmBranco * 100) / totalVotos + "%");
    }
}
