package cursoJava.executavel;

import cursoJava.classes.Aluno;

public class executaPrograma {

	public static void main(String[] args) {
		/* Setando os valores dos atributos do Objeto com Construtor*/
		Aluno aluno1 = new Aluno( "Alex", 32, "18/10/1987",
				"414.567.229.0", "414.338.229.80", "Maria Joose",
				"Edimilson Gomes", "23/11/2021", "Jdev Treinamentos", "1");
				
		/* Setando os valores acessando direto pelo Método SETTER*/
				aluno1.setNome("Alex");
				aluno1.setIdade(32);
				aluno1.setDataNascimento("18/10/1987");
				aluno1.setRegistroGeral("414.567.229.0");
				aluno1.setNumeroCpf("414.338.229.80");
				aluno1.setNomeMae("Maria Jose");
				aluno1.setNomePai("Edimilson Gomes");
				aluno1.setDataMatricula("23/11/2021");
				aluno1.setNomeEscola("Jdev Treinamentos");
				aluno1.setSerieMatriculado("1");
		
		System.out.print(aluno1.getNome());
		
	}

}
