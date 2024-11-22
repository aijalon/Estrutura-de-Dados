package resolucao;

public class A {

	public static void main(String[] args) {
		
		String[] vetor = {"A", "B", "C", "D", null};
		
		for (int i = 0; i < vetor.length; i++) {
			if(i%2==0 && vetor[i]!=null) {
				System.out.println(vetor[i]);
			}
		}

		//System.out.println(Arrays.toString(vetor));
	}

}
