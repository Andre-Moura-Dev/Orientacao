package Matricula;

import Matricula.Model.Aluno;
import Matricula.Model.Turno;

import java.util.Scanner;

public class CadastroAluno {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criar aluno com dados do usuário
        System.out.println("Digite o nome do Aluno:");
        String nome = sc.nextLine();

        System.out.println("Digite a idade do Aluno:");
        int idade = sc.nextInt();
        sc.nextLine(); // Limpa o buffer do scanner

        System.out.println("Escolha o turno: matutino(m), vespertino(v), noturno(n)");
        String opcaoTurno = sc.nextLine();

        Aluno aluno = new Aluno(nome, idade, "");

        // Definindo o turno
        try {
            aluno.salvarTurno(opcaoTurno);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
            return; // Sai do programa em caso de erro
        }

        // Gerar matrícula aleatória
        aluno.geraMatricula();

        System.out.println("Qual ano o aluno irá cursar?");
        String turma = sc.nextLine();
        aluno.setTurma(turma);

        // Exibindo os dados da matrícula
        System.out.println("\nDados da matrícula:");
        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Idade: " + aluno.getIdade());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Turma: " + aluno.getTurma());
        System.out.println("Turno: " + aluno.getTurno().getDescricao());
    }
}