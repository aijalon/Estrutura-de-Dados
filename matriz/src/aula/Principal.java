package aula;

public class Principal {

	public static void main(String[] args) {
		Resolucao resolucao = new Resolucao();
		int[] vetor = {0, 1, 2, 3, 4, -1};
		int[] vetor1 = {10, 2, 2, 3, 4, 5, 6, 7, 8, 9, 1};
		int[] vetor2 = {102, 42, 45, 35, 41, 58, 60, 27, 87, 91, 19};
		
		
		resolucao.produtoVetores(vetor1, vetor2);
		//resolucao.menorValor(vetor);
		//resolucao.imprimirElementosPares(vetor);
		//resolucao.imprimirIndicesParesPreenchidos(vetor2);

	}

}
