package curso.executavel;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magica2 {

	public static void main(String[] args) {
		
		Random random = new Random();
		double i = random.nextInt(100);
		double j = random.nextInt(100);
		double k = random.nextInt(100);
		double l = random.nextInt(100);
		
		
		JOptionPane.showMessageDialog(null, "Pense em um n�mero!");
		int confirmacao = JOptionPane.showConfirmDialog(null, "Pensou?");

		if (confirmacao == 0) {
			JOptionPane.showMessageDialog(null,	"�timo! Agora multiplique esse n�mero por 3. PS: Assim que fizer isso clique em OK!");
			JOptionPane.showMessageDialog(null, "Agora some com "+ i+"!");
			JOptionPane.showMessageDialog(null, "Some com mais "+ j+"!");
			JOptionPane.showMessageDialog(null, "Some com mais "+ k+"!");
			JOptionPane.showMessageDialog(null, "Some com mais "+ l+"!");
			JOptionPane.showMessageDialog(null, "Agora divida por 3!");
			JOptionPane.showMessageDialog(null, "Preste bem aten��o! SUBTRAIA O RESULTADO \n PELO N�MERO QUE VOC� PENSOU");
			JOptionPane.showMessageDialog(null, "Mentalize bem o resultado que eu irei descobri-lo atrav�s \n da telepatia rob�tica! HUUUUUUM! Aperte OK para saber \n minha resposta");
			double c = (i+j+k+l) / 3;
//			double b;
//			b = (double) c; 
			confirmacao = JOptionPane.showConfirmDialog(null, "O resultado deu "+c+" ?");

			if (confirmacao == 0) {
				JOptionPane.showMessageDialog(null, "HEHEHEHEHE!");
			} else {
				JOptionPane.showMessageDialog(null, "Fa�a as contas direito, jumento!");

			} 
		} else {
			JOptionPane.showMessageDialog(null, "SEM GRA�AAAAAAAAAAAAAA!");
		}
		
	}
	
}
