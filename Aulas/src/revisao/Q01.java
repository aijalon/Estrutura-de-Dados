package revisao;

public class Q01 {

	public static void main(String[] args) {
		int[] vetor = new int[5];
		int[] vetor2 = {20, 30, 95, 99, 100};
		
		int[][] matriz = new int[5][5];
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = i+1;
		}
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = (i*1)+(j+1);
			}
		}
		
		System.out.print("Vetor: ");
		int mult = 1;
		for (int i = 0; i < vetor.length; i++) {
			//Impressão Vetor
			//System.out.print(vetor[i]+" ");
			mult=mult*vetor[i];
		}
		
		System.out.println(mult);
		
		System.out.print("\nMatriz: \n");
		
		mult=1;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				mult=mult*matriz[i][j];
				
				
				//Impressão Matriz
				//if(j==0) {
				//	System.out.print("| ");
				//}
				//System.out.print(matriz[i][j]+" ");
				//if(j==matriz.length-1) {
				//	System.out.print(" | \n");
				//}
			}
		}
		System.out.println(mult);
		
	}
}
