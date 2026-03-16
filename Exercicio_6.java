package Lista_1;

import java.util.Scanner;

public class Exercicio_6 {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		
		int dia = 0;
		
		System.out.println("Digite um número entre 1 e 7:");
		dia = s.nextInt();
		
		if (dia == 1) {
			System.out.println("Seu dia é Domingo"); }
			
			else if (dia == 2) {
				System.out.println("Seu dia é Segunda-feira"); }
		
			else if (dia == 3) {
				System.out.println("Seu dia é Terça-feira");}
		
			else if (dia == 4) {
				System.out.println("Seu dia é Quarta-feira");}
		
			else if (dia == 5) {
				System.out.println("Seu dia é Quinta-feira");}
		
			else if (dia == 6) {
				System.out.println("Seu dia é Sexta-feira");}
		
			else if (dia == 7) {
				System.out.println("Seu dia é Sábado");}
		
			else {
				System.out.println("Digite um número entre 1 e 7");
				System.out.println("Reinicie o programa");}
		
		
			}

		}
	


