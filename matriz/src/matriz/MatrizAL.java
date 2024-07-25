package matriz;

import java.util.ArrayList;
import java.util.Arrays;

public class MatrizAL {

	public static void main(String[] args) {

		//ArrayList<String> vetor = new ArrayList<String>();
		//String[][] matriz2 = new String[3][3];

		ArrayList<ArrayList<String>> matriz = new ArrayList<ArrayList<String>>();

		ArrayList<String> linha1 = new ArrayList<String>();
		ArrayList<String> linha2 = new ArrayList<String>();
		ArrayList<String> linha3 = new ArrayList<String>();

		linha1.add("A");
		linha1.add("B");
		linha1.add("C");
		linha1.add("D");
		linha1.add("E");

		linha2.add("F");
		linha2.add("G");
		linha2.add("H");
		linha2.add("I");
		linha2.add("J");

		linha3.add("K");
		linha3.add("L");
		linha3.add("M");
		linha3.add("N");
		linha3.add("O");

		matriz.add(linha1);
		matriz.add(linha2);
		matriz.add(linha3);

		//System.out.println(matriz.get(0).size());


		for(int i = 0; i< matriz.size(); i++ ) {
			System.out.print("| ");
			for(int j = 0; j<matriz.get(i).size(); j++){
				if(j+1==matriz.get(i).size()) {
					System.out.print(matriz.get(i).get(j)+"| \n"); 					
				}else {
					System.out.print(matriz.get(i).get(j)+" "); 					
				}
			} 
		}


	}

}
