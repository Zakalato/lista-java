package Lista_1;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("Insira seu peso em Kg:");
		double peso = s.nextDouble();
		
		System.out.println("Insira seu altura em centímetros:");
		double altura = s.nextDouble();
		
		//Calculo
		
		double alturaMetros = altura / 100.0;
        double imc = peso / Math.pow(alturaMetros, 2);

        if (imc < 20) {
            System.out.println("Seu IMC está abaixo de 20 (Abaixo do peso)");
        }
            
            else  if (imc >= 20 && imc < 25) {
                System.out.println("Seu IMC está entre 20 e abaixo de 25 (Peso normal)");
            }
        
            else if (imc >= 25 && imc < 30) {
            	System.out.println("Seu IMC está entre 25 e abaixo de 30 (Sobre peso)");
            }
            else if (imc >= 30 && imc < 40) {
            	System.out.println("Seu IMC está entre 30 e abaixo de 40 (Obeso)");
            }
            else if (imc >= 40) {
            	System.out.println("Seu IMC está acima de  40 (Obeso Mórbido)");
            }

	}

}
