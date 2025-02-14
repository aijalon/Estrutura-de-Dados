package aula5_arraylist;

import java.util.ArrayList;

public class Start {

	public static void main(String[] args) {
		ArrayList<String> vetor = new ArrayList<>();
		vetor.add("A");
		vetor.add("B");
		vetor.add("C");
		vetor.add("D");
		vetor.add("E");
		
		for(int i = 0; i<vetor.size(); i++) {
			System.out.println(vetor.get(i));
		}
		
	}

}
