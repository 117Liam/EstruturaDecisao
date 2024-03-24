public class Repeticao04 {
    public static void main(String[] args) {
    int populacaoA = 80000; 
    int populacaoB = 200000; 
    int anos = 0;
      
    while (populacaoA <= populacaoB) {
            populacaoA += (populacaoA * 3) / 100; 
            populacaoB += (populacaoB * 1.5) / 100; 
            anos++; 
        }
        System.out.println("População A: " + populacaoA);
        System.out.println("População B: " + populacaoB);
        System.out.println("Anos necessários: " + anos);
    }
}