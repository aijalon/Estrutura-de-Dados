package aula3;

import java.util.Arrays;

public class Start {

	public static void main(String[] args) {
		Vetor teste = new Vetor(2);
		
		try {
			teste.adicionarElemento("A");
			teste.adicionarElemento("B");
			teste.adicionarElemento("C");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(Arrays.toString(teste.vetor));
	}
}
