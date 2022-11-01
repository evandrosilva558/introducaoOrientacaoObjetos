package cursoJava.classes;

import java.util.Objects;

public class Aluno {

	/* Atributos da classe Aluno*/
	private String nome;
	private int idade;
	private String dataNascimento;
	private String registroGeral;
	private String numeroCpf;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	
	/* Construtor do Objeto Aluno*/
	public Aluno (String nome, int idade, String dataNascimento,
			String registroGeral, String numeroCpf,
			String nomeMae, String nomePai,
			String dataMatricula, String nomeEscola,
			String serieMatriculado, double nota1, double nota2,
			double nota3, double nota4) {
		super();
		
			this.nome = nome;
			this.idade = idade;
			this.dataNascimento = dataNascimento;
			this.registroGeral = registroGeral;
			this.numeroCpf = numeroCpf;
			this.nomeMae = nomeMae;
			this.nomePai = nomePai;
			this.dataMatricula = dataMatricula;
			this.nomeEscola = nomeEscola;
			this.serieMatriculado = serieMatriculado;
	}
	
	/* Metodos SETTERS e GETTERS */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String getDataNascimento() {
		return dataNascimento;
	}
	
	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}
	
	public String getRegistroGeral() {
		return registroGeral;
	}
	
	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}
	
	public String getNumeroCpf() {
		return numeroCpf;
	}
	
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	
	public String getNomeMae() {
		return nomeMae;
	}
	
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	
	public String getNomePai() {
		return nomePai;
	}
	
	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	
	public String getDataMatricula() {
		return dataMatricula;
	}
	
	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}
	
	public String getNomeEscola() {
		return nomeEscola;
	}
	
	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}
	
	public String getSerieMatriculado() {
		return serieMatriculado;
	}
	
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	
	public double getNota1() {
		return nota1;
	}
	
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	
	public double getNota2() {
		return nota2;
	}
	
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNota3() {
		return nota3;
	}
	
	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}
	
	public double getNota4() {
		return nota4;
	}
	
	/* Calculo da média do Aluno*/
	public double getMedia() {
		return (nota1 + nota2 + nota3 + nota4)/4;
	}
	
	/* Retorna se o aluno esta aprovado*/
	public boolean getAlunoAprovado() {
		double media = this.getMedia();
		if (media >= 7) {
			return true;
		}else {
			return false;
		}
	}
	
	/* Métodos EQUALS e HASHCODE para diferênciar os objeto apartir de um ou mais atributos*/
	@Override
	public int hashCode() {
		return Objects.hash(numeroCpf, registroGeral);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(numeroCpf, other.numeroCpf) && Objects.equals(registroGeral, other.registroGeral);
	}
	
	/*Método toString retorna uma representação do Objeto*/
	@Override
	public String toString() {
		return  " Aluno" + "\n" + " Nome: "+ getNome() + "\n" + 
				" Idade: " + getIdade() + "\n" + " Nascimento: " + getDataNascimento() + "\n" +
				" Rg: " + getRegistroGeral() + " Cpf: " + getNumeroCpf() + "\n" + 
				" Nome da Mãe: " + getNomeMae() + "\n" +" Nome do Pai: " + getNomePai() + "\n" +
				" Matricula: " + getDataMatricula() + "\n" + " Série: " + getSerieMatriculado() + "\n" + 
				" Media: " + getMedia() + "\n" + " Resultado:" + getAlunoAprovado() ;
	}
	
}