import java.util.Scanner;
public class Repeticao45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] gabarito = new String[]{"A", "B", "C", "D", "E", "E", "D", "C", "B", "A"};

        int totalAlunos = 0;
        int maiorAcerto = 0, menorAcerto = 10;
        int totalAcertosTurma = 0;

        boolean outroAluno = true;
        while (outroAluno) {
            totalAlunos++;

            System.out.println("Respostas do aluno " + totalAlunos + ":");
            int acertos = 0;
            for (int i = 0; i < 10; i++) {
                System.out.print("Questão " + (i + 1) + ": ");
                String resposta = scanner.nextLine().toUpperCase();
                if (resposta.equals(gabarito[i])) {
                    acertos++;
                }
            }

            if (acertos > maiorAcerto) {
                maiorAcerto = acertos;
            }
            if (acertos < menorAcerto) {
                menorAcerto = acertos;
            }

            totalAcertosTurma += acertos;

            System.out.print("Outro aluno vai utilizar o sistema? (S/N): ");
            String resposta = scanner.nextLine();
            outroAluno = resposta.equalsIgnoreCase("S");
        }

        double mediaTurma = (double) totalAcertosTurma / totalAlunos;

        System.out.println("\nResultados:");
        System.out.println("Maior Acerto: " + maiorAcerto);
        System.out.println("Menor Acerto: " + menorAcerto);
        System.out.println("Total de Alunos que utilizaram o sistema: " + totalAlunos);
        System.out.println("Média das Notas da Turma: " + mediaTurma);
    }
}
