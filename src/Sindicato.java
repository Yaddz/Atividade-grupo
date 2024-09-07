import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sindicato {
    private List<Professor> professores;

    public Sindicato() {
        professores = new ArrayList<>();
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public double calcularTotalArrecadado() {
        double total = 0;
        for (Professor professor : professores) {
            total += professor.calcularContribuicao();
        }
        return total;
    }

    public int contarMestres() {
        int contador = 0;
        for (Professor professor : professores) {
            if (professor.getTitulacao().equals("Mestre")) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Sindicato sindicato = new Sindicato();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o nome do professor: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o CPF do professor: ");
            String cpf = scanner.nextLine();

            System.out.print("Digite a titulação do professor (Doutor, Mestre, Especialista): ");
            String titulacao = scanner.nextLine();

            System.out.print("Digite o salário do professor: ");
            double salario = scanner.nextDouble();
            scanner.nextLine();  // Limpar o buffer do scanner

            Professor professor = new Professor(nome, cpf, titulacao, salario);
            sindicato.adicionarProfessor(professor);

            System.out.print("Deseja adicionar mais um professor? (s/n): ");
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("n")) {
                break;
            }
        }

        System.out.println("Total arrecadado pelo sindicato: R$ " + sindicato.calcularTotalArrecadado());
        System.out.println("Quantidade de professores Mestres: " + sindicato.contarMestres());
    }
}
