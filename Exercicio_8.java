package Lista_1;

import java.util.Scanner;

public class Exercicio_8 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		//Valores
		
		double num1 = 0;
		double num2 = 0;
		double num3 = 0;
		double num4 = 0;
		
		
		System.out.println("Vamos calcular sua média");
		System.out.println("Digite sua primeira nota:");
		 num1 = s.nextDouble();
		
		System.out.println("Digite sua segunda nota:");
		 num2 = s.nextDouble();
		
		System.out.println("Digite sua terceira nota:");
		 num3 = s.nextDouble();
		
		System.out.println("Digite sua quarta nota:");
		 num4 = s.nextDouble();
		
		 double media = (num1 + num2 + num3 + num4) / 4;

		 if (media >= 7.0) {
		     System.out.println("Você foi aprovado, parabéns!!!");
		     System.out.println("Sua média:" + media);
		 }
		 else {
			 
			 System.out.println("Você precisará da nota do exame");
			 System.out.println("Digite a nota do exame:");
			 double exame = s.nextDouble();
			 
			 double novaMedia = (media + exame) / 2;
			 
			 if (novaMedia >= 5) {
				    System.out.println("Aprovado em exame");
				    System.out.println("Sua média" + novaMedia);
				}
				else {
				    System.out.println("Aluno reprovado");
				    System.out.println("Sua média:" + novaMedia);
				}
	}
	
	}
	
}


