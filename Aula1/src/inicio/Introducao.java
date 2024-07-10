package inicio;

public class Introducao {	
	public static void main(String[] args) {

		Turma turma = new Turma();
		turma.codigo = 1;
		turma.professor = "Tia Maria";
		turma.turno = "Matutino";
		turma.alunos = new Aluno[3];
		
		turma.alunos[0] = new Aluno();
		turma.alunos[0].nome = "Laura";
		turma.alunos[0].idade = "2";	
		
		Aluno aluno = new Aluno();
		aluno.nome = "João";
		aluno.idade = "3";
		turma.alunos[1] = aluno;
		
		for (int i = 0; i<turma.alunos.length; i++) {
			if(turma.alunos[i]!=null) {
			System.out.println(
					i+1+ " - "+turma.alunos[i].nome+" ("+turma.alunos[i].idade+ " anos)");
			}
		}
					
	}
}
