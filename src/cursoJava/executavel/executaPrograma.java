package cursoJava.executavel;

import cursoJava.classes.Aluno;

public class executaPrograma {

	public static void main(String[] args) {
		
		/* Setando os valores dos atributos do Objeto com Construtor*/
		Aluno aluno1 = new Aluno( "Alex", 32, "18/10/1987",
				"414.567.229.0", "414.338.229.80", "Maria Joose",
				"Edimilson Gomes", "23/11/2021", "Jdev Treinamentos", "1", 
				10, 8, 7, 10);
				
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
			aluno1.setNota1(10);
			aluno1.setNota2(8);
			aluno1.setNota3(7);
			aluno1.setNota4(10);
				
		/* Imprime os dados do Objeto Aluno*/
		System.out.print("------------------------------------" + "\n" +
				" Nome: " + aluno1.getNome() + "\n" +
				" Idade: " + aluno1.getIdade() + "\n" +
				" Nascimento: " + aluno1.getDataNascimento() + "\n" +
				" RG: " + aluno1.getRegistroGeral() + "\n" +
				" CPF: " + aluno1.getNumeroCpf() + "\n" +
				" Nome da Mãe: " + aluno1.getNomeMae() + "\n" +
				" Nome do Pai: " + aluno1.getNomePai() + "\n" +
				" Data da Matricula: " + aluno1.getDataMatricula() + "\n" +
				" Escola: " + aluno1.getNomeEscola() + "\n" +
				" Série: " + aluno1.getSerieMatriculado() + "\n" +
				" Média: " + aluno1.getMedia() + "\n" +
				"------------------------------------");
		
	}

}
