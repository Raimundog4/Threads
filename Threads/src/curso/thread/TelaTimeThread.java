package curso.thread;

import java.awt.Dimension;

import javax.swing.JDialog;

public class TelaTimeThread extends JDialog {// Framework do próprio java para criar aplicação para desktop

	public TelaTimeThread() {// Executa o que tiver dentro no momento da abertura ou execução
		super.setTitle("Minha tela de time com Thread");// Está vindo da superclasse JDialog
		super.setSize(new Dimension(240, 240));
		setLocationRelativeTo(null);// Pede para centralizar a tela de acordo com algum componente, mas não temos nenhum componente base
		setResizable(false);// Ativa ou desativa a opção de aumentar ou diminuir tela
		/* Primeira parte concluída */

		
		
		/* Sempre será o último comando */
		setVisible(true);// Torna a tela visível para o usuário
	}

}
