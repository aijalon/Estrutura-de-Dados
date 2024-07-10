package resolucao;

public class Principal {

	public static void main(String[] args) {

		Resolucao resolucao = new Resolucao();

		int[] vetor = { 0, 1 ,2 ,3 ,4, 5, 6, 7, 8, 9};
		int[] vetor2 = { 20, 12 ,24 ,35 ,45, 56, 63, 72, 83, 91};

		//resolucao.imprimirIndicesPares(vetor);

		//resolucao.imprimirElementosPares(vetor);

		//resolucao.menorNumero(vetor);

		//resolucao.somaVetores(vetor, vetor2);
		resolucao.produtoVetores(vetor, vetor2);

	}

}
