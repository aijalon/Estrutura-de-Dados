package aula1_1_atividade;

import java.util.Scanner;

public class atividade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] meses = { "Janeiro", "Fevereiro", "Março", 
				"Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
				"Outubro", "Novembro", "Dezembro" };

		System.out.println("Informe um número de 1 a 12: ");
		int numeroMes = scanner.nextInt();

		if (numeroMes >= 1 && numeroMes <= 12) {
			System.out.println(meses[numeroMes - 1]);
		} else {
			System.out.println("Inválido!");
		}

	}

}
