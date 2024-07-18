package matriz;

public class Matriz {

	String[][] matriz;
	int linhas;
	int colunas;
	int tamanho;

	public Matriz(int linhas, int colunas) {
		this.matriz = new String[linhas][colunas];
		this.linhas = linhas;
		this.colunas = colunas;
		this.tamanho = 0;
	}

	public void adicionarElemento(String elemento) throws Exception {
		if(this.tamanho < this.linhas* this.colunas) {
			int linha = this.tamanho / this.colunas;
			int coluna = tamanho % this.colunas;
			this.matriz[linha][coluna] = elemento;
			this.tamanho++;
		}else {
			throw new Exception("Matriz já está cheia.");
		}
	}

	public int buscarElemento(String elemento) {
		for(int i = 0; i< this.tamanho; i++) {
			int linha = i / this.colunas;
			int coluna = i % this.colunas;
			if(this.matriz[linha][coluna].equalsIgnoreCase(elemento)) {
				return i;
			}
		}
		return -1;
	}

	public void removerElemento() {
		int linha = (this.tamanho - 1) / this.colunas;
		int coluna = (this.tamanho - 1) % this.colunas;
		this.matriz[linha][coluna] = null;
		this.tamanho--;
	}
	
	public void adicionaCapacidade(int ampliacaoLinha, int ampliacaoColuna) {
		String[][] matrizAmpliada = new String[this.matriz.length+ampliacaoLinha][this.matriz.length+ampliacaoColuna];
		for(int i = 0; i < this.matriz.length; i++) {
			for(int j = 0; j < this.matriz.length; j++) {
				matrizAmpliada[i][j] = this.matriz[i][j];
			}
		}
		this.matriz = matrizAmpliada;
	}



}
