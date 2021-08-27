import java.util.Arrays;

// o algoritmo de counting sort possui complexidade O(n) 

public class CountingSort {
    static int[] contarElementos(int[] entrada, int n) { // n = valor do maior elemento em entrada[]
        int[] c = new int[n+1]; // cria uma array c de n+1 elementos

        Arrays.fill(c, 0); // preenche a array c com 0

        for (int i:entrada) { // frequência
            c[i] += 1; // atribui os valores de entrada em c e soma 1
        }

        for (int i=1; i<c.length; i++) { 
            c[i] += c[i-1]; 
        }

        return c;
    }

    static int[] countingSort(int[] entrada, int n) {
        int[] c = contarElementos(entrada, n);

        int[] ordenados = new int[entrada.length];

        for(int i=entrada.length-1; i>=0; i--) {
            int atual = entrada[i];
            ordenados[c[atual]-1] = atual;
            c[atual] -= 1;
        }

        return ordenados;
    }

    public static void main(String[] args) {
        int valorMax = 20000;
        int tamanho = 25;
        int arr[] = ArrayRandom.gerarArr90(tamanho, valorMax);

        System.out.println(tamanho + " elementos na array"); 
        System.out.println(valorMax + ": maior valor dentro da array");

        long startTime = System.nanoTime();

        countingSort(arr, valorMax);

        long endTime = System.nanoTime();

        long elapsed = endTime - startTime;
        double seconds = (double)elapsed / 1_000_000_000.0; // converte pra segundos
        
        System.out.println("Nano: " + elapsed);
        System.out.println("Segundos: " + seconds);

        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}