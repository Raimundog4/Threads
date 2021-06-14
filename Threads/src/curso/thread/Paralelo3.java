package curso.thread;

import javax.swing.JOptionPane;

public class Paralelo3 {

	public static void main(String[] args) throws InterruptedException {

		/* Thread processando em paralelo do envio do e-mail */
		Thread threadEmail = new Thread(thread1);// Instanciando como objeto
		threadEmail.start();

		// ***************DIVISÃO DAS THREADS
		/* Thread processando em paralelo do envio de nota fiscal */
		Thread threadNF = new Thread(thread2);
		threadNF.start();

		System.out.println("Chegou ao fim do código de teste de Thread");

		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");
	}

	private static Runnable thread1 = new Runnable() {

		@Override
		public void run() {// Possibilita instanciar objeto
			for (int pos = 0; pos < 10; pos++) {

				try {
					Thread.sleep(1000);//
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Executando alguma rotina, por exemplo o envio de um e-mail");

			}

		}
	};
	private static Runnable thread2 = new Runnable() {

		@Override
		public void run() {
			for (int pos = 0; pos < 10; pos++) {

				try {
					Thread.sleep(1000);//
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Executando alguma rotina, por exemplo o envio de nota fiscal");

			}
		}
	};

}
