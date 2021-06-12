package curso.executavel;

import java.util.Arrays;
import java.util.List;

public class SplitArray2 {
	public static void main(String[] args) {

		String texto = "Rai, curso java, 8, 7, 9, 7";

		// Quebra pelo símbolo padrão
		String[] valoresArray = texto.split(",");

		System.out.println("Nome: " + valoresArray[0]);
		System.out.println("Curso: " + valoresArray[1]);
		System.out.println("Nota 1: " + valoresArray[2]);
		System.out.println("Nota 2: " + valoresArray[3]);
		System.out.println("Nota 3: " + valoresArray[4]);
		System.out.println("Nota 4: " + valoresArray[5]);

		
		//Convertendo um Array em uma Lista
		List<String> list = Arrays.asList(valoresArray);
		int i = 1;
		for (String string : list) {
			System.out.println("Posição "+i+" "+string);
			i++;
		}
		
		//Convertendo uma Lista em um Array
		String[] conversaoArray = list.toArray(new String[6]);
		
		System.out.println(conversaoArray);
		
		for (int pos = 0; pos < conversaoArray.length; pos ++) {
			System.out.println("Posição "+(pos+1)+" "+conversaoArray[pos]);
		}
	}

}
