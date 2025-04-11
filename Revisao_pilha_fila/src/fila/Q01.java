package fila;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		Queue<Integer> positivo = new LinkedList<Integer>();
		Queue<Integer> negativo = new LinkedList<Integer>();
		int numero;
		int saida = 1;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Informe um número (Zero para encerrar): ");
			numero = sc.nextInt();
			if(numero==0) {
				System.out.println("O zero é um número neutro, "
						+ "por isso o programa será encerrado.");
				saida=0;
			}else if(numero>0) {
				positivo.add(numero);
			}else {
				negativo.add(numero);
			}
			
		}while(saida!=0);

		System.out.println("A fila positiva: "+positivo);
		System.out.println("A fila negativa: "+negativo);

	}

}
