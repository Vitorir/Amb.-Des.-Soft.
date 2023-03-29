package ordenacao;
import java.util.*;

public class MainQuicksort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de numeros a serem ordenados: ");
        int n = sc.nextInt();
        int[] vetor = new int[n];
        
        Quicksort q = new Quicksort();

        for(int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextInt();
        }

        System.out.println("Desordenado");
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
        
        q.quicksort(vetor, 0, vetor.length - 1);
        
        System.out.println("\n\nOrdenado");
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
    }
}
