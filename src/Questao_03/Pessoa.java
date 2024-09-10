//Tem que ver se fiz certo pq eu n faço ideia se acertei
package Questao_03;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private double altura;

    public Pessoa (String nome, LocalDate dataNascimento, double altura){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public int calcularIdade(LocalDate dataNascimento) {
        LocalDate hoje = LocalDate.now();
        return Period.between(dataNascimento, hoje).getYears();
    }

    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Idade: " + calcularIdade(dataNascimento) + " anos");
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Maria", LocalDate.of(1995, 10, 25), 1.68);
        pessoa.imprimirDados();
    }
}
