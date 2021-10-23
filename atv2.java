package vetor;

import java.util.Scanner;

public class atv2 {

public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
    int[] n = new int[10];
    
    
    for(int i = 0; i < n.length; i++){
        System.out.println("Digite um número");
        n[i] = entrada.nextInt();
    }
    
    
    for(int i = n.length-1; i >= 0; i--){
        System.out.println(n[i]);
    }
    
	 entrada.close();
 
	 }
}
