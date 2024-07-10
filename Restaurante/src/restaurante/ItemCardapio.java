package restaurante;

public class ItemCardapio {

    String descricao;
    double preco;
    
    boolean possuiValorEntre(double precoMin, double precoMax){
    	return preco>=precoMin && preco<=precoMax;
    }
    
    void imprimir() {
    	System.out.println(descricao + " - " + " R$ " + preco);
    }
	
}
