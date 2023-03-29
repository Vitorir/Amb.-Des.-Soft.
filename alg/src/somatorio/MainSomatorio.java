package somatorio;

public class MainSomatorio {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        Somatorio somatorio = new Somatorio(numeros);
        int resultado = somatorio.soma(numeros);
        
        System.out.println("A soma dos numeros é: " + resultado);
    }
}
