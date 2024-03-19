// Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido
import java.util.Scanner;
public class Repetição01 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int nota;

    System.out.println("Digite uma nota: ");
    nota = input.nextInt();

    while (nota > 10 || nota < 0) {
      if (nota <= 10 && nota >= 0) {
        System.out.println("Nota válida");
      } else {
        System.out.println("Nota inválida. Digite novamente");
      }
      System.out.println("Digite uma nota: ");
      nota = input.nextInt();
    }   
  }
}
