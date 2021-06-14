package curso.thread;

import javax.swing.JOptionPane;

public class Paralelo2 {

	public static void main(String[] args) throws InterruptedException {

		/* Thread processando em paralelo */
		new Thread() {

			public void run() {// Executa o que n�s queremos
				/* Dentro do run vai o c�digo da rotina */

				for (int pos = 0; pos < 10; pos++) {

					try {
						Thread.sleep(1000);// Ele pede para ser colocado no bloco Try/Catch
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("Executando alguma rotina, por exemplo o envio de um e-mail");

					// Thread.sleep(1000);//Executa e espera
				}

			};

		}.start();// Start liga a thread que fica processando paralelamente por tr�s

		System.out.println("Chegou ao fim do c�digo de teste de Thread");

		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usu�rio");
	}

}
