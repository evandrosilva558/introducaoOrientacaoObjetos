package cursoJava.classes;

public class Aluno {
	
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
	
	public Aluno(String nome, int idade, String dataNascimento,
			String registroGeral, String numeroCpf,
			String nomeMae, String nomePai,
			String dataMatricula, String nomeEscola,
			String serieMatriculado) {
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
	
	public String getnumeroCpf() {
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
	
	public String getdataMatricula() {
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

}