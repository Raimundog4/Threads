package curso.thread;

import javax.swing.JOptionPane;

public class Threads {

	public static void main(String[] args) throws InterruptedException {


		/* Código da rotina que eu quero executar em paralelo */
		for (int pos = 0; pos < 10; pos++) {

			Thread.sleep(1000);// Dá um tempo - espera e executa
			// Executar esse envio com um tempo de parada, ou com um tempo determinado
			System.out.println("Executando alguma rotina, por exemplo o envio de um e-mail");

			// Thread.sleep(1000);//Executa e espera
		}
		/* Fim do código em paralelo */

		/* Código do sistema do usuário continua o fluxo de trabalho */
		System.out.println("Chegou ao fim do código de teste de Thread");

		/* Fluxo do sistema, cadastro de venda, emissão de nota fiscal, algo assim */
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");

	}

}
