package resolucao_12_12_2024;

import java.util.ArrayList;

public class Start {
	public static void main(String[] args) {

		ArrayList<String> vetor = new ArrayList<String>();
		vetor.add("A");
		vetor.add("B");
		vetor.add("C");
		vetor.add("D");
		vetor.add("E");

		ArrayList<Integer> vetorInt = new ArrayList<Integer>();

		vetorInt.add(1);
		vetorInt.add(2);
		vetorInt.add(3);
		vetorInt.add(4);
		vetorInt.add(5);

		// a) Imprimindo os índices pares e somente os preenchidos

/*		for (int i = 0; i < vetor.size(); i++) {
			if (i % 2 == 0 && vetor.get(i) != null) {
				System.out.println(vetor.get(i));
			}
		}*/

		// b) Imprimindo os elementos pares

/*		for (int i = 0; i < vetorInt.size(); i++) {
			if (vetorInt.get(i) % 2 == 0) {
				System.out.println(vetorInt.get(i));
			}
		}*/

		int menor = vetorInt.get(0);
		// c) Encontrando o menor de uma sequência de números
/*		for (int i = 0; i < vetorInt.size(); i++) {
			if(menor>vetorInt.get(i)) {
				menor = vetorInt.get(i);
			}
		}
		
		System.out.println("Que a o menor valor é: "+menor);
		
*/
		//d) Sejam v e w dois vetores. Para somá-los, é preciso que eles tenham o mesmo
		//tamanho. Isto posto, o algoritmo cria um novo vetor v + w no qual cada elemento
		//(v + w)[i] do novo vetor é a soma dos respectivos elementos v[i] e w[i].
		
		ArrayList<Integer> v = new ArrayList<Integer>();
		ArrayList<Integer> w = new ArrayList<Integer>();
		ArrayList<Integer> vw = new ArrayList<Integer>();
		
		v.add(10);
		v.add(2);
		v.add(5);
		v.add(2);
		v.add(7);
		
		w.add(7);
		w.add(4);
		w.add(9);
		w.add(17);
		w.add(14);
		
		for (int i = 0; i < v.size(); i++) {
			vw.add(v.get(i)+w.get(i));
		}
		
		System.out.println(vw);
		
	}
}
