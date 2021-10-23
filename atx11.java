package vetor;

import java.util.Scanner;

public class atx11 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
	     		
		System.out.println("digite uma data: ");
		int n1 = entrada.nextInt();
		int n2 = entrada.nextInt();
		int n3 = entrada.nextInt();
		
		
		
		for(int i = 0; i < 3; i++){
			n1 = entrada.nextInt();
		}
		
		for(int i = 0; i < 3; i++){
			n2 = entrada.nextInt();
		}
		
		for(int i = 0; i < 3; i++){
			n3 = entrada.nextInt();
		}
		
		System.out.println(n1 + n2 + n3);
	        entrada.close();
	}
}