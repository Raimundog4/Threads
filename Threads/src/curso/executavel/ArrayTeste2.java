package curso.executavel;

import subclasses.Aluno;
import subclasses.Disciplina;

public class ArrayTeste2 {
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

			// ----------------------------------------------------------

			Aluno[] arrayAlunos = new Aluno[1];
			arrayAlunos[0] = aluno;

			for (int pos = 0; pos < arrayAlunos.length; pos++) {

				System.out.println("O nome do aluno é: "+arrayAlunos[pos].getNome());
				
				for (Disciplina disc : arrayAlunos[pos].getDisciplinas()) {
					
					System.out.println("O nome da disciplina é: "+disc.getDisciplina());
					
					for (pos = 0; pos < disc.getNota().length; pos++) {
						
						System.out.println("A nota "+(pos+1)+" é: "+disc.getNota()[pos]);
						
					}
					
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}