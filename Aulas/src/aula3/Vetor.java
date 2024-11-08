package aula3;

public class Vetor {

	String[] vetor;
	int tamanho;
	
	public Vetor(int capacidade) {
		this.vetor = new String[capacidade];
		this.tamanho = 0;
		
	}
	
	/*
	 * public void adicionarElemento(String elemento) { for(int i = 0;
	 * i<this.vetor.length; i++) { if(this.vetor[i]==null) { this.vetor[i]=elemento;
	 * break; } } }
	 */
	
	public void adicionarElemento(String elemento) throws Exception{
		if(this.tamanho<this.vetor.length) {
			this.vetor[tamanho] = elemento;
			this.tamanho++;			
		}else {
			throw new Exception("O vetor está cheio!");
		}

	}

	
}
