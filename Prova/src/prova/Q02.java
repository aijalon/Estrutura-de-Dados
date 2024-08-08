package prova;

public class Q02 {

	int[] resultado = {19, 35, 36, 37, 41, 60};
	int[] jogo = {19, 35, 36, 37, 41, 60};
	
	public void megaSena() {
		int count = 0;
		for (int i = 0; i < resultado.length; i++) {
			for (int j = 0; j < jogo.length; j++) {
				if(resultado[i]==jogo[j]) {
					count++;
				}
			}
		}
		
		if(count>=6) {
			System.out.println("Parabéns! Você ganhou!");
		}else {
			System.out.println("Infelizmente não foi desta vez!");
		}
	}
}
