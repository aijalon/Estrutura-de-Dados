package algoritimos;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Inicio {
	public static void main(String[] args) {
		Bubble bubble = new Bubble();
		Insertion insertion = new Insertion();
		int[] vetor = {10, 2, 1, 0, 5};
		LinkedList<Integer> lista = new LinkedList<Integer>();
		Queue<Integer> fila = new LinkedList<Integer>();
		fila.add(10);
		fila.add(2);
		fila.add(1);
		fila.add(0);
		fila.add(5);
		
		
		
	//	for (int i = 0; i < vetor.length; i++) {
	//		vetor[i] = (int) (Math.random()*vetor.length);
	//	}
	//	for (int i = 0; i < 10; i++) {
			//lista.add(i, (int) (Math.random()*10));
		//}
		
		//System.out.println((int) (Math.random()*1000));
		
		System.out.println("Vetor desordenado.");
		for (int i = 0; i < fila.size(); i++) {
			System.out.println(fila.remove());
		}

		
		System.out.println("Vetor ordenado.");
	/*	long inicio = System.currentTimeMillis();)
		System.out.println(bubble.bubbleSort(lista).toString());
		long fim = System.currentTimeMillis();
		System.out.println("Tempo: "+(fim-inicio));*/
	}
	
	
}
