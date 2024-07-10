
public class Vetor {

	String[] vetor;
	int tamanho;
	
	public Vetor(int capacidade) {
	  this.vetor = new String[capacidade];
	  this.tamanho = 0;
	}
	
	/*
	 * public void adicionarElemento(String elemento) { for (int i = 0; i <
	 * vetor.length; i++) { if(vetor[i]==null) { vetor[i] = elemento; break;
	 * 
	 * } } }
	 */
	
	public void adicionarElemento(String elemento) throws Exception{
		if(tamanho<vetor.length) {
			vetor[tamanho] = elemento;
			this.tamanho++;			
		} else {
			throw new Exception("Vetor já está cheio.");
		}
	}
	
	public void adicionarElemento(String elemento, int posicao) {
		if (posicaoValida(posicao)) {
			for (int i = this.tamanho; i >posicao ; i--) {
				this.vetor[i] = this.vetor[i-1];
			}
			this.vetor[posicao] = elemento;
			this.tamanho++;
		}		
	}
	
	public int buscarElemento(String elemento) {
		for (int i = 0; i<this.tamanho; i++) {
			if(this.vetor[i].equalsIgnoreCase(elemento)) {
				return i;
			}
		}
		
		return -1;
	}
	
	public void removerElemento() {
		this.vetor[this.tamanho-1] = null;
		this.tamanho--;
	}
	
	public void removerElemento(int posicao) {
		if(posicaoValida(posicao)) {
			for (int i = posicao; i < this.tamanho; i++) {
				this.vetor[i] = this.vetor[i+1];
			}
			this.tamanho--;
		}
	}
	
	public String removerElemento(String elemento) {
		int posicao = buscarElemento(elemento);
		
		if(posicao==-1) {
			return "Elemento não encontrado!";
		}else {
			removerElemento(posicao);
			return elemento+" está na posicao "
					+posicao+" e já foi removido!";
		}
	}
	
	public void adicionarCapacidade(int valorAmpliacao) {
		if(valorAmpliacao>=0) {
			String[] vetorAmpliado = 
					new String[this.vetor.length+valorAmpliacao];
			for (int i = 0; i < this.vetor.length; i++) {
				vetorAmpliado[i] = this.vetor[i];
			}
			this.vetor= vetorAmpliado;
		}
	}
	
	public boolean posicaoValida(int posicao) {
		if(posicao<0 || posicao>this.tamanho) {
			  throw new IllegalArgumentException("Posição inválida");	
			}else {
				return true;
			}
	}
}
