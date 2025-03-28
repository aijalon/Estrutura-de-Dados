package aulapilha;

import java.util.Stack;

public class Exercicio03 {
	public static void main(String[] args) {
		Stack<Integer> pilha = new Stack<>();
		Stack<Integer> pilha2 = new Stack<>();
		
		
		for (int i = 1; i <= 5; i++) {
			if(i==2) {
				continue;
			}
			pilha.push(i);
		}
		
		for (int i = 1; i < 4; i++) {
			pilha2.push(pilha.pop());
		}
		
		pilha.push(2);
		
		while(pilha2.isEmpty()!=true) {
			pilha.push(pilha2.pop());
		}
		
		System.out.println(pilha);
		
	}

}
