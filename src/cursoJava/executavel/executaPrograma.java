package cursoJava.executavel;

import javax.swing.JOptionPane;

import cursoJava.classes.Aluno;

public class executaPrograma {

	public static void main(String[] args) {
		
		/* Setando os valores dos atributos do Objeto com Construtor*/
		Aluno aluno1 = new Aluno( "Alex", 32, "18/10/1987",
				"414.567.229.0", "414.338.229.80", "Maria Joose",
				"Edimilson Gomes", "23/11/2021", "Jdev Treinamentos", "1", 
				10, 8, 7, 10);
				
		/*Incluido Caixa de entrada de dados do Teclado do usuário com JavaSwing*/
			String nome = JOptionPane.showInputDialog("Nome do Aluno?");
			String idade = JOptionPane.showInputDialog("Idade?");
			String nascimento = JOptionPane.showInputDialog("Nascimento?");
			String rg = JOptionPane.showInputDialog("Registro Geral?");
			String cpf = JOptionPane.showInputDialog("CPF?");
			String mae = JOptionPane.showInputDialog("Nome da Mãe?");
			String pai = JOptionPane.showInputDialog("Nome do Pai?");
			String matricula = JOptionPane.showInputDialog("Data Matricula?");
			String escola = JOptionPane.showInputDialog("Nome da Escola?");
			String serie = JOptionPane.showInputDialog("Série?");
			String nota1 = JOptionPane.showInputDialog("Nota 1?");
			String nota2 = JOptionPane.showInputDialog("Nota 2?");
			String nota3 = JOptionPane.showInputDialog("Nota 3?");
			String nota4 = JOptionPane.showInputDialog("Nota 4?");
			
			/*Seta os dados do Objeto aluno*/
			aluno1.setNome(nome);
			aluno1.setIdade(Integer.valueOf(idade)); /*Tratando String para Inteiro*/
			aluno1.setDataNascimento(nascimento);
			aluno1.setRegistroGeral(rg);
			aluno1.setNumeroCpf(cpf);
			aluno1.setNomeMae(mae);
			aluno1.setNomePai(pai);
			aluno1.setDataMatricula(matricula);
			aluno1.setNomeEscola(escola);
			aluno1.setSerieMatriculado(serie);
			aluno1.setNota1(Integer.valueOf(nota1));
			aluno1.setNota2(Integer.valueOf(nota2));
			aluno1.setNota3(Integer.valueOf(nota3));
			aluno1.setNota4(Integer.valueOf(nota4));
				
		/* Imprime os dados do Objeto Aluno*/
		System.out.print(aluno1);
		
	}

}
