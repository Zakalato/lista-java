package Lista_1;

import java.util.Scanner;

public class Execicios_5 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int prato;
		int sobremesa;
		int bebida;

		int calorias = 0;
		
		System.out.println("Escolha seu prato:");
		System.out.println("1 - Vegetariano (cal:180)");
		System.out.println("2 - Peixe (cal:230)");
		System.out.println("3 - Frango (cal:250)");
		System.out.println("4 - Carne (cal350)");
		prato = s.nextInt();
		
		if (prato == 1) {
			calorias += 180;}
		
		else if (prato == 2 ) {
			calorias += 230;}
		
		else if (prato == 3 ) {
			calorias += 250;}
		
		else if (prato == 4) {
			calorias += 350;}
		
		System.out.println("Escolha sua sobremesa:");
		System.out.println("1 - Abacaxi (cal:75)");
		System.out.println("2 - Sorvete diet (cal:110)");
		System.out.println("3 - Mouse diet (cal:170)");
		System.out.println("4 - Mouse chocolate (cal:200)");
		sobremesa = s.nextInt();
		
		if (sobremesa == 1) {
			calorias += 75; }
		
		else if (sobremesa == 2) {
			calorias += 110; }
		
		else if (sobremesa == 3) {
			calorias += 170; }
		
		else if (sobremesa == 4) {
			calorias += 200; }
		
		System.out.println("Escolha sua bebida:");
	    System.out.println("1 - Chá (cal:20)");
	    System.out.println("2 - Suco de Laranja (cal:70)");
	    System.out.println("3 - Suco de Melão (cal:100)");
	    System.out.println("4 - Refrigerante diet (cal:65)");
	    bebida = s.nextInt();
	    
	    if (bebida == 1) {
	    	calorias += 20; }
	    
	    else if (bebida == 2) {
	    	calorias += 70; }
	    
	    else if (bebida == 3) {
	    	calorias += 100; }
	    
	    else if (bebida == 4) {
	    	calorias += 65; }
	    
	    System.out.println("Total de calorias: " + calorias + " calorias");
	    }

	
	  }
		
		
	
	
