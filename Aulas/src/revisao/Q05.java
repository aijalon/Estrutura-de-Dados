package revisao;

public class Q05 {

	public static void main(String[] args) {
int[] vetor = new int[5];
		
		int[][] matriz = new int[5][5];
		
		//preencher vetor
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = i+1;
		}
		
		//preencher matriz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = (i*1)+(j+1);
			}
		}
		
		System.out.print("Vetor: ");
		int soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i]%2==1) {
				soma= soma + vetor[i];				
			}
		}
		
		System.out.print(soma);
		System.out.print("\nMatriz: \n");
		soma=0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if(matriz[i][j]%2==1) {
					soma = soma+matriz[i][j];					
				}
			}
		}
		
		System.out.print(soma);

	}
}
