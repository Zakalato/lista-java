package Lista_1;

import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		
    Scanner s = new Scanner(System.in);
    
    
    System.out.println("Digite sua idade");
    int idade = s.nextInt();
    
    if (idade < 16) {
    	System.out.println("Você não é eleitor");
    }
    
          else if (idade == 16 || idade == 17 || idade >= 65 && idade < 135) {
    		System.out.println("Você é eleitor facultativo");
    	}
    
          else if (idade >= 135) {
        	  System.out.println("Digite uma idade realista");
          }
    
    
    	else { System.out.println("Você é eleitor obrigatorio");
    	}
    
    }
	
	}

