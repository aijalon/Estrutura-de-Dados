package aulafila;

import java.util.LinkedList;
import java.util.Queue;

public class Atendimento {

	Queue<String> fila = new LinkedList<String>();
	
	public void chegada(String nome) {
		fila.add(nome);
		imprimir();
	}
	
	public void atendimento() {
		fila.remove();
		imprimir();
	}
	
	public void imprimir() {
		System.out.println("Fila atualizada: ");
		System.out.println(fila.toString());
	}
}
