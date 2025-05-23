package aula1;

import java.util.Arrays;

public class Vetor {
	public static void main(String[] args) {
		double[] notas = {10, 9.5, 8.0, 7.0, 7.5, 9.0, 8.7, 8.9};
		double media = 0;
		double soma = 0;
		
		for(int i = 0; i<notas.length; i++) {
			soma = soma + notas[i];
		}
		
		media = soma/notas.length;
		
		System.out.println(media);
		
		

		
		
		
		
		/*
		 * int[] idade = new int[10]; 
		 * int[] idade2 = {26, 12, 45, 36}; 
		 * int idade3;
		 * Double[] teste = new Double[5];
		 * 
		 * Integer[] cpf = new Integer[5];
		 * 
		 * 
		 * 
		 * //System.out.println(idade[3]);
		 * 
		 * System.out.println(Arrays.toString(idade2)); System.out.println(idade2);
		 */
		
		
		
	}
}
