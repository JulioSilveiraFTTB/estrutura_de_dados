package com.uri;
import java.io.IOException;
import java.util.Scanner;
public class Recreio {
    public static void main(String args[]) throws IOException{
        int N, alunos = 0, a, b, aux, quantidade;
        int vetorAntes[] = new int [1000], vetorDepois[] = new int[1000];
        boolean troca;

        Scanner in = new Scanner(System.in);

        N = in.nextInt();

        for(int i=0; i<N; i++){
            quantidade = 0;
            alunos = in.nextInt();

            for(a=0; a<alunos; a++){
                vetorAntes[a] = in.nextInt();
                vetorDepois[a] = vetorAntes[a];
            }

            do {
                troca = false;
                b = 0;

                while(b < alunos-1){
                    if(vetorDepois[b] < vetorDepois[b+1]){
                        aux = vetorDepois[b];
                        vetorDepois[b] = vetorDepois[b+1];
                        vetorDepois[b+1] = aux;
                        troca = true;
                    }
                    b++;
                }
            } while (troca == true);

            for(b=0; b<alunos; b++)
                if(vetorAntes[b] == vetorDepois[b])
                    quantidade++;

                    System.out.println(quantidade);
            }
        }
}