package questoes;

import java.util.ArrayList;

public class Q03 {
	
	public void matrizSemArray() {
		int[][] matriz1 = new int[3][3];
		int soma = 0;
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1.length; j++) {
				matriz1[i][j] = soma;
				soma++;
			}
		}
		int linha = 0;
		
		for (int i = 0; i < matriz1.length; i++) {
			
			for (int j = 0; j < matriz1.length; j++) {
			linha = linha+matriz1[i][j];	
			}
			System.out.println("Linha "+i+" = "+ linha);
			linha=0;
		}
	}
	
	public void matrizComArray() {
		ArrayList<ArrayList<Integer>> matriz1 = new ArrayList<ArrayList<Integer>>();
		int soma = 0;

		for (int i = 0; i < 3; i++) {
			ArrayList<Integer> linha = new ArrayList<Integer>();
			for (int j = 0; j < 3; j++) {
				linha.add(soma);
				soma++;
			}
			matriz1.add(linha);
		}
		
		int linha = 0;
		
		for (int i = 0; i < matriz1.size(); i++) {
			
			for (int j = 0; j < matriz1.size(); j++) {
			linha = linha+matriz1.get(i).get(j);	
			}
			System.out.println("Linha "+i+" = "+ linha);
			linha=0;
		}

	}

}
