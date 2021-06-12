package curso.executavel;

public class ArrayVetor4 {
	public static void main(String[] args) {

		String[] valores = { "Rai", "28", "Curso de Java", "Cursando" };

		for (int pos = 0; pos < valores.length; pos++) {
			System.out.println("O valor da posição " + (pos + 1) + " é igual a = " + valores[pos]);
		}

	}
}
