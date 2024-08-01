package questoes;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Q02 {

	public void matrizSemArray() {
		int[][] matriz1 = new int[3][3];
		int[][] matriz2 = new int[3][3];
		int soma = 0;
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz2.length; j++) {
				matriz1[i][j] = soma;
				matriz2[i][j] = soma;
				soma++;
			}
		}
		
		for (int i = 0; i < matriz2.length; i++) {
			System.out.print("| ");
			for (int j = 0; j < matriz2.length; j++) {
				if(j+1==matriz1.length) {				
					System.out.print((matriz1[i][j]+matriz2[i][j])+" | \n");
				}else
				System.out.print((matriz1[i][j]+matriz2[i][j])+" , ");
			}
		}
	}
	
	public void matrizComArray() {
		ArrayList<ArrayList<Integer>> matriz1 = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> matriz2 = new ArrayList<ArrayList<Integer>>();
		int soma = 0;
		
		for (int i = 0; i < 3; i++) {
			ArrayList<Integer> linha = new ArrayList<Integer>();
			for (int j = 0; j < 3; j++) {
				linha.add(soma);
				soma++;
			}
			matriz1.add(linha);
			matriz2.add(linha);
		}
		
		for (int i = 0; i < matriz1.size(); i++) {
			System.out.print("| ");
			for (int j = 0; j < matriz2.size(); j++) {
				if(j+1==matriz1.size()) {				
					System.out.print((matriz1.get(i).get(j)+matriz2.get(i).get(j))+" | \n");
				}else
				System.out.print((matriz1.get(i).get(j)+matriz2.get(i).get(j))+" , ");
			}
		}

	}
}
