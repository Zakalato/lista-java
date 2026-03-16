package Lista_1;

import java.util.Scanner;

public class Exercicio_7 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int num = 0;
		
		System.out.println("Digite seu número para descobrir se ele é par ou ímpar:");
		num = s.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("Seu número é par"); }
		
		else { System.out.println("Seu número é ímpar"); }
		}
		

	}


