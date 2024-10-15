package Matricula;

import Matricula.Model.Aluno;
import java.util.Scanner;

public class CadastroAluno {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();
        
        System.out.println("Digite o nome do Aluno:");
        aluno.setNome(sc.next());

        System.out.println("Digite a idade do Aluno:");
        aluno.setIdade(sc.nextInt());

        System.out.println("Escolha o turno: matutino(m), vespertino(v), noturno(n)");
        String opcaoTurno = sc.next();

        aluno.salvarTurno(opcaoTurno);

        aluno.geraMatricula();

        System.out.println("Qual ano o aluno ira cursar");
        aluno.setTurma(sc.next());

        
        System.out.println("\n\nDados da matricula\n");
        System.out.println("Aluno: "+ aluno.getNome());
        System.out.println("Idade: "+ aluno.getIdade());
        System.out.println("Matricula: "+ aluno.getMatricula());
        System.out.println("Turma: "+ aluno.getTurma());
        System.out.println("Turno: "+ aluno.getTurno());
    }
}
