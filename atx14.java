package vetor;

import java.util.Scanner;

public class atx14 {

public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	int[] n = new int[10];
	int[] m = new int[10];
	int[] p = new int[20];
	int j = 0; 

	for(int i = 0; i < 10; i++){
		System.out.println("Digite um valor: " );
	    n[i] = Integer.parseInt(entrada.nextLine());
	   
	}
	
	for(int i = 0; i < 10; i++){
		System.out.println("Digite um valor: " );
	    m[i] = Integer.parseInt(entrada.nextLine());
	   
	}
		
	for(int i = 0; i < 10; i++){
		p[j] = n[i];
		j++;
		p[j] = m[i];
		j++;
	}
	
		System.out.println("Números do vetor 3: ");
		for(int i = 0; i < 20; i++){	
		System.out.println(p[i]);
	}
		
	 entrada.close();
 
	 }
}
