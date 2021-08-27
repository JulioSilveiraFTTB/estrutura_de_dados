import java.util.Random;

public class ArrayRandom {
    static int[] gerarArr90(int tamanho, int maiorElemento) {
        Random r = new Random();
        int n = tamanho;

        int[] arr = new int[n];
        int numeroRepetido;

        do {
            numeroRepetido = r.nextInt(maiorElemento); // gerar int random não-negativo
        } while (numeroRepetido > maiorElemento);

        for (int i=0; i<arr.length; i++) {
            if (i < (arr.length*0.9)) { // ~90% dos valores são iguais
                arr[i] = numeroRepetido;
            } else {
                int random;
                do {
                    random = r.nextInt(maiorElemento);
                } while (random >= maiorElemento);
                arr[i] = random;
            }
        }
        arr[arr.length-1] = maiorElemento;

        return arr;
    }

    static int[] gerarArrRandom(int tamanho, int maiorElemento) {
        Random r = new Random();
        int n = tamanho;

        int[] arr = new int[n];

        for (int i=0; i<arr.length; i++) {
            int random;
            do {
                random = r.nextInt(maiorElemento);
            } while (random >= maiorElemento);
            arr[i] = random;
        }
        arr[arr.length-1] = maiorElemento;

        return arr;
    }
}
