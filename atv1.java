package vetor;

import java.util.Scanner;

public class atv1 {

public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	int[] n = new int[5];
	String num = "";

		for(int i = 0; i < 5; i++){
	    n[i] = entrada.nextInt();
	    num += n[i] + "\n";

	}

	System.out.println(num);
		 	 	
	 entrada.close();
 
	 }
}
