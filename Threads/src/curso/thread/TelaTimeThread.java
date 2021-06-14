package curso.thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog {// Framework do próprio java para criar aplicação para desktop

	/* Painel de componentes */
	private JPanel jPanel = new JPanel(new GridBagLayout()); //Inicia dizendo que vamos fazer o controle dos componentes dentro dele, por isso o new GridBagLayout
	
	private JLabel descricaoHora = new JLabel("Time Thread 1"); 
	private JTextField mostraTempo = new JTextField();
	
	private JLabel descricaoHora2 = new JLabel("Time Thread 2"); 
	private JTextField mostraTempo2 = new JTextField();
	
	public TelaTimeThread() {// Executa o que tiver dentro no momento da abertura ou execução
		super.setTitle("Minha tela de time com Thread");// Está vindo da superclasse JDialog
		super.setSize(new Dimension(240, 240));
		setLocationRelativeTo(null);// Pede para centralizar a tela de acordo com algum componente, mas não temos nenhum componente base
		setResizable(false);// Ativa ou desativa a opção de aumentar ou diminuir tela
		/* Primeira parte concluída */

		
		GridBagConstraints gridBagConstraints = new GridBagConstraints();//Controlador de posicionamento de botões na tela
		gridBagConstraints.gridx = 0; // Linhas - sentido horizontal - linha 0
		gridBagConstraints.gridy = 0; // Colunas - sentido vertical - coluna 0
		
		descricaoHora.setPreferredSize(new Dimension(200, 25));//Tamanho do botão
		//(qual componente inserir, gerenciador)
		jPanel.add(descricaoHora, gridBagConstraints); // Colocar o componente dentro do painel
		
		mostraTempo.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy ++;
		jPanel.add(mostraTempo, gridBagConstraints);
		
		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy ++;	
		jPanel.add(descricaoHora2, gridBagConstraints);
		
		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy ++;
		jPanel.add(mostraTempo2, gridBagConstraints);
		
		//Para adiocionar o Panel ao JDialog
		add(jPanel, BorderLayout.WEST);// Acima do setVisible faz um add passando o jPanel. Depois da ',' o comando é para o label se posicionar à esquerda
		/* Sempre será o último comando */
		setVisible(true);// Torna a tela visível para o usuário
	}

}
