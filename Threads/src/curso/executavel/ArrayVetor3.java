package curso.executavel;

import javax.swing.JOptionPane;

public class ArrayVetor3 {
	
	public static void main(String[] args) {
		
		//Passando v�rios tipos de valores
		String[] valores = new String[4];
		String nome = JOptionPane.showInputDialog("Qual o nome?");
		String idade = JOptionPane.showInputDialog("Qual a idade?");
		String disciplina = JOptionPane.showInputDialog("Qual a disciplina?");
		String nota = JOptionPane.showInputDialog("Qual a nota?");
				
		valores[0] = nome;
		valores[1] = idade;
		valores[2] = disciplina;
		valores[3] = nota;
		
		String quantidade = JOptionPane.showInputDialog("Quantas notas?");
		double[] notas = new double[Integer.valueOf(quantidade)];
		
		for (int pos = 0; pos < notas.length; pos++) {
			String nota1 = JOptionPane.showInputDialog("Qual o valor da nota "+pos);
			notas[pos] = Double.parseDouble(nota1) ;
		}
		
			
		System.out.println("O nome �: "+valores[0]);
		System.out.println("A idade �: "+valores[1]);
		System.out.println("A disciplina �: "+valores[2]);
		System.out.println("A nota �: "+valores[3]);
		
		for (int pos = 0; pos < valores.length; pos++) {
			System.out.println("O valor na posi��o "+ (pos+1)+ " � igual a = "+valores[pos]);
		}
		for (int pos = 0; pos < notas.length; pos++) {
			System.out.println("O valor da nota "+ (pos+1)+ " � igual a = "+notas[pos]);
		}
		
	}

}
