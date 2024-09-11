package aula;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import fila.Fila;

public class Principal {
 public static void main(String[] args) {
	Queue<Integer> fila = new LinkedList<Integer>();
	
	Fila fila2 = new Fila();
	
	fila2.espera("Pedro");
	fila2.espera("Pedro");
	fila2.espera("Pedro");
	fila2.atender();
	
	fila2.imprimir();
	
	

}
}
