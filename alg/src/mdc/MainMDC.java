package mdc;
import java.util.*;

public class MainMDC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int a = sc.nextInt();

        System.out.println("Digite um numero: ");
        int b = sc.nextInt();

        MDC mdc = new MDC();
        mdc.calculaMDC(a, b);
    }
}
