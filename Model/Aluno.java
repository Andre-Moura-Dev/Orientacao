package Matricula.Model;

import java.util.Random;

public class Aluno extends Pessoa {
    
    private int matricula;
    private String turma;
    private String turno;

    public Aluno(int matricula, String turma, String turno, String nome, int idade) {
        super(nome, idade);
        this.matricula = matricula;
        this.turma = turma;
        this.turno = turno;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public String getTurma() {
        return this.turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;  
    }

    public String getTurno() {
        return this.turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void geraMatricula() {
        Random rn = new Random();
        int matricula = rn.nextInt(100);

        this.matricula = matricula;
    }

    public void salvarTurno(String opcaoTurno) {
        switch(opcaoTurno) {
            case "m":
                System.out.println("O aluno sera matriculado no turno matutino");
                this.turno = "Matutino";
                break;
            case "v":
                System.out.println("O aluno sera matriculado no turno vespertino");
                this.turno = "Vespertino";
                break;
            case "n":
                System.out.println("O aluno sera matriculado no turno noturno");
                this.turno = "Noturno";
                break;
            default:
                System.out.println("Opcao Invalida");            
        }
    }
}