package curso.executavel;

//Uma matriz � um array de um array
public class Matriz {

	public static void main(String[] args) {
		// Para ser uma matriz tem que ter duas chaves
		int notas[][] = new int[2][3];// Uma posi��o com 3 valores dentro dele

		notas[0][0] = 80;
		notas[0][1] = 90;
		notas[0][2] = 70;

		notas[1][0] = 50;
		notas[1][1] = 60;
		notas[1][2] = 40;

		/* Percorre as linhas */
		for (int poslinha = 0; poslinha < notas.length; poslinha++) {
			System.out.println("=========================Matriz " + (poslinha + 1) + "==========================");
			/* Percorre as colunas */
			for (int poscoluna = 0; poscoluna < notas[poslinha].length; poscoluna++) {
				// Como se fosse um ponto de interse��o
				System.out.println("Valor da Matriz: " + notas[poslinha][poscoluna]);
			}
		}

	}

}
