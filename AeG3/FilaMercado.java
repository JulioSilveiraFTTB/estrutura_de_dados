import java.util.Scanner;
import java.util.Arrays;
public class FilaMercado{
	public static void main(String[] args){
		Scanner entrada = new Scanner (System.in);

		int n = entrada.nextInt();
		int m = entrada.nextInt();

		int[] caixa = new int[n];
		int[] cliente = new int[m];
		
		for(int i=0; i<n; i++)
			caixa[i] = entrada.nextInt();
			
		for(int i=0; i<m; i++)
			cliente[i] = entrada.nextInt();
		
		int[] tempo = new int[n];
		int t = 0;
		int time = 0;
		    
            while(t < m){
			    if(t < n){
				tempo[t] = cliente[t] * caixa[t];
				//System.out.println(temp[t]);
				t++;
			    } else{
				int indice = tempo[0];
				int z = 0;
				for(int i=0; i<n; i++)
					if(indice > tempo[i]){
						indice = tempo[i];
						z = i;
			        }
				tempo[z]+= cliente[t] * caixa[z];
				//System.out.println(z);
				z = 0;
				t++;	
			    }
		    }
		    int indice = tempo[0];
		    for(int i=0; i<n; i++)
			    if(indice < tempo[i])
				indice = tempo[i];
		        System.out.println(indice);			
	}
}
