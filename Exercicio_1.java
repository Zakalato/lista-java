package Lista_1;

import java.util.Scanner;

public class Exercicio_1 {
	
	

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("Insira o valor para analisar se ele é divisivel por 10, 5 ou 2:");
		int num = s.nextInt();
		
		//variavel 1
		
		if (num % 10!= 0 && num % 5!= 0 && num % 2!= 0) {
			System.out.println("Seu número não é divisível por 10, 5 ou 2"); }
		
		if (num % 10 == 0 || num % 5 == 0 || num % 2 == 0) {
			System.out.println("Seu número é divisível por 10, 5 ou 2"); }
		
	}
	
}
		
		
	