package prova;

public class Q03 {

	public static void main(String[] args) {
		int[][] matriz = new int[10][10];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = (i*j)+1;
			}
		}
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if(i==j) {
					System.out.print(matriz[i][j]+" ");
				}
			}
		}
	}
}
