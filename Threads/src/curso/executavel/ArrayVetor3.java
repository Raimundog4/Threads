package curso.executavel;

import javax.swing.JOptionPane;

public class ArrayVetor3 {
	
	public static void main(String[] args) {
		
		//Passando vários tipos de valores
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
		
			
		System.out.println("O nome é: "+valores[0]);
		System.out.println("A idade é: "+valores[1]);
		System.out.println("A disciplina é: "+valores[2]);
		System.out.println("A nota é: "+valores[3]);
		
		for (int pos = 0; pos < valores.length; pos++) {
			System.out.println("O valor na posição "+ (pos+1)+ " é igual a = "+valores[pos]);
		}
		for (int pos = 0; pos < notas.length; pos++) {
			System.out.println("O valor da nota "+ (pos+1)+ " é igual a = "+notas[pos]);
		}
		
	}

}
