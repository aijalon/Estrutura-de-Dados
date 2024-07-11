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
		if(indice<0 || indice>this.itens.length-1) {
			System.out.println("Valor incorreto, tente novamente.");
			return;
		}else if(this.itens.length==0) {
			System.out.println("Não existe itens adicionado.");
			return;
		}else {
			ItemCardapio[] itens = new ItemCardapio[this.itens.length-1];
			
			for(int i = indice; i < this.itens.length; i++) {
			if(i+1==this.itens.length) {
				break;
			}else {
				this.itens[i] = this.itens[i+1];
			}			
			}
			
			for(int i = 0; i <itens.length; i++) {
				itens[i] = this.itens[i];
			}
			
			this.itens = itens;
		}
	}

	void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
		for (int i =0; i<this.itens.length; i++) {
			if(this.itens[i].possuiValorEntre(precoMinimo, 
					precoMaximo)) {
				this.itens[i].imprimir();
			}
		}
	}
}
