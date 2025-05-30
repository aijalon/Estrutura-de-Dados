package resolucao;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numeros;
		
		int tamanhoVetor;
		
		System.out.println("Digite o tamanho do vetor: ");
		tamanhoVetor = scanner.nextInt();
		
		numeros = new int[tamanhoVetor];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Informe o elemento "+(i+1)+": ");
			numeros[i] = scanner.nextInt();
		}
		
		int menor = numeros[0];
		
		for (int i = 1; i < numeros.length; i++) {
			if(numeros[i]<menor) {
				menor=numeros[i];
			}
		}
		
		System.out.println("O menor valor informado foi: "+menor);

	}

}
