package vetor;

import java.util.Scanner;

public class atx15 {

public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	int[] n = new int[30];
	int[] m = new int[30];
	
	int j = 0; 
	int media = 0;
	for(int i = 0; i < 30; i++){
		System.out.println("Digite uma idade: " );
	    n[i] = Integer.parseInt(entrada.nextLine());
	
	
	
	for(int h = 0; h < 30; h++){
		System.out.println("Digite a altura: " );
	    m[h] = Integer.parseInt(entrada.nextLine());	   
	    media += (m[h]);
	    
	    if(n[i] > 13 && n[i] < media)
		    j += (n[i]);
	}
	}	
	media = media / 30;
	
	System.out.println(j);
		
	 entrada.close();
 
	 }
}
