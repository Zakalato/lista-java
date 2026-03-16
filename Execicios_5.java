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
		System.out.println("1 - Vegetariano");
		System.out.println("2 - Peixe");
		System.out.println("3 - Frango");
		System.out.println("4 - Carne");
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
		System.out.println("1 - Abacaxi");
		System.out.println("2 - Sorvete diet");
		System.out.println("3 - Mouse diet");
		System.out.println("4 - Mouse chocolate");
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
	    System.out.println("1 - Chá");
	    System.out.println("2 - Suco de Laranja");
	    System.out.println("3 - Suco de Melão");
	    System.out.println("4 - Refrigerante diet");
	    bebida = s.nextInt();
	    
	    if (bebida == 1) {
	    	calorias += 20; }
	    
	    else if (bebida == 2) {
	    	calorias += 70; }
	    
	    else if (bebida == 3) {
	    	calorias += 100; }
	    
	    else if (bebida == 4) {
	    	calorias += 65; }
	    
	    System.out.println("Total de calorias: " + calorias);
	    }

	
	  }
		
		
	
	


