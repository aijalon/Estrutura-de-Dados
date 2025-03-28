package aulapilha;

import java.util.Stack;

public class Exercicio02 {

	public static void main(String[] args) {
		Stack<Integer> pilha = new Stack<>();
		int i = 0;
		
		while(i<5) {
			pilha.push(i);
			i++;
		}
		
		System.out.println(pilha);
		i=pilha.size()-1;
		int elemento = 0;
		while(i>=0) {
			elemento = pilha.pop();
			if(elemento%2==0) {
				System.out.println(elemento);
			}
			i--;
		}
	}
}
