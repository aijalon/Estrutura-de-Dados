package algoritimos;

import java.util.LinkedList;
import java.util.Queue;

public class Insertion {

	public int[] insertionSort(int[] vetor) {
		int aux, j;
		for (int i = 1; i < vetor.length; i++) {
			aux = vetor[i];
			j=i-1;
			while(j>=0 && vetor[j]>aux) {
				vetor[j+1] = vetor[j];
				j--;
			}
			vetor[j+1] = aux;
		}

		return vetor;
	}


	public LinkedList<Integer> insertionSort(LinkedList<Integer> lista) { int
		aux, j; for (int i = 1; i < lista.size(); i++) { aux = lista.get(i); j=i-1;
		while(j>=0 && lista.get(j)>aux) { lista.set(j+1, lista.get(j)); j--; }
		lista.set(j+1, aux); }

		return lista; }


}
