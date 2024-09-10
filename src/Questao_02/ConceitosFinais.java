package Questao_02;

import java.util.ArrayList;
import java.util.Scanner;

public class ConceitosFinais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();

        while (true) {
            System.out.print("Digite a matrícula do aluno: ");
            String matricula = scanner.nextLine();

            System.out.print("Digite a nota do aluno: ");
            double nota = scanner.nextDouble();
            scanner.nextLine(); //limpar buffer se n buga '-'

            Aluno aluno = new Aluno(matricula, nota);
            alunos.add(aluno);

            System.out.println("Deseja adicionar mais um aluno? (s/n)");
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("n")) {
                break;
            }
        }

        System.out.println("\nConceitos Finais dos Alunos:");
        for (Aluno aluno : alunos) {
            System.out.println("Matrícula: " + aluno.getMatricula() + " | Nota: " + aluno.getNota() + " | Conceito: " + aluno.getConceito());
        }
    }
}
