package Matricula.Model;

import java.util.Random;

public class Aluno extends Pessoa {

    private int matricula;
    private String turma;
    private Turno turno;

    public Aluno(String nome, int idade, String turma) {
        super(nome, idade);
        this.turma = turma;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    // Geração mais robusta da matrícula
    public void geraMatricula() {
        Random rn = new Random();
        // Gera matrícula com 6 dígitos
        this.matricula = rn.nextInt(900000) + 100000;
    }

    // Atualiza o turno com base em uma string
    public void salvarTurno(String opcaoTurno) {
        this.turno = Turno.fromString(opcaoTurno); // Usando o método do Enum
    }
}