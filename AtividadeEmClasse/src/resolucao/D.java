package resolucao;

public class D {

	public static void main(String[] args) {
		int[] vetor1 = {2, 10, -15, 77, 45};
		int[] vetor2 = {9, 25, -95, 77, 37};
		
		int[] vetor3 = new int[5];
		
		for (int i = 0; i < vetor3.length; i++) {
			 System.out.println(vetor3[i] = vetor1[i] + vetor2[i]);
		}	
	}
}
