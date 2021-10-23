package vetor;

import java.util.Scanner;

public class atv4 {

public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	float[] n = new float[4];
	String num = "";
	int media = 0;
	
	System.out.println("Digite suas 4 notas: ");
	for(int i = 0; i < 4; i++){
		
	    n[i] = entrada.nextFloat();

	    num += "Nota: " + n[i] + "\n";
        media += (n[i]);
	}
	
    media = media / 4;
    
	System.out.println( num + "Média: " + media);
		 	 	
	 entrada.close();
 
	 }
}
