package aulapilha;

import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		Stack<Integer> pilha = new Stack<>();
		
		pilha.push(1);
		pilha.push(2);
		pilha.push(3);
		
		pilha.peek();
		
		pilha.isEmpty();
		
		System.out.println(pilha.search(1));

		
		System.out.println(pilha.get(2));
		
		
	}
}
