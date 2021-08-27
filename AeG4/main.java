import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class main {
    // Os testes gerados foram:
    //maiorValor 200, tamanho 100
    //maiorValor 500, tamanho 500
    //maiorValor 2000, tamanho 5000
    //maiorValor 10000, tamanho 25000
    //maiorValor 100000, tamanho 250000
    //maiorValor 777777, tamanho 7777777
    public static void main(String[] args) throws IOException {
        String file = "resultadoB.csv";
        String fileOrdenado = "ordenado.txt";
        
        BufferedWriter w = new BufferedWriter(new FileWriter(file, true));

        int maiorValor = 777777;
        int tamanho = 7777777;
            
        // int[] x = generateData.getData(maiorValor); //só vai gerar o valor exato se o número for par
        int[] x = ArrayRandom.gerarArrRandom(tamanho, maiorValor);

        // por sempre o algoritmo aqui entre essa variáveis
        long startTime = System.nanoTime();
            
            // RadixSort.radixSort(x, maiorValor);                      // O(d(n+b)) complexidade
            // CountingSort.countingSort(x, maiorValor);
            MergeSort.mergeSort(tamanho, x);
        
        long endTime = System.nanoTime();

        long elapsed = endTime - startTime;
        double seconds = (double)elapsed / 1_000_000_000.0; // converte pra segundos


        // w.append("TIPO,TAMANHO_ENTRADA,MAIOR_VALOR,SEGUNDOS,NANO");
        // w.newLine();
        w.append("MERGE_SORT");
        w.append(",");
        w.append(String.valueOf(tamanho)); //TAMANHO_ENTRADA
        w.append(",");
        w.append(String.valueOf(maiorValor)); //MAIOR_VALOR
        w.append(",");
        w.append(String.valueOf(seconds)); //SEGUNDOS
        w.append(",");
        w.append(String.valueOf(elapsed)); //NANO
        w.newLine();

        System.out.println("Teste concluído ");
        
        // foi pedido que o array ordenado fosse posto em um arquivo, acredito que pra ele veja que tá realmente funcionando
        // pro radix ficaria assim
        // BufferedWriter w2 = new BufferedWriter(new FileWriter(fileOrdenado));
        
        // for (int i = 0; i < x.length; i++) {
        //     w2.append(String.valueOf(x[i]) + ","); // esse algoritmo de radix sort que peguei ele não tem retorno
        //                                      // ele meio que organiza já o array passado pra ele então seria só isso
        //                                      // mas nos casos que o algoritmo retorna aí isso vai ser diferente.......
        // }

        w.close();  
        // w2.close();
    }
    
}
