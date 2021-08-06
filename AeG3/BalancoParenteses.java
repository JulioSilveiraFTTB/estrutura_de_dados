import java.util.Scanner;
public class BalancoParenteses {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        while(entrada.hasNext()){
            String expressao = entrada.nextLine();
            int aberta = 0;
            boolean errado = false;

            for(int i = 0; i < expressao.length(); i++){
                char caracter = expressao.charAt(i);

                if(caracter == ')'){
                    if(aberta == 0){
                        errado = true;
                        break;
                    }
                    aberta--;
                } else if(caracter == '('){
                    aberta++;
                }
            }

            if(errado || aberta > 0){
                System.out.println("incorrect");
            } else {
	            System.out.println("correct");
	        }
        }
    }
}
