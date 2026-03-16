package Lista_1;

import java.util.Scanner;

public class Exercicio_9 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		// Valores
		
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int n4 = 0;
		int n5 = 0;
		
		System.out.println("Vamos calcular a média de 5 números inteiros");
		System.out.println("Digite seu priemiro número:");
		n1 = s.nextInt();
		
		System.out.println("Digite seu segundo número:");
		n2 = s.nextInt();
		
		System.out.println("Digite seu terceiro número:");
		n3 = s.nextInt();
		
		System.out.println("Digite seu quarto número:");
		n4 = s.nextInt();
		
		System.out.println("Digite seu quinto número:");
		n5 = s.nextInt();
		
		
        double media = (n1 + n2 + n3 + n4 + n5) / 5.0;
        
        System.out.println("A média é: " + media);
        
        if (n1 > media) {
            System.out.println(n1 + " é maior que a média");
        }
        
        if (n2 > media) {
            System.out.println(n2 + " é maior que a média");
        }
        
            if (n3 > media) {
                System.out.println(n3 + " é maior que a média");
                
            }
            if (n4 > media) {
                System.out.println(n4 + " é maior que a média");
            }
            if (n5 > media) {
                System.out.println(n5 + " é maior que a média");
            }
        }

	}


