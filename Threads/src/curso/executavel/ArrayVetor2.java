package curso.executavel;

import javax.swing.JOptionPane;

public class ArrayVetor2 {

	public static void main(String[] args) {

		String quantidade = JOptionPane.showInputDialog("Quantas notas");
		
		double[] notas = new double[Integer.valueOf(quantidade)];
		
		for (int i = 0; i < notas.length; i++) {
			String valor = JOptionPane.showInputDialog("Qual o valor da nota "+ (i + 1) +"?");
			notas[i] = Double.valueOf(valor);
		}

		for (int i = 0; i <notas.length; i++) {
			System.out.println("Nota "+ (i + 1)+ ": "+notas[i]);
		}
		

	}

}
