package prova;

public class Q04 {

	public static void main(String[] args) {
		int[][] A = new int[10][10];
		int[][] B = new int[10][10];
		
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				if(i==j) {
					A[i][j] = 2;
				}else{
					A[i][j] = i+j;
				}	
			}
		}
		
		for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < B.length; j++) {
				if((i+j)%2==0) {
					B[i][j] = i-j;
				}else {
					B[i][j] = i+j;
				}
			}
		}
		
		System.out.println("Matriz A: ");
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				if(j==0) {
					System.out.print("| ");
				}
				System.out.print(A[i][j]+" ");
				if(j==A.length-1) {
					System.out.print(" | \n");
				}
			}
		}
		
		System.out.println("Matriz B: ");
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				if(j==0) {
					System.out.print("| ");
				}
				System.out.print(B[i][j]+" ");
				if(j==B.length-1) {
					System.out.print(" | \n");
				}
			}
		}
		
		
	}
}
