package aula;

import java.util.Stack;

public class Pilha {

	Stack<Integer> pilhaDesordenada = new Stack<Integer>();
	Stack<Integer> pilhaintermediaria = new Stack<Integer>();
	Stack<Integer> pilhaOrdenada = new Stack<Integer>();
	int compara = 0;
	int tamanho = 0;
	int elementoDesempilhado = 0;


	public void ordenarPilha() {
		pilhaDesordenada.push(3);
		pilhaDesordenada.push(1);
		pilhaDesordenada.push(2);
		pilhaDesordenada.push(4);
		pilhaDesordenada.push(5);

		tamanho = pilhaDesordenada.size();

		while(pilhaOrdenada.size()!=tamanho) {

			compara = pilhaDesordenada.pop();

			while(!pilhaDesordenada.isEmpty()) {
				elementoDesempilhado = pilhaDesordenada.pop();

				if(compara <= elementoDesempilhado ) {
					pilhaintermediaria.push(compara);
					compara = elementoDesempilhado;
				}else {
					pilhaintermediaria.push(elementoDesempilhado);
				}
			}
			
			pilhaOrdenada.push(compara);
			
			while(!pilhaintermediaria.isEmpty()) {
				pilhaDesordenada.push(pilhaintermediaria.pop());
			}
			
		}
		
		System.out.println("Pilha ordenada: ");
		while(!pilhaOrdenada.isEmpty()) {
			System.out.println(pilhaOrdenada.pop());
		}
	}

}
