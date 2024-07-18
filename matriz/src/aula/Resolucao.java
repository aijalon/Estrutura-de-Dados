package aula;

import java.util.Arrays;

public class Resolucao {

	public void imprimirIndicesParesPreenchidos(Integer[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			if(i%2==0 && vetor[i]!=null) {
				System.out.println(vetor[i]);	
			}
		}
	}

	public void imprimirElementosPares(int[] vetor) {
		for (int i = 0; i<vetor.length; i++) {
			if(vetor[i]%2==0) {
				System.out.println(vetor[i]);
			}
		}
	}

	public void menorValor(int[] vetor) {
		int menorNumero = vetor[0];

		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i]<menorNumero)
				menorNumero = vetor[i];
		}

		System.out.println(menorNumero);

	}

	public void somaVetores(int[] vetor1, int[] vetor2) {
		int[] vetSoma = new int[11];

		for (int i = 0; i < vetSoma.length; i++) {
			vetSoma[i] = vetor1[i]+vetor2[i];
		}

		System.out.println(Arrays.toString(vetSoma));
	}
	
	public void produtoVetores(int[] vetor1, int[] vetor2) {
		int[] vetProduto = new int[11];

		for (int i = 0; i < vetProduto.length; i++) {
			vetProduto[i] = vetor1[i]*vetor2[i];
		}

		System.out.println(Arrays.toString(vetProduto));
		
	}
}
