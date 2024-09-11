package bubble;

import java.util.LinkedList;

public class Bubble {

	public int[] bubbleSort(int[] vetor) {
		int n = vetor.length;
		boolean mudou;
		
		for(int i = 0; i<n-1; i++) {
			mudou = false;
			for(int j = 0; j<n-i-1; j++) {
				if(vetor[j]>vetor[j+1]) {
					int auxiliar = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = auxiliar;
					mudou =true;
				}
			}
			
			if(!mudou) {
				break;
			}

		}
		
		return vetor;

	}
	
	public LinkedList<Integer> bubbleSort(LinkedList<Integer> lista) {
		int n = lista.size();

		for(int i = 0; i<n-1; i++) {
			for(int j = 0; j<n-i-1; j++) {
				if(lista.get(j)>lista.get(j+1)) {
					int auxiliar = lista.get(j);
					lista.set(j, lista.get(j+1));
					lista.set(j+1, auxiliar);
				}
			}

		}
		return lista;
	}
}
