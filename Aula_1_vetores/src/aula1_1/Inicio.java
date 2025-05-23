package aula1_1;

import java.util.Arrays;

public class Inicio {

	public static void main(String[] args) {
		Aluno[] alunos = new Aluno[3];
		
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();
		
		aluno1.nome = "Sohia";
		aluno1.idade = 4;
		
		aluno2.nome = "Enzo";
		aluno2.idade = 3;
		
		aluno3.nome = "Valentina";
		aluno3.idade = 2;
		
		alunos[0] = aluno1;
		alunos[1] = aluno2;
		alunos[2] = aluno3;
		
		System.out.println("Alunos matrículados: ");
		for(int i = 0; i<alunos.length; i++) {
				System.out.print("Nome: " +alunos[i].nome+";");
				System.out.println(" Idade: "+alunos[i].idade);			
		}

	}

}
