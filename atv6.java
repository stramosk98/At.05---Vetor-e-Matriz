package vetor;

import java.util.Scanner;

public class atv6 {

public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	int[] n = new int[20];

	String num = "";
	String par = "";
	String impar = "";

	for(int i = 0; i < 20; i++){

	    n[i] = entrada.nextInt();

	    num += n[i] + " | ";
	    
	    if(n[i] % 2 == 0) 
	    	par += n[i] + " | ";
	    
	    else 
	    	impar += n[i] + " | ";
	}
	
	System.out.println("Números: " + num + "\nNúmeros pares: " + par + "\nNúmeros ímpares: " + impar);
		 	 	
	 entrada.close();
 
	 }
}
