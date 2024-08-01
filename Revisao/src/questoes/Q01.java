package questoes;

import java.util.ArrayList;

public class Q01 {

	public void vetorSemArray() {
		int[] vetor = {1, 2, 3, 4, 5};

		for(int i = vetor.length-1; i>=0; i--) {
			System.out.println(vetor[i]);
		}
	}

	public void vetorComArray() {
		ArrayList<Integer> vetor = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			vetor.add(i+1);
		}
		
		for (int i = vetor.size()-1; i>=0 ; i--) {
			System.out.println(vetor.get(i));
		}

	}

}
