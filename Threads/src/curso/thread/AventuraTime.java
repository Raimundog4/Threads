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

public class AventuraTime extends JDialog {

	private JPanel jPanel = new JPanel(new GridBagLayout());
	
	private JLabel horario = new JLabel("Horário atual");
	private JTextField mostraHora = new JTextField();
	
	private JLabel data = new JLabel("Data atual");
	private JTextField mostraData = new JTextField();
	
	private JButton jButton = new JButton("Start");
	private JButton jButton2 = new JButton("Stop");
	
	private Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			while(true) {
				mostraHora.setText(new SimpleDateFormat("hh:mm:ss").
						format(Calendar.getInstance().getTime()));
				mostraData.setText(new SimpleDateFormat("dd/MM/yyyy").
						format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	};
	
	private Thread thread1Time;
	private Thread thread2Time;
	
	public AventuraTime() {
		setTitle("Tela Linda");
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null);
		setResizable(false);
		
		
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);
		gridBagConstraints.anchor = GridBagConstraints.WEST;
		
		horario.setPreferredSize(new Dimension(200, 25));
		jPanel.add(horario, gridBagConstraints);
		
		mostraHora.setPreferredSize(new Dimension(200, 25));
		mostraHora.setEditable(false);
		gridBagConstraints.gridy ++;
		jPanel.add(mostraHora, gridBagConstraints);
		
		data.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy ++;
		jPanel.add(data, gridBagConstraints);
		
		mostraData.setPreferredSize(new Dimension(200, 25));
		mostraData.setEditable(false);
		gridBagConstraints.gridy ++;
		jPanel.add(mostraData, gridBagConstraints);
		
		gridBagConstraints.gridwidth = 1;
		
		jButton.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridy ++;
		jPanel.add(jButton, gridBagConstraints);
		
		jButton2.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridx ++;
		jPanel.add(jButton2, gridBagConstraints);
	
		jButton2.setEnabled(false);
		
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				jButton.setEnabled(false);
				jButton2.setEnabled(true);
				thread1Time = new Thread(thread1);
			
				
				thread1Time.start();
				
			}
		});
		
jButton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jButton.setEnabled(true);
				jButton2.setEnabled(false);
				thread1Time.stop();
				
			}
		});
		
		add(jPanel, BorderLayout.WEST);
		setVisible(true);
	}
	
}
