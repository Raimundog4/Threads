package curso.executavel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import curso.contantes.StatusAlunos;
import funcoes.heranca.FuncaoAutenticacao;
import subclasses.Aluno;
import subclasses.Diretor;
import subclasses.Disciplina;

public class Customizada3 {

	public static void main(String[] args) {
		try {

			// lerArquivo();

			String login = JOptionPane.showInputDialog("Informe o seu usu�rio");
			String senha = JOptionPane.showInputDialog("Informe a sua senha");

			if (new FuncaoAutenticacao(new Diretor(login, senha)).funcaoAutenticar()) {// Nova fun��o recebnedo o objeto
																						// que invoca a fun��o

				List<Aluno> alunos = new ArrayList<Aluno>();
				HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

				String quantidade = JOptionPane.showInputDialog("Quantos alunos?");
				for (int qtd = 1; qtd <= Integer.valueOf(quantidade); qtd++) {

					String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + "? ");

					Aluno aluno1 = new Aluno();

					aluno1.setNome(nome);

					quantidade = JOptionPane.showInputDialog("Quantas disciplinas?");
					double[] notas = new double[4];
					for (int pos = 1; pos <= Integer.valueOf(quantidade); pos++) {
						String nomeDisciplina = JOptionPane.showInputDialog("Qual a disciplina " + pos + " ?");

						Disciplina disciplina = new Disciplina();
						disciplina.setDisciplina(nomeDisciplina);
						
						for (pos = 0; pos < notas.length; pos++) {
							String notaDisciplina = JOptionPane.showInputDialog("Qual a nota " + (pos + 1) + " ?");
							notas[pos] = Double.valueOf(notaDisciplina);
							disciplina.setNota(notas);
						}

						aluno1.getDisciplinas().add(disciplina);

					}

					int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");

					if (escolha == 0) {

						int continuarRemover = 0;
						int posicao = 1;

						while (continuarRemover == 0) {

							String disciplinaRemover = JOptionPane
									.showInputDialog("Qual disciplina remover? 1, 2, 3 ou 4");
							aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
							continuarRemover = JOptionPane.showConfirmDialog(null, "Deseja remover outra?");
							posicao++;
						}
					}
					alunos.add(aluno1);

				}
				maps.put(StatusAlunos.APROVADO, new ArrayList<Aluno>());
				maps.put(StatusAlunos.APROVADOGENIO, new ArrayList<Aluno>());
				maps.put(StatusAlunos.RECUPERACAO, new ArrayList<Aluno>());
				maps.put(StatusAlunos.REPROVADO, new ArrayList<Aluno>());

				for (Aluno aluno : alunos) {

					if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAlunos.APROVADO)) {
						maps.get(StatusAlunos.APROVADO).add(aluno);
					} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAlunos.APROVADOGENIO)) {
						maps.get(StatusAlunos.APROVADOGENIO).add(aluno);
					} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAlunos.RECUPERACAO)) {
						maps.get(StatusAlunos.RECUPERACAO).add(aluno);
					} else {
						maps.get(StatusAlunos.REPROVADO).add(aluno); /* reprovado */
					}

				}
				System.out.println("------------Lista dos Aprovados --------------");
				for (Aluno aluno : maps.get(StatusAlunos.APROVADO)) {
					System.out.println("Alunos: " + aluno.getNome() + " com a m�dia: " + aluno.getMediaNota());
				}
				System.out.println("------------Lista dos G�nios --------------");
				for (Aluno aluno : maps.get(StatusAlunos.APROVADOGENIO)) {
					System.out.println("Alunos: " + aluno.getNome() + " com a m�dia: " + aluno.getMediaNota());
				}
				System.out.println("------------Lista dos Em Recupera��o --------------");
				for (Aluno aluno : maps.get(StatusAlunos.RECUPERACAO)) {
					System.out.println("Alunos: " + aluno.getNome() + " com a m�dia: " + aluno.getMediaNota());
				}
				System.out.println("------------Lista dos Reprovados --------------");
				for (Aluno aluno : maps.get(StatusAlunos.REPROVADO)) {
					System.out.println("Alunos: " + aluno.getNome() + " com a m�dia: " + aluno.getMediaNota());
				}
			} else {
				JOptionPane.showMessageDialog(null, "Usu�rio e/ou senha inv�lidos!");
			}
		} catch (Exception e) {

			StringBuilder saida = new StringBuilder();// Classe do pr�prio java para trabalhar com o texto

			e.printStackTrace();

			System.out.println("Mensagem: " + e.getMessage());

			for (int ex = 0; ex < e.getStackTrace().length; ex++) {

				saida.append("\n Classe de erro " + e.getStackTrace()[ex].getClassName());// o \n faz a quebra de linha
				saida.append("\n Linha de erro " + e.getStackTrace()[ex].getLineNumber());
				saida.append("\n M�todo de erro " + e.getStackTrace()[ex].getMethodName());
				saida.append("\n M�todo de erro " + e.getClass().getName());

			}
			JOptionPane.showMessageDialog(null, "Erro de convers�o de n�mero." + saida.toString());
		} finally {
			JOptionPane.showMessageDialog(null, "Voc� est� estudando java!");
		}
	}

	public static void lerArquivo() throws FileNotFoundException {

		File fil = new File("c://lines.txt");
		Scanner scanner = new Scanner(fil);
	}
}
