package primo;
import java.util.*;

public class MainPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de casos de teste: ");
        int N = sc.nextInt();

        Primo primo = new Primo();
        primo.verifica_primo(N);
    }
}
