import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.io.PrintWriter;
public class Trilhos {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String [] args) throws IOException{
        int N, atual, vagao;
        String l;
        String[] vagoes;
        boolean primeiroTeste = true;

        while(!(l = in.readLine()).equals("0")){
            N = Integer.parseInt(l);
            if(primeiroTeste){
                primeiroTeste = false;
            } else{
                System.out.println();
            }

        while(!(l = in.readLine()).equals("0")){
            Stack<Integer> pilha = new Stack<>();
            vagoes = l.split("\\s");
            atual = 0;
            vagao = Integer.parseInt(vagoes[atual]);

            for(int i = 1; i <= N; i++){
                pilha.push(i);
            }

            while(!pilha.isEmpty() && vagao == pilha.lastElement()){
                if(++atual < N){
                    vagao = Integer.parseInt(vagoes[atual]);
                }
                pilha.pop();
            }
            out.println(pilha.isEmpty() ? "Yes" : "No");
        }
        }
        out.println();
        out.close();
    }
}
