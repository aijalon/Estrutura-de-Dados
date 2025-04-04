package aulafila;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<Integer> fila = new LinkedList<Integer>();
		Atendimento atendimento = new Atendimento();
		
		atendimento.chegada("Roberta Lemos");
		atendimento.chegada("Roberta Escrevemos");
		atendimento.chegada("Esterândia Lemos");
		
		atendimento.atendimento();
		
	}

}
