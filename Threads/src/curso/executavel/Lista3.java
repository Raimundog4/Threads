package curso.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import subclasses.Aluno;
import subclasses.Disciplina;

public class Lista3 {

	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();

		for (int qtd = 1; qtd <= 2; qtd++) {
			

			String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + "? ");
			/*
			 * String idade = JOptionPane.showInputDialog("Qual a sua idade? "); String
			 * dataNascimento =
			 * JOptionPane.showInputDialog("Qual a sua data de nascimento? "); String
			 * registroGeral = JOptionPane.showInputDialog("Qual o seu RG? "); String
			 * numeroCpf = JOptionPane.showInputDialog("Qual o seu CPF? "); String nomeMae =
			 * JOptionPane.showInputDialog("Qual o nome da sua mãe? "); String nomePai =
			 * JOptionPane.showInputDialog("Qual o nome do seu pai "); String dataMatricula
			 * = JOptionPane.showInputDialog("Qual a data da sua matrícula? "); String
			 * nomeEscola = JOptionPane.showInputDialog("Qual o nome da sua escola? ");
			 * String serieMatriculado = JOptionPane.showInputDialog("Qual a sua série? ");
			 */

			Aluno aluno1 = new Aluno();

			aluno1.setNome(nome);
			/*
			 * aluno1.setIdade(Integer.valueOf(idade));
			 * aluno1.setDataNascimento(dataNascimento);
			 * aluno1.setRegistroGeral(registroGeral); aluno1.setNumeroCpf(numeroCpf);
			 * aluno1.setNomeMae(nomeMae); aluno1.setNomePai(nomePai);
			 * aluno1.setDataMatricula(dataMatricula); aluno1.setNomeEscola(nomeEscola);
			 * aluno1.setSerieMatriculado(serieMatriculado);
			 */

			double[] notas = new double[4];
			for (int pos = 1; pos <= 1; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Qual a disciplina " + pos + " ?");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);

				for (pos = 0; pos < notas.length; pos++) {
					String notaDisciplina = JOptionPane.showInputDialog("Qual a nota " + pos + " ?");
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

					String disciplinaRemover = JOptionPane.showInputDialog("Qual disciplina remover? 1, 2, 3 ou 4");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					continuarRemover = JOptionPane.showConfirmDialog(null, "Deseja remover outra?");
					posicao++;
				}
			}
			alunos.add(aluno1);

		}
		for (int pos = 0; pos < alunos.size(); pos++) {
			Aluno aluno = alunos.get(pos);

			System.out.println("O nome do aluno é: " + aluno.getNome());
			System.out.println("A idade do aluno é: " + aluno.getIdade());
			System.out.println("A data de nascimento do aluno é: " + aluno.getDataNascimento());
			System.out.println("O RG do aluno é: " + aluno.getRegistroGeral());
			System.out.println("O CPF do aluno é: " + aluno.getNumeroCpf());
			System.out.println("O nome da mãe do aluno é: " + aluno.getNomeMae());
			System.out.println("O nome do pai do aluno é: " + aluno.getNomePai());
			System.out.println("A data de matrícula do aluno é: " + aluno.getDataMatricula());
			System.out.println("O nome da escola que o aluno frequenta é: " + aluno.getNomeEscola());
			System.out.println("A série que o aluno frequenta é: " + aluno.getSerieMatriculado());
			System.out.println("A média do aluno foi: " + aluno.getMediaNota());
			System.out.println("Resultado = " + aluno.getAlunoAprovado2());

			for (int posd = 0; posd < aluno.getDisciplinas().size(); posd++) {
				Disciplina disciplina = aluno.getDisciplinas().get(posd);
				System.out.println("Disciplina " + disciplina.getDisciplina());
				System.out.println("Notas: ");
				for (int i = 0; i < disciplina.getNota().length; i++) {
					System.out.println("Nota "+(i+1)+" "+disciplina.getNota()[i]);
				}
						

			}
		}

		int opcao = JOptionPane.showConfirmDialog(null, "Deseja trocar algum aluno?");

		if (opcao == 0) {

			Aluno aluno = new Aluno();
			boolean retorno = aluno.substitucaoAluno(alunos);

			String bacana = retorno ? "Sucesso!" : "Não encontrado!";
			JOptionPane.showMessageDialog(null, bacana);

			while (!retorno) {
				opcao = JOptionPane.showConfirmDialog(null, "Deseja tentar novamente?");
				if (opcao == 0) {
					retorno = aluno.substitucaoAluno(alunos);

				} else {
					break;
				}
			}
		}

	}
}
