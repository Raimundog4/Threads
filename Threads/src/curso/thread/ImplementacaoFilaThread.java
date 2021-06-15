package curso.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

//Essa classe se tornará uma Thread, por isso há a extensão
public class ImplementacaoFilaThread extends Thread {

	// Tem que ser estático para poder lá na tela acessar essa mesma instância, com
	// os mesmos dados para poder manipular essa lista, adicionar elementos nessa
	// pilha para opder ficar processando em paralelo
	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_filha = 
			new ConcurrentLinkedQueue<ObjetoFilaThread>();//ConcurrentLinkedQueue é uma classe do java para usar em processamento paralelo junto com as threads

	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_filha.add(objetoFilaThread);
	}
	
	@Override
	public void run() {
		Iterator iteracao = pilha_filha.iterator();// Chamando o iterator porque PILHA_FILHA não tem interação - interage para percorrer a lista

		synchronized (iteracao) {//Bloqueia o acesso a esta lista por outros processos - só essa thread acessa essa lista
			
		
		while(iteracao.hasNext()) {/* Enquanto tiver dados ele irá processar */
			
			ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next(); //Pega o objeto atual
			
			/* Processar 10 mil notas fiscais */
			/* Gerar uma lista enorme de PDF */
			/* Gerar um envio em massa de email */
			
			iteracao.remove();//Após processar o objeto ele é removido
			
			try {
				Thread.sleep(100);//Dá um tempo para descarga de memória
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			try {
				Thread.sleep(1000);//Após processar toda a lista  dá um tempo para a limpeza de memória
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
		}
	}

}
