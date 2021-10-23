package vetor;

import java.util.Scanner;

public class atv7 {

public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	float[] n = new float[2];

	String acima = "";
	float n1, n2, n3, n4;

	for(int i = 0; i < 2; i++){
		 n[i] = entrada.nextFloat();	
	
	   System.out.println("Informe quatro notas do aluno: "); 
	   n1 = entrada.nextFloat();
	   n2 = entrada.nextFloat();
	   n3 = entrada.nextFloat();
	   n4 = entrada.nextFloat();
	   
	   if((n1 + n2 + n3 + n4) / 4 >= 7.0)
		   acima += n[i] + " | ";
	}
	
	System.out.println("Alunos Acima da Média: " + acima);
		 	 	
	 entrada.close();
 
	 }
}
