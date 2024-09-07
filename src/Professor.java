public class Professor {
    private String nome;
    private String cpf;
    private String titulacao;
    private double salario;

    public Professor(String nome, String cpf, String titulacao, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.titulacao = titulacao;
        this.salario = salario;
    }

    public double calcularContribuicao() {
        double percentual = 0;
        switch (titulacao) {
            case "Especialista":
                percentual = 0.012;
                break;
            case "Mestre":
                percentual = 0.014;
                break;
            case "Doutor":
                percentual = 0.016;
                break;
        }
        return salario * percentual;
    }

    public String getTitulacao() {
        return titulacao;
    }
}
