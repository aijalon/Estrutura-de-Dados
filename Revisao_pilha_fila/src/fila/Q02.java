package fila;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int saida = 1;
		int numero;
		Queue<Integer> par = new LinkedList<Integer>();
		Queue<Integer> impar = new LinkedList<Integer>();
		
		
		do {
			System.out.println("Informe um número (Zero para encerrar): ");
			numero = sc.nextInt();
			if(numero==0) {
				System.out.println("O zero é um número neutro, "
						+ "por isso o programa será encerrado.");
				saida=0;
			}else if(numero%2==0) {
				par.add(numero);
			}else {
				impar.add(numero);
			}
			
		}while(saida!=0);

		System.out.println("A fila par: "+par);
		System.out.println("A fila ímpar: "+impar);
	}

}
