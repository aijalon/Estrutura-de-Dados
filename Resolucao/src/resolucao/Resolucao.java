package resolucao;

public class Resolucao {

	public void imprimirIndicesPares(int[] vetor) {
		for (int i = 1; i < vetor.length; i+=2) {
			System.out.println(vetor[i]);
		}
	}
	
	public void imprimirElementosPares(int[] vetor) {
		for(int i = 0; i< vetor.length; i++) {
			if(vetor[i]%2==0) {
				System.out.print(vetor[i]+" ");
			}
		}
	}
	
	public void menorNumero(int[] vetor) {
		int menorNumero = vetor[0];
		
		for(int i = 0; i< vetor.length; i++) {
			if(vetor[i]<menorNumero) {
				menorNumero = vetor[i];
			}
		}
		
		System.out.println("O menor número do vetor é: "+menorNumero);
	}
	
	public void somaVetores(int[] vetor1, int[] vetor2) {
		int[] soma = new int[10];
		for (int i = 0; i < vetor1.length; i++) {
			soma[i] = vetor1[i]+vetor2[i];
			System.out.print(soma[i]+" ");
		}
	}
	
	public void produtoVetores(int[] vetor1, int[] vetor2) {
		int[] produto = new int[10];
		for (int i = 0; i < vetor1.length; i++) {
			produto[i] = vetor1[i]*vetor2[i];
			System.out.print(produto[i]+" ");
		}
	}
}
