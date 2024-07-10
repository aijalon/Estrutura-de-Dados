import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		try {
			Vetor vetor = new Vetor(5);
			vetor.adicionarElemento("A");
			vetor.adicionarElemento("B");
			vetor.adicionarElemento("C");
			vetor.adicionarElemento("D", 0);
			vetor.adicionarElemento("E");
			vetor.removerElemento();
			vetor.removerElemento(2);
			
			System.out.println(vetor.removerElemento("D"));

			System.out.println(vetor.buscarElemento("a"));
			
			//vetor.adicionarElemento("F");
			System.out.println(Arrays.deepToString(vetor.vetor));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
