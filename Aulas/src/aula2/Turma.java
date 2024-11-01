package aula2;

public class Turma {
	String identificacao;
	String professor;
	Aluno[] alunos;
	
	public void listar() {
		for (int i = 0; i < alunos.length; i++) {
			System.out.println("Aluno "+(i+1)+": "+alunos[i].nome);
			System.out.println("Idade: "+alunos[i].idade);
		}
	}

}
