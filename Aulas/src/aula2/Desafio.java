package aula2;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String[] meses = { "Janeiro", "Fevereiro", "Março", 
				"Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
				"Outubro", "Novembro", "Dezembro" };
		
		System.out.println("Informe um número de 1 a 12");
		int mes = scanner.nextInt();
		
		if(mes<1 || mes>12) {
			System.out.println("Valor informado está incorreto");
		}else {
			String mesPorExtenso =meses[mes-1];
			
			System.out.println(mesPorExtenso);			
		}
		
		

		/*
		 * System.out.println("Informe um número de 1 a 12:"); int numeroMes =
		 * scanner.nextInt();
		 * 
		 * String mes = switch (numeroMes) { case 1 -> "Janeiro"; case 2 -> "Fevereiro";
		 * case 3 -> "Março"; case 4 -> "Abril"; case 5 -> "Maio"; case 6 -> "Junho";
		 * case 7 -> "Julho"; case 8 -> "Agosto"; case 9 -> "Setembro"; case 10 ->
		 * "Outubro"; case 11 -> "Novembro"; case 12 -> "Dezembro"; default -> null; };
		 * 
		 * System.out.println(mes);
		 */

	}

}
