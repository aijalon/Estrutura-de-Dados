package matriz;

import java.util.ArrayList;
import java.util.Arrays;

public class Start {
	
	public static void main(String[] args) {
		int[] vetor = new int[5];
		ArrayList<Integer> vetor2 = new ArrayList<Integer>();		
		
		int[][] matriz = new int[5][5];
		ArrayList<ArrayList<Integer>> matriz2 = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> linha1 = new ArrayList<Integer>();
		ArrayList<Integer> linha2 = new ArrayList<Integer>();
		ArrayList<Integer> linha3 = new ArrayList<Integer>();
		ArrayList<Integer> linha4 = new ArrayList<Integer>();
		ArrayList<Integer> linha5 = new ArrayList<Integer>();
		
	    matriz2.add(linha1);
	    matriz2.add(linha2);
	    matriz2.add(linha3);
	    matriz2.add(linha4);
	    matriz2.add(linha5);
		
		//System.out.println(matriz2.get(0).add(1));
		//System.out.println(matriz2.get(0).add(2));
		//System.out.println(matriz2.get(1).add(2));
		
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				matriz2.get(i).add((i*j)+1);
			}
		}
		
		System.out.println(matriz2);
		System.out.println(matriz2.get(0).get(0));
		
		/*
		 * for (int i = 0; i < matriz.length; i++) { for (int j = 0; j < matriz.length;
		 * j++) { matriz[i][j] = (i*j)+1; } }
		 * 
		 * for (int i = 0; i < matriz.length; i++) { for (int j = 0; j < matriz.length;
		 * j++) { if(j==0) { System.out.print("| "); }
		 * System.out.print(matriz[i][j]+", ");
		 * 
		 * if(j==4) { System.out.print("|\n"); } } }
		 */
		
		
	}

}
