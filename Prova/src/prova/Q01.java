package prova;

import java.util.ArrayList;
import java.util.Arrays;

public class Q01 {
	int[] R = {21, 12, 1, 3, 7};
	int[] S = {13, 31, 3, 21, 14, 6, 1, 42, 23, 32};
	ArrayList<Integer> resultado = new ArrayList<Integer>();
	
	public void a() {
		for(int i = 0; i< S.length; i++) {
			for(int j = 0; j<R.length; j++) {
				if(S[i]==R[j])
				resultado.add(S[i]);
			}
		}
		
		System.out.println(Arrays.deepToString(resultado.toArray()));
	}
	public void b() {
		int somaR = 0;
		int somaS = 0;
		
		for (int i = 0; i < R.length; i++) {
			somaR = somaR+R[i];
		}

		for (int i = 0; i < S.length; i++) {
			somaS = somaS+S[i];
		}
		
		System.out.println(somaR*somaS);
		
	}
	
	public void c() {
		System.out.println("Os valores pares de R são: ");
	for (int i = 0; i < R.length; i++) {
		if(R[i]%2==0)
			System.out.println(R[i]);
	}	
	System.out.println("Os valores pares de S são: ");
	for (int j = 0; j < S.length; j++) {
		if(S[j]%2==0)
			System.out.println(S[j]);
	}
	}
	
}
