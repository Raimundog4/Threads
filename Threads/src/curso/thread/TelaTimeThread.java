package curso.thread;

import java.awt.Dimension;

import javax.swing.JDialog;

public class TelaTimeThread extends JDialog {// Framework do pr�prio java para criar aplica��o para desktop

	public TelaTimeThread() {// Executa o que tiver dentro no momento da abertura ou execu��o
		super.setTitle("Minha tela de time com Thread");// Est� vindo da superclasse JDialog
		super.setSize(new Dimension(240, 240));
		setLocationRelativeTo(null);// Pede para centralizar a tela de acordo com algum componente, mas n�o temos nenhum componente base
		setResizable(false);// Ativa ou desativa a op��o de aumentar ou diminuir tela
		/* Primeira parte conclu�da */

		
		
		/* Sempre ser� o �ltimo comando */
		setVisible(true);// Torna a tela vis�vel para o usu�rio
	}

}
