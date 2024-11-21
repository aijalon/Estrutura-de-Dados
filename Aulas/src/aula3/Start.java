package aula3;

import java.util.Arrays;

public class Start {

	public static void main(String[] args) {
		Vetor teste = new Vetor(10);
		
		try {
			teste.adicionarElemento("A");
			teste.adicionarElemento("B");
			teste.adicionarElemento("C",0);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(Arrays.toString(teste.vetor));
	}
}
