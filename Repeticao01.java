import java.util.Scanner;
public class Repeticao01 {
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
