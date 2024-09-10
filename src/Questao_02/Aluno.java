package Questao_02;

class Aluno {
    private String matricula;
    private double nota;

    public Aluno(String matricula, double nota) {
        this.matricula = matricula;
        this.nota = nota;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getNota() {
        return nota;
    }

    public String getConceito() {
        if (nota >= 9.0) {
            return "A";
        } else if (nota >= 8.0) {
            return "B";
        } else if (nota >= 7.0) {
            return "C";
        } else if (nota >= 6.0) {
            return "D";
        } else {
            return "F";
        }
    }
}

