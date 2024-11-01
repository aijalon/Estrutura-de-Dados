package aula2;

import java.util.Arrays;

public class Start {

	public static void main(String[] args) {
	
		Turma turmaA = new Turma();
		Turma turmaB = new Turma();
		
		Aluno andreisa = new Aluno();
		Aluno miranda = new Aluno();
		
		andreisa.nome = "Andreisa";
		andreisa.idade = 3;
		
		miranda.nome = "Miranda";
		miranda.idade = 3;
		
		turmaA.identificacao = "A";
		turmaA.professor = "Tia Sônia";
		turmaA.alunos = new Aluno[3];
		turmaA.alunos[0] = new Aluno();
		
		turmaA.alunos[0].nome = "Laura";
		turmaA.alunos[0].idade = 3;
		
		turmaA.alunos[1] = andreisa;
		turmaA.alunos[2] = miranda;
		
		turmaA.listar();
		
		//System.out.println(Arrays.deepToString(turmaA.alunos));
		
		//System.out.println(andreisa.prestaAtencao());
		
		
	}

}
