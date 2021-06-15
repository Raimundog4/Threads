package curso.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

//Essa classe se tornar� uma Thread, por isso h� a extens�o
public class ImplementacaoFilaThread extends Thread {

	// Tem que ser est�tico para poder l� na tela acessar essa mesma inst�ncia, com
	// os mesmos dados para poder manipular essa lista, adicionar elementos nessa
	// pilha para opder ficar processando em paralelo
	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = 
			new ConcurrentLinkedQueue<ObjetoFilaThread>();//ConcurrentLinkedQueue � uma classe do java para usar em processamento paralelo junto com as threads

	public static void add(ObjetoFilaThread objetoFilaThread) {//Recebe o objeto com os dados da tela e coloca na pilha
		pilha_fila.add(objetoFilaThread);
	}
	
	@Override
	public void run() {
		
		System.out.println("Fila rodando");
		
		while(true) {
		Iterator iteracao = pilha_fila.iterator();// Chamando o iterator porque PILHA_FILA n�o tem intera��o - interage para percorrer a lista
		synchronized (iteracao) {//Bloqueia o acesso a esta lista por outros processos - s� essa thread acessa essa lista
			
		
		while(iteracao.hasNext()) {/* Enquanto tiver dados ele ir� processar */
			
			ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next(); //Pega o objeto atual
			
			/* Processar 10 mil notas fiscais */
			/* Gerar uma lista enorme de PDF */
			/* Gerar um envio em massa de email */
			System.out.println("-------------------------------");
			
			System.out.println(processar.getNome());
			System.out.println(processar.getEmail());
			
			iteracao.remove();//Ap�s processar o objeto ele � removido
			
			try {
				Thread.sleep(100);//D� um tempo para descarga de mem�ria
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			try {
				Thread.sleep(100);//Ap�s processar toda a lista  d� um tempo para a limpeza de mem�ria
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
		}
		}
	}
	@Override
	public synchronized void start() {//Como o Thread j� tem o Start, n�o precisaria desse m�todo
		super.start();//Refer�ncia para Thread
	}

}
