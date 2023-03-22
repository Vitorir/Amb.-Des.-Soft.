package contagem;
import java.util.*;

public class MainContagem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de numeros: ");
        int n = sc.nextInt();

        Contagem c = new Contagem();
        c.conta(n);
    }
}
