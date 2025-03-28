package aulapilha;

import java.util.Scanner;
import java.util.Stack;

public class Exercio01 {

	public static void main(String[] args) {
		Stack<Integer> positivo = new Stack<>();
		Stack<Integer> negativo = new Stack<>();
		
		
		
		Scanner sc = new Scanner(System.in);
		
		int numero = 0;
		int count = 0;
		
		do {
			System.out.println("Digite 5 números. (Faltam "+(5-count) +"): ");
			numero = sc.nextInt();
			if(numero==0) {
				System.out.println("Zero é neutro. Informe outro número.");
			}else if(numero>0) {
				positivo.push(numero);
				count++;
			}else {
				negativo.push(numero);
				count++;
			}
			
		}while(count<5);
		
		for (int i = positivo.size()-1; i >=0 ; i--) {
			System.out.println(positivo.get(i));
		}
		
		System.out.println(negativo);

	}

}
