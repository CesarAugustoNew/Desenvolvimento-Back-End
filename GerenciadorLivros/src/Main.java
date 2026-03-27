import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        ArrayList<String> teste = new ArrayList<>();
//        Scanner sc =new Scanner(System.in);
//
//        String nomeUsuario = sc.next();
//
//        teste.add(nomeUsuario);
//        teste.add(0, "nomeTeste");
//        teste.add("Fernanda");
//        teste.add("Diego");
//        teste.add("Romulo");
//        teste.add("Neymar");
//
//        System.out.println(teste.size());
//
//        teste.remove("Neymar");
//        teste.remove(0);
//
//        System.out.println(teste.size());
//
//        for (String nomes : teste){
//            System.out.println(nomes);
//        }
//
//        if (teste.contains("Fernanda")){
//            System.out.println("O nome está presente na lista!");
//
//            teste.remove("Fernanda");
//        } else {
//            System.out.println("o nome não está presente na lista! ");
//        }
//
//        for (String nomes : teste){
//            System.out.println(nomes);
//        }
//
//        System.out.println("você quer remover todos os valores da lista ?");
//        String opcaoUsuario = sc.next();
//
//        if (opcaoUsuario.equals("sim")){
//            teste.clear();
//
//            System.out.println("Lista resetada com sucesso: " + teste.size());
//
//            for (String nomes : teste){
//                System.out.println(nomes);
//            }
//        }
        Scanner sc = new Scanner(System.in);
        GerenciadorLivros gLivros = new GerenciadorLivros();
        boolean continuarRodando = true;

        do{
            System.out.println("Bem vindo ao sistema de gerenciamento de livros\n");
            System.out.println("(1) - Cadastrar Livro");
            System.out.println("(2) - Listar Livro");
            System.out.println("(3) - Atualizar Livro");
            System.out.println("(4) - Deletar Livro");
            System.out.println("(5) - Sair do programa");

            System.out.println("Informe uma opção: ");
            int opcaoUsuario = sc.nextInt();

            switch (opcaoUsuario){
                case 1:
                    sc.nextLine();
                    System.out.println("Bem vindo ao cadastro de livros");
                    System.out.println("Informe o nome do livro: ");
                    String nomeLivro = sc.nextLine();

                    gLivros.CadastrarLivro(nomeLivro);
                    break;

                case 2:
                    System.out.println("---Lista de livros---");
                    gLivros.ListarLivro();
                    break;

                case 3:
                    sc.nextLine();
                    System.out.println("Digite o nome do livro para atualizar: ");
                    String nomeAntigo = sc.nextLine();

                    System.out.println("Digite o novo nome do livro: ");
                    String nomeNovo = sc.nextLine();

                    gLivros.AtualizarLivro(nomeAntigo, nomeNovo);
                    break;

                case 4:
                    sc.nextLine();
                    System.out.println("Digite o nome do livro a ser deletado: ");
                    String livroDeletado = sc.nextLine();

                    gLivros.DeletarLivro(livroDeletado);
                    break;

                case 5:
                    System.out.println("Programa encerrado");
                    continuarRodando = false;

                default:
                    System.out.println("Opção invalida");
            }



        }while (continuarRodando);






    }
}
