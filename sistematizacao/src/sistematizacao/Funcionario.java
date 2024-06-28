package sistematizacao;

public class Funcionario {

	// Início das variáveis
	public String nome;
	public int matricula;
	public int idade;
	public String alergias;
	public String problemasMedicos;
	public String telefone;
	public String email;

	// Construtor
	public Funcionario(String nome, int matricula, int idade, String alergias, String problemasMedicos, String telefone,
			String email) {
		this.nome = nome;
		this.matricula = matricula;
		this.idade = idade;
		this.alergias = alergias;
		this.problemasMedicos = problemasMedicos;
		this.telefone = telefone;
		this.email = email;
	}

	// Métodos para acesso aos dados
	public String getNome() {
		return nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public int getIdade() {
		return idade;
	}

	public String getAlergias() {
		return alergias;
	}

	public String getProblemasMedicos() {
		return problemasMedicos;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getEmail() {
		return email;
	}

}
