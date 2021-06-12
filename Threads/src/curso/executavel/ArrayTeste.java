package curso.executavel;

import subclasses.Aluno;
import subclasses.Disciplina;

public class ArrayTeste {
	public static void main(String[] args) {
		try {
			double[] notas = { 8.5, 9.2, 8, 7.5 };
			double[] notas2 = { 9.5, 7.2, 10, 7.25 };

			Aluno aluno = new Aluno();
			aluno.setNome("Rai");

			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina("Java");
			disciplina.setNota(notas);

			Disciplina disciplina1 = new Disciplina();
			disciplina1.setDisciplina("HTML");
			disciplina1.setNota(notas2);

			aluno.getDisciplinas().add(disciplina);
			aluno.getDisciplinas().add(disciplina1);

			System.out.println("Aluno: " + aluno.getNome() + ". Matriculado no curso: " + aluno.getDisciplinas());
			System.out.println("---------------Disciplinas--------------");

			for (Disciplina d : aluno.getDisciplinas()) {
				System.out.println("Disciplina: " + d.getDisciplina());

				double notaMax = 0.0;
				double notaMin = 0.0;
				System.out.println("Notas: ");
				for (int pos = 0; pos < d.getNota().length; pos++) {
					System.out.println("Nota " + (pos + 1) + " " + d.getNota()[pos]);

					//Descobrindo o maior valor dentro de um array
					if (pos == 0) {
						notaMax = d.getNota()[pos];
					} else {
						if (d.getNota()[pos] > notaMax) {
							notaMax = d.getNota()[pos];
						}

					}
					//Descobrindo o menor valor dentro de um array
					if (pos == 0) {
						notaMin = d.getNota()[pos];
					} else {
						if (d.getNota()[pos] < notaMin) {
							notaMin = d.getNota()[pos];
						}
					}
				}
				System.out.println("A maior nota da disciplina " + d.getDisciplina() + " é: " + notaMax);
				System.out.println("A maior nota da disciplina " + d.getDisciplina() + " é: " + notaMin);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}