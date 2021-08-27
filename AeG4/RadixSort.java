import java.io.BufferedWriter;

// Radix sort Java implementation

public class RadixSort {
             
    
    public static void radixSort(int[] lista, int maior){
        int tamanhoNmro = tamanhoDoNumero(maior);
        int posicao = 1;

        while (tamanhoNmro-- > 0) {
            countingsort(lista, posicao);
            posicao *= 10;
        }

    }

    public static int tamanhoDoNumero(int nmro){
        char[] n = String.valueOf(nmro).toCharArray();
        return n.length;
    }

    private static void countingsort(int[] numbers, int posicao) {
        int range = 10;

        int length = numbers.length;
        int[] frequency = new int[range];
        int[] sortedValues = new int[length];

        for (int i = 0; i < length; i++) {
            int digit = (numbers[i] / posicao) % range;
            frequency[digit]++;
        }

        for (int i = 1; i < range; i++) {
            frequency[i] += frequency[i - 1];
        }

        for (int i = length - 1; i >= 0; i--) {
            int digit = (numbers[i] / posicao) % range;
            sortedValues[frequency[digit] - 1] = numbers[i];
            frequency[digit]--;
        }

        System.arraycopy(sortedValues, 0, numbers, 0, length);
    }



}
