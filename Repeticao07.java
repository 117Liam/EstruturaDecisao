import java.util.Scanner;
public class Repeticao07 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num, maior = 0;
    for(int i = 0; i < 5; i++){
      System.out.println("Digite um número: ");
      num = input.nextInt();
      if(num > maior){
        maior = num;
      }
    }
    System.out.println("O maior número é: " + maior);

    input.close();
    
  }
    
 
}