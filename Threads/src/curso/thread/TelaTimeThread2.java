package curso.thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread2 extends JDialog {// Framework do próprio java para criar aplicação para desktop

	/* Painel de componentes */
	private JPanel jPanel = new JPanel(new GridBagLayout()); //Inicia dizendo que vamos fazer o controle dos componentes dentro dele, por isso o new GridBagLayout
	
	private JLabel descricaoHora = new JLabel("Time Thread 1"); 
	private JTextField mostraTempo = new JTextField();
	
	private JLabel descricaoHora2 = new JLabel("Time Thread 2"); 
	private JTextField mostraTempo2 = new JTextField();
	
	private	JButton jButton = new JButton("Start");
	private	JButton jButton2 = new JButton("Stop");
	
	private Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			while(true) {//Fica sempre rodando
	
				mostraTempo.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").
						format(Calendar.getInstance().getTime()));
				/* Poderia ser assim */
//				mostraTempo2.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").
//						format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	};
	
	private Runnable thread2 = new Runnable() {
		public void run() {
			while(true) {
			
			mostraTempo2.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").
					format(Calendar.getInstance().getTime()));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			}
		}
	};
	
	private Thread thread1Time;//Objeto thread
	private Thread thread2Time;
	
	public TelaTimeThread2() {// Executa o que tiver dentro no momento da abertura ou execução
		super.setTitle("Minha tela de time com Thread");// Está vindo da superclasse JDialog
		super.setSize(new Dimension(240, 240));
		setLocationRelativeTo(null);// Pede para centralizar a tela de acordo com algum componente, mas não temos nenhum componente base
		setResizable(false);// Ativa ou desativa a opção de aumentar ou diminuir tela
		/* Primeira parte concluída */

		
		GridBagConstraints gridBagConstraints = new GridBagConstraints();//Controlador de posicionamento de botões na tela
		gridBagConstraints.gridx = 0; // Linhas - sentido horizontal - linha 0
		gridBagConstraints.gridy = 0; // Colunas - sentido vertical - coluna 0
		gridBagConstraints.gridwidth = 2; // Diz que tem que ocupar o espaço de 2
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);// Altura do top, esuqerda, baixo e direita
		gridBagConstraints.anchor = GridBagConstraints.WEST; 
		
		descricaoHora.setPreferredSize(new Dimension(200, 25));//Tamanho do botão
		//(qual componente inserir, gerenciador)
		jPanel.add(descricaoHora, gridBagConstraints); // Colocar o componente dentro do painel
		
		mostraTempo.setPreferredSize(new Dimension(200, 25));
		mostraTempo.setEditable(false);
		gridBagConstraints.gridy ++;
		jPanel.add(mostraTempo, gridBagConstraints);
		
		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy ++;	
		jPanel.add(descricaoHora2, gridBagConstraints);
		
		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		mostraTempo2.setEditable(false);
		gridBagConstraints.gridy ++;
		jPanel.add(mostraTempo2, gridBagConstraints);
		
		gridBagConstraints.gridwidth = 1; // Fala que o espaço volta a ser 1 e ele coloca dois botões nesse espaço - mede a parte de cima e encaixa dois botões embaixp
		
		jButton.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridy ++;
		jPanel.add(jButton, gridBagConstraints);
		
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {// Executa o clique no botão
				jButton.setEnabled(false);
				jButton2.setEnabled(true);
				
				thread1Time = new Thread(thread1);// Temos uma thread recebendo um runnable que vai ficar executando a nossa data e colocando no campo de texto
				thread1Time.start();// Quando dá esse start ele fica executando o run por trás
				thread2Time = new Thread(thread2);
				thread2Time.start();
			}
		});
		
		jButton2.setEnabled(false);
		
		jButton2.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridx ++;
		jPanel.add(jButton2, gridBagConstraints);
		
		jButton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				thread1Time.stop();
				thread2Time.stop();
				jButton.setEnabled(true);
				jButton2.setEnabled(false);
			}
		});
		
		//Para adiocionar o Panel ao JDialog
		add(jPanel, BorderLayout.WEST);// Acima do setVisible faz um add passando o jPanel. Depois da ',' o comando é para o label se posicionar à esquerda
		/* Sempre será o último comando */
		setVisible(true);// Torna a tela visível para o usuário
	}

}
