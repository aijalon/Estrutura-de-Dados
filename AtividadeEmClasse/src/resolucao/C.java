package resolucao;

public class C {

	public static void main(String[] args) {
		int[] vetor = {2, 0, -2, -10};
		
		int menor = vetor[0];
		
		for (int i = 1; i < vetor.length; i++) {
			if(vetor[i]<menor) {
				menor=vetor[i];
			}
		}
		System.out.println(menor);
	}

}
