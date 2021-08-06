import java.io.IOException;
import java.util.Scanner;
public class Voleibol {
    public static void main(String args[]) throws IOException{
        Scanner entrada = new Scanner(System.in);
        int N;
        String nome;
        double bloqueio, saque, ataque;

        N = entrada.nextInt();

        int[] dados = new int[6];

        for(int i = 0; i < N; i++){
            nome = entrada.nextLine();
            entrada.next();
            for(int j = 0; j < dados.length; j++){
                dados[j] += entrada.nextInt(); 
                }
        }

        bloqueio = (dados[3] * 100.0) / dados[0];
        saque = (dados[4] * 100.0) / dados[1];
        ataque = (dados[5] * 100.0) / dados[2];

        System.out.println(String.format("Pontos de Saque: %.2f", bloqueio) + " %.");
		System.out.println(String.format("Pontos de Bloqueio: %.2f", saque) + " %.");
		System.out.println(String.format("Pontos de Ataque: %.2f", ataque) + " %.");

    }   
}