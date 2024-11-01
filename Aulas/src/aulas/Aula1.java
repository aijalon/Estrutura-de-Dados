package aulas;

import java.util.Scanner;

public class Aula1 {

	public static void main(String[] args) {

		double	nota1 = 7.2;
		double[] notas = {2, 5, 6, 7, 10};
		String[] alunos = new String[12];
		
		Scanner scanner = new Scanner(System.in);
		
		
		for (int i = 0; i < alunos.length; i++) {			
				System.out.println("Digite o nome do aluno "+(i+1)+ ": ");
				alunos[i] = scanner.nextLine();
		}
		
		for (int i = 0; i < alunos.length; i++) {
			if(alunos[i]!=null) {				
				System.out.println("Aluno: "+alunos[i]);
			}
		}
		
		//System.out.println(Arrays.toString(alunos));
		//System.out.println(Arrays.toString(notas));
		
	}

}
