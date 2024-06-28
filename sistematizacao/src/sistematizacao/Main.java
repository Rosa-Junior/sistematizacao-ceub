package sistematizacao;

// Bibliotecas necessárias
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Funcionario> funcionarios = new ArrayList<>();

		// Adicionar as informações dos funcionários
		while (true) {
			System.out.println("Digite o nome do funcionário (para encerrar, digite 'fim'):");
			String nome = scanner.nextLine();
			if (nome.equalsIgnoreCase("fim")) {
				break;
			}

			System.out.println("Digite a matricula:");
			int matricula = scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("Digite a idade:");
			int idade = scanner.nextInt();
			scanner.nextLine();

			System.out.println("Digite as alergias:");
			String alergias = scanner.nextLine();

			System.out.println("Digite os problemas médicos:");
			String problemasMedicos = scanner.nextLine();

			System.out.println("Digite o telefone:");
			String telefone = scanner.nextLine();

			System.out.println("Digite o e-mail:");
			String email = scanner.nextLine();

			Funcionario novoFuncionario = new Funcionario(nome, matricula, idade, alergias, problemasMedicos, telefone, email);
			funcionarios.add(novoFuncionario);

			System.out.println("Funcionário adicionado com sucesso!\n");
		}

		// Exibir os funcionários cadastrados após o comando 'fim'
		System.out.println("\nLista de funcionários cadastrados:");
		for (Funcionario funcionario : funcionarios) {
			System.out.println("Nome: " + funcionario.getNome());
			System.out.println("Matrícula: " + funcionario.getMatricula());
			System.out.println("Idade: " + funcionario.getIdade());
			System.out.println("Alergias: " + funcionario.getAlergias());
			System.out.println("Problemas Médicos: " + funcionario.getProblemasMedicos());
			System.out.println("Telefone: " + funcionario.getTelefone());
			System.out.println("E-mail: " + funcionario.getEmail());
			System.out.println();
		}

		scanner.close();
	}
}