package prova;

public class Q03 {
	
	int[][] A = new int[10][10];
	int[][] B = new int[10][10];

	public void a() {
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				if(i==j) {
					A[i][j]=2;
				}else {
					A[i][j] = (1+i)+(1+j);
				}
			}
		}
		
		for (int i = 0; i < A.length; i++) {
			System.out.print("| ");
			for (int j = 0; j < A.length; j++) {
				if(j+1>=10) {
					System.out.print(A[i][j]);
					System.out.print(" | \n");
				}else {
					System.out.print(A[i][j]+", ");	
				}
			}
		}
	}
	
	public void b() {
		for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < B.length; j++) {
				if((i+j)%2==0) {
					B[i][j]=(1+i)-(1+j);
				}else {
					B[i][j] = (1+i)+(1+j);
				}
			}
		}
		
		for (int i = 0; i < B.length; i++) {
			System.out.print("| ");
			for (int j = 0; j < B.length; j++) {
				if(j+1>=10) {
					System.out.print(B[i][j]);
					System.out.print(" | \n");
				}else {
					System.out.print(B[i][j]+", ");	
				}
			}
		}
	}
}
