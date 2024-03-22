import java.util.Scanner;
public class Repetição02 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Digite seu nome de usuário: ");
    String nome = input.nextLine();
    System.out.println("Digite sua senha: ");
    String senha = input.nextLine();
    while(nome.equals(senha)){
      System.out.println("Senha inválida, digite novamente: ");
      senha = input.nextLine();
    }
    System.out.println("Senha válida");    
  }

}
