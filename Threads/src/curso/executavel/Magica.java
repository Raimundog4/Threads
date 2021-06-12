package curso.executavel;

import javax.swing.JOptionPane;

public class Magica {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Pense em um número!");
		int confirmacao = JOptionPane.showConfirmDialog(null, "Pensou?");

		if (confirmacao == 0) {
			JOptionPane.showMessageDialog(null,
					"Ótimo! Agora multiplique esse número por 3. PS: Assim que fizer isso clique em OK!");
			JOptionPane.showMessageDialog(null, "Agora some com 25!");
			JOptionPane.showMessageDialog(null, "Some com mais 55!");
			JOptionPane.showMessageDialog(null, "Some com mais 70!");
			JOptionPane.showMessageDialog(null, "Agora divida por 3!");
			JOptionPane.showMessageDialog(null, "Preste bem atenção! SUBTRAIA O RESULTADO \n PELO NÚMERO QUE VOCÊ PENSOU");
			JOptionPane.showMessageDialog(null, "Mentalize bem o resultado que eu irei descobri-lo através \n da telepatia robótica! HUUUUUUM! Aperte OK para saber \n minha resposta");
			confirmacao = JOptionPane.showConfirmDialog(null, "Deu 50?");

			if (confirmacao == 0) {
				JOptionPane.showMessageDialog(null, "HEHEHEHEHE!");
			} else {
				JOptionPane.showMessageDialog(null, "Faça as contas direito, jumento!");

			} 
		} else {
			JOptionPane.showMessageDialog(null, "SEM GRAÇAAAAAAAAAAAAAA!");
		}

	}

}
