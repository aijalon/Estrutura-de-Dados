package bubble;

import java.util.Arrays;
import java.util.LinkedList;

public class Inicio {
	public static void main(String[] args) {
		Bubble bubble = new Bubble();
		int[] vetor = new int[100000];
		LinkedList<Integer> lista = new LinkedList<Integer>();
		
	//	for (int i = 0; i < vetor.length; i++) {
	//		vetor[i] = (int) (Math.random()*vetor.length);
	//	}
		for (int i = 0; i < 10; i++) {
			lista.add(i, (int) (Math.random()*10));
		}
		
		//System.out.println((int) (Math.random()*1000));
		
		System.out.println("Vetor desordenado.");
		//System.out.println(Arrays.toString(vetor));	
		
		
		System.out.println("Vetor ordenado.");
		long inicio = System.currentTimeMillis();
		System.out.println(bubble.bubbleSort(lista).toString());
		long fim = System.currentTimeMillis();
		System.out.println("Tempo: "+(fim-inicio));
	}
	
	
}
