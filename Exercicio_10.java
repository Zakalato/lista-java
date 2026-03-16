package Lista_1;

import java.util.Scanner;

public class Exercicio_10 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double peso;
        double excesso;
        double multa;

        System.out.println("Digite o peso dos peixes em kg:");
        peso = s.nextDouble();

        if (peso > 500) {

            excesso = peso - 500;
            multa = excesso * 4;

            System.out.println("Peso excedente: " + excesso + " kg");
            System.out.println("Valor da multa: R$ " + multa);

        } else {

            System.out.println("Não há multa por excedente de peso.");

        }

    }

}