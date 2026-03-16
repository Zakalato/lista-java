package Lista_1;

import java.util.Scanner;

public class Exercicio_1 {
	
	

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("Insira o valor para analisar se ele é divisivel por 10, 5 ou 2:");
		int num = s.nextInt();
		
		//variavel 1
		
		String msg = "";
		
		if (num % 10 == 0) {
		msg = (msg + "Divisivel por 10");
		}
		
		if (num % 5 == 0) {
		msg = (msg + " Divisivel por 5");
		}
		
		if (num % 2 == 0) {
		msg = (msg + " Divisivel por 2");
		}
		
		if (msg.equalsIgnoreCase("")) {
			System.out.println("Não é divisivel");
		}
		else {	
		System.out.println(msg);
		}
	}
	
}
	
