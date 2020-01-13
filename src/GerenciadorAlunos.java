import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorAlunos {


    public static void main(String[] args) {
        int opcaoMenu = 0;
        ArrayList<Aluno> aluno = new ArrayList();

        while (opcaoMenu != 9){
            Scanner scanner = new Scanner(System.in);

            System.out.println("1-Adicionar novos alunos\n");
            System.out.println("2-Listar os alunos adicionados\n");
            System.out.println("9-Sair\n");

            opcaoMenu = scanner.nextInt();
            if (opcaoMenu == 1) {
                System.out.println("Digite o nome");
                String nome = scanner.next();
                scanner.nextLine();

                System.out.println("Digite a idade");
                int idade = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Digite o documento");
                String documento = scanner.nextLine();

                Aluno novoAluno = new Aluno(nome,idade,documento);
                aluno.add(novoAluno);
            } else if(opcaoMenu == 2){
                if(aluno.isEmpty()){
                    System.out.println("Não há alunos cadastrados");
                } else {
                    System.out.println(aluno.toString());
                }
            }
        }
    }
}
