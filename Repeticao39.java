import java.util.Scanner;
public class Repeticao39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroAlunoMaisAlto = 0, numeroAlunoMaisBaixo = 0;
        int alturaAlunoMaisAlto = Integer.MIN_VALUE, alturaAlunoMaisBaixo = Integer.MAX_VALUE;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número do aluno " + i + ": ");
            int numeroAluno = scanner.nextInt();
            System.out.print("Digite a altura do aluno " + i + " em centímetros: ");
            int alturaAluno = scanner.nextInt();

            if (alturaAluno > alturaAlunoMaisAlto) {
                numeroAlunoMaisAlto = numeroAluno;
                alturaAlunoMaisAlto = alturaAluno;
            }

            if (alturaAluno < alturaAlunoMaisBaixo) {
                numeroAlunoMaisBaixo = numeroAluno;
                alturaAlunoMaisBaixo = alturaAluno;
            }
        }

        System.out.println("\nAluno mais alto:");
        System.out.println("Número do aluno: " + numeroAlunoMaisAlto);
        System.out.println("Altura: " + alturaAlunoMaisAlto + " centímetros");

        System.out.println("\nAluno mais baixo:");
        System.out.println("Número do aluno: " + numeroAlunoMaisBaixo);
        System.out.println("Altura: " + alturaAlunoMaisBaixo + " centímetros");
    }
}
