import java.util.Scanner;
public class Repeticao27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de turmas: ");
        int quantidadeTurmas = scanner.nextInt();

        if (quantidadeTurmas <= 0) {
            System.out.println("Número inválido de turmas.");
            return;
        }

        int totalAlunos = 0;

        for (int i = 1; i <= quantidadeTurmas; i++) {
            System.out.print("Digite a quantidade de alunos na turma " + i + ": ");
            int quantidadeAlunos = scanner.nextInt();

            if (quantidadeAlunos <= 0 || quantidadeAlunos > 40) {
                System.out.println("Quantidade inválida de alunos. Cada turma deve ter entre 1 e 40 alunos.");
                return;
            }

            totalAlunos += quantidadeAlunos;
        }

        double mediaAlunosPorTurma = (double) totalAlunos / quantidadeTurmas;

        System.out.println("O número médio de alunos por turma é: " + mediaAlunosPorTurma);
    }
}
