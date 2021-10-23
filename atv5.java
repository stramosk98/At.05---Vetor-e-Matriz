package vetor;

import java.util.Scanner;

public class atv5 {

public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	String[] n = new String[10];

	String letra = "";
	
	int soma = 0;

	for(int i = 0; i < 10; i++){

	    n[i] = entrada.next();

	    
	    if(! n[i].equals ("a") &&!n[i].equals ("e") &&! n[i].equals ("i") &&! n[i].equals ("o") &&! n[i].equals ("u")){
        soma += n[i].length();
        letra += n[i] + "\n";
	}
	  	}
	System.out.println(letra + "Soma das consoantes: " + soma);
		 	 	
	 entrada.close();
 
	 }
}
