package somatorio;
import java.util.*;

public class Somatorio {
    private int[] numeros;

    public Somatorio(int[] numeros) {
        this.numeros = numeros;
    }

    public int soma(int[] n) {
        int resultado = 0;
        for (int i = 0; i < n.length; i++) {
            resultado += numeros[i];
        }
        return resultado;
    }
}
