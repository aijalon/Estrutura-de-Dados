package restaurante;

public class Cardapio {

	ItemCardapio[] itens = new ItemCardapio[0];

	void adicionarItem(ItemCardapio item) {

		ItemCardapio[] itens = new ItemCardapio[this.itens.length+1];
		for (int i = 0; i < this.itens.length; i++) {	
			itens[i] = this.itens[i];		
		}

		itens[this.itens.length] = item;
		this.itens = itens;

	}

	void removerItem(int indice) {
		// TODO implementar exclusão de item do cardápio da posição informada
	}

	void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
		// TODO implementar código para imprimir na console os itens
		//  do cardápio que estiverem entre o preço mínimo e máximo
		for (int i =0; i<this.itens.length; i++) {
			if(this.itens[i].possuiValorEntre(precoMinimo, 
					precoMaximo)) {
				this.itens[i].imprimir();
			}
		}
		
		
		
	}
}
