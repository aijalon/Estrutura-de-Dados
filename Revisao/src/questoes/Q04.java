package questoes;

import java.util.ArrayList;

public class Q04 {

	public void matrizComArray() {
		ArrayList<ArrayList<Integer>> matriz = new ArrayList<>();

		for(int i = 0; i<10; i++) {
			ArrayList<Integer> linha = new ArrayList<>();
			for(int j = 0; j<10; j++) {
				linha.add((int) Math.pow((i+1)+(j+1), 2));
			}
			matriz.add(linha);
		}


		for(int i = 0; i<matriz.size(); i++) {
			System.out.print("| ");
			for(int j = 0; j<matriz.get(i).size(); j++) {
				if(j+1==matriz.get(i).size()) {
					System.out.print(" "+matriz.get(i).get(j));
					System.out.print(" | \n");
				}else				
					System.out.print(" "+matriz.get(i).get(j));
			}
		}
	}

	public void matrizSemArray() {
int[][] matriz = new int[10][10];
		
		for(int i = 0; i<10; i++) {
			for(int j = 0; j<10; j++) {
				matriz[i][j] = ((int) Math.pow((i+1)+(j+1), 2));
			}
		}
		
		
		for(int i = 0; i<matriz.length; i++) {
			System.out.print("| ");
			for(int j = 0; j<matriz.length; j++) {
				if(j+1==matriz.length) {
					System.out.print(" "+matriz[i][j]);
					System.out.print(" | \n");
				}else				
				System.out.print(" "+matriz[i][j]);
			}
		}
	}

}
