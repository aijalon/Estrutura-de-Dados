package aulapilha;

import java.util.Stack;

public class PilhaDesordenada {
	public static void main(String[] args) {
		Stack<Integer> pilhaDesordenada = new Stack<Integer>();
		Stack<Integer> pilhaIntermediaria = new Stack<Integer>();
		Stack<Integer> pilhaOrdenada = new Stack<Integer>();

		int compara;
		int itemDesempilhado;

		pilhaDesordenada.push(5);
		pilhaDesordenada.push(3);
		pilhaDesordenada.push(1);
		pilhaDesordenada.push(1);
		pilhaDesordenada.push(2);
		pilhaDesordenada.push(4);

		while (!pilhaDesordenada.isEmpty()) {
			compara = pilhaDesordenada.pop();

			while (!pilhaDesordenada.isEmpty()) {
				itemDesempilhado = pilhaDesordenada.pop();
				if (compara <= itemDesempilhado) {
					pilhaIntermediaria.push(compara);
					compara = itemDesempilhado;
				} else {
					pilhaIntermediaria.push(itemDesempilhado);
				}
			}
			pilhaOrdenada.push(compara);
			while (!pilhaIntermediaria.isEmpty()) {
				pilhaDesordenada.push(pilhaIntermediaria.pop());
			}
		}

		while(!pilhaOrdenada.isEmpty()) {
			System.out.println(pilhaOrdenada.pop());
		}
	}
}
