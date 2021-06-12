package curso.executavel;

public class ArrayVetor {

	public static void main(String[] args) {

		
		//double[] valores = {9.5, 10, 5.1, 5.8};//Assim o array é criado de acordo com o número de valores
		/* Array pode ser de todos os tipos de dados e objetos também */

		/* Sempre deve ter a quantidade de posições definidas */
		/* Tem que sempre instanciar o Array */
		double[] notas = new double[4];// pode ser assim ou double notas[];

		/* Atribui valores às posições do Array */
		notas[0] = 9.0;
		notas[1] = 9.7;
		notas[2] = 9.8;
		notas[3] = 9.9;

		for (int i = 0; i <= 3; i++) {
			System.out.println("Nota "+ (i + 1)+ ": "+notas[i]);
		}
		

	}

}
