package fibonacci;
import java.util.*;

public class MainFibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		
		System.out.println("Número de termos:");
		int n = s.nextInt();
        
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.fib(n);
    }
}
