package aula2;

import java.util.Scanner;

public class Vetor {
	//1º) Imprimir os elementos pares
	//2º) Encontrar o menor valor do vetor
	//3º) Somar todos os elementos do vetor
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] frutas;
		
		int quantidadeFrutas;
		
		System.out.println("Digite a quatidade de frutas a ser informada: ");
		quantidadeFrutas = scanner.nextInt();
		
		frutas = new String[quantidadeFrutas];
		
		for (int i = 0; i < frutas.length; i++) {
			System.out.println("Informe a fruta "+(i+1)+": ");
			frutas[i] = scanner.next();
		}
		
		for (int i = 1; i < frutas.length; i=i+2) {
			System.out.print(frutas[i]+" ");
		}
		
		
	}
}
