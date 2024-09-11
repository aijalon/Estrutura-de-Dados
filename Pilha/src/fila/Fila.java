package fila;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	Queue<String> fila =  new LinkedList<>();
	
	public void espera(String cliente) {
		fila.add(cliente);
	}
	
	public void atender() {
		fila.remove();
	}
	
	public void imprimir() {
		System.out.println(fila.toString());
	}
}
