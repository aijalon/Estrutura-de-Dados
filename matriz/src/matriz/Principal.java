package matriz;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {

		Matriz matriz = new Matriz(3, 3);
		
		try {
			matriz.adicionarElemento("a");
			matriz.adicionarElemento("b");
			matriz.adicionarElemento("c");
			matriz.adicionarElemento("d");
			
			matriz.removerElemento();
			matriz.removerElemento();
			matriz.removerElemento();
			
			matriz.adicionaCapacidade(1, 2);
			
			System.out.println(matriz.buscarElemento("b"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println(Arrays.deepToString(matriz.matriz));
	}
}
