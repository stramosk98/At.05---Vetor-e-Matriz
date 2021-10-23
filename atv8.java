package vetor;

import java.util.Scanner;

public class atv8 {

public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	int[] n = new int[5];

	String num = "";
	int soma = 0;
	int mult = 1;
	
	
	for(int i = 0; i < 5; i++){

	    n[i] = entrada.nextInt();

	    num +=  n[i] + " | ";	    
	    soma = soma + n[i];	    
	    mult = mult * n[i];
	}
	
	
	System.out.println("Números: " + num + "\nSoma dos Números: " + soma + "\n Multiplicação dos Números : " + mult);
		 	 	
	 entrada.close();
 
	 }
}
