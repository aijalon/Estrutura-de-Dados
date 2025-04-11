package pilha;

import java.util.Scanner;
import java.util.Stack;

public class Q01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int saida = 1;
		int numero;
		Stack<Integer> positivo = new Stack<>();
		Stack<Integer> negativo = new Stack<>();
		
		
		do {
			System.out.println("Informe um número (Zero para encerrar): ");
			numero = sc.nextInt();
			if(numero==0) {
				System.out.println("O zero é um número neutro, "
						+ "por isso o programa será encerrado.");
				saida=0;
			}else if(numero>0) {
				positivo.push(numero);
			}else {
				negativo.push(numero);
			}
			
		}while(saida!=0);

		System.out.println("A pilha positiva: "+positivo);
		System.out.println("A pilha negativa: "+negativo);
	}

}
