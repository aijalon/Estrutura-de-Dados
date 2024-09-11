package aula;

import java.util.Stack;

public class Pilha {

    Stack<Integer> pilhaDesordenada = new Stack<>();
    Stack<Integer> pilhaintermediaria = new Stack<>();
    Stack<Integer> pilhaOrdenada = new Stack<>();
    int compara = Integer.MIN_VALUE;  // Inicializa com o menor valor possível para um int
    int tamanho = 0;
    int elementoDesempilhado = 0;

    public void ordenarPilha() {
        // Empilhando elementos na pilha desordenada
        pilhaDesordenada.push(3);
        pilhaDesordenada.push(1);
        pilhaDesordenada.push(2);
        pilhaDesordenada.push(4);
        pilhaDesordenada.push(5);

        tamanho = pilhaDesordenada.size(); // Armazenando o tamanho original da pilha

        while (pilhaOrdenada.size() != tamanho) { // Enquanto a pilha ordenada não estiver completa
            compara = Integer.MIN_VALUE;  // Reinicia 'compara' para cada nova iteração

            // Desempilha todos os elementos da pilha desordenada
            while (!pilhaDesordenada.isEmpty()) {
                elementoDesempilhado = pilhaDesordenada.pop();

                if (compara < elementoDesempilhado) { // Se encontrar um novo maior valor
                    if (compara != Integer.MIN_VALUE) {
                        pilhaintermediaria.push(compara); // Armazena o antigo valor de compara na intermediária
                    }
                    compara = elementoDesempilhado; // Atualiza o valor de compara com o novo maior valor
                } else {
                    pilhaintermediaria.push(elementoDesempilhado); // Armazena o elemento na intermediária
                }
            }

            // Move os elementos de volta da pilha intermediária para a pilha desordenada
            while (!pilhaintermediaria.isEmpty()) {
                elementoDesempilhado = pilhaintermediaria.pop();
                if (compara == elementoDesempilhado) {
                    pilhaOrdenada.push(elementoDesempilhado); // Coloca o maior elemento na pilha ordenada
                } else {
                    pilhaDesordenada.push(elementoDesempilhado); // Retorna os outros elementos para a pilha desordenada
                }
            }
        }

        // Exibe os elementos ordenados
        System.out.println("Pilha ordenada: ");
        while (!pilhaOrdenada.isEmpty()) {
            System.out.println(pilhaOrdenada.pop());
        }
    }
}
