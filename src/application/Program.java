package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		  Scanner sc = new Scanner(System.in);

	        System.out.print("Digite uma string :");
	        String input = sc.nextLine();

	        char[] caracteres = input.toCharArray();

	        // Nao sabia como era a logica para inverter uma String 
	        // Conseguentemente tive que pesquisar 
	        String invertida = "";
	        for (int i = caracteres.length - 1; i >= 0; i--) {
	            invertida += caracteres[i];
	        }
	        System.out.println("String invertida: " + invertida);

	        sc.close();
	    }
}


