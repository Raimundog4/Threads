package curso.thread;

import javax.swing.JOptionPane;

public class Threads {

	public static void main(String[] args) throws InterruptedException {


		/* C�digo da rotina que eu quero executar em paralelo */
		for (int pos = 0; pos < 10; pos++) {

			Thread.sleep(1000);// D� um tempo - espera e executa
			// Executar esse envio com um tempo de parada, ou com um tempo determinado
			System.out.println("Executando alguma rotina, por exemplo o envio de um e-mail");

			// Thread.sleep(1000);//Executa e espera
		}
		/* Fim do c�digo em paralelo */

		/* C�digo do sistema do usu�rio continua o fluxo de trabalho */
		System.out.println("Chegou ao fim do c�digo de teste de Thread");

		/* Fluxo do sistema, cadastro de venda, emiss�o de nota fiscal, algo assim */
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usu�rio");

	}

}
