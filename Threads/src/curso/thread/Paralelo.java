package curso.thread;

import javax.swing.JOptionPane;

public class Paralelo {

	public static void main(String[] args) throws InterruptedException {

		/* Thread processando em paralelo do envio do e-mail */
		new Thread() {

			public void run() {
				

				for (int pos = 0; pos < 10; pos++) {

					try {
						Thread.sleep(1000);// 
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("Executando alguma rotina, por exemplo o envio de um e-mail");

					
				}

			};

		}.start();

		//***************DIVISÃO DAS THREADS
		/* Thread processando em paralelo do envio de nota fiscal */
		new Thread() {

			public void run() {
				

				for (int pos = 0; pos < 10; pos++) {

					try {
						Thread.sleep(1000);// 
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("Executando alguma rotina, por exemplo o envio de nota fiscal");

					
				}

			};

		}.start();

		
		System.out.println("Chegou ao fim do código de teste de Thread");

		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");
	}

}
