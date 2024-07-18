import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Principal {

	public static void main(String[] args) {
		/*
		 * try { Vetor vetor = new Vetor(5); vetor.adicionarElemento("A");
		 * vetor.adicionarElemento("B"); vetor.adicionarElemento("C");
		 * vetor.adicionarElemento("D", 0); vetor.adicionarElemento("E");
		 * vetor.removerElemento(); vetor.removerElemento(2);
		 * 
		 * System.out.println(vetor.removerElemento("D"));
		 * 
		 * System.out.println(vetor.buscarElemento("a"));
		 * 
		 * //vetor.adicionarElemento("F");
		 * System.out.println(Arrays.deepToString(vetor.vetor)); } catch (Exception e) {
		 * e.printStackTrace(); }
		 */	
		
		LinkedList<String> list = new LinkedList();
		ArrayList<Integer> l = new ArrayList<Integer>();
		
		l.add(1);
		l.add(2);
		
		list.add("a");
		list.add(1, "b");
		list.add("c");
		list.addFirst("d");
		
		System.out.println(l);
	}

}
