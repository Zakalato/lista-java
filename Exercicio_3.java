package Lista_1;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite seu saldo médio:");
		double saldo = s.nextDouble();
		
		double credito;
		
		if (saldo <= 500 ) {
			credito = 0;
		}
		
		else if (saldo <= 1000) {
			credito = saldo * 0.30;
		}
		
		else if (saldo <= 3000) {
		    credito = saldo * 0.40;
		}
		
		
		else {
		    credito = saldo * 0.50;
		}
		
		System.out.println("Saldo médio: " + saldo);
		System.out.println("Crédito concedido: " + credito);
			
			
		}

	}
