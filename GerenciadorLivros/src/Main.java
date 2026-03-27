import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GerenciadorLivros gLivros = new GerenciadorLivros();
        boolean continuarRodando = true;

        do {
            System.out.println("\n=== Sistema de Gerenciamento de Livros ===\n");
            System.out.println("(1) - Cadastrar Livro");
            System.out.println("(2) - Listar Livro");
            System.out.println("(3) - Atualizar Livro");
            System.out.println("(4) - Deletar Livro");
            System.out.println("(5) - Sair do programa");
            System.out.print("\nInforme uma opção: ");

            int opcaoUsuario = sc.nextInt();
            sc.nextLine(); // limpa buffer

            switch (opcaoUsuario) {

                case 1:
                    System.out.println("\n--- Cadastro de Livro ---");
                    System.out.print("Informe o nome do livro: ");
                    String nomeLivro = sc.nextLine();

                    gLivros.cadastrarLivro(nomeLivro);
                    break;

                case 2:
                    System.out.println("\n--- Lista de livros ---");
                    gLivros.listarLivro();
                    break;

                case 3:
                    System.out.println("\n--- Atualizar Livro ---");
                    System.out.print("Digite o nome do livro para atualizar: ");
                    String nomeAntigo = sc.nextLine();

                    System.out.print("Digite o novo nome do livro: ");
                    String nomeNovo = sc.nextLine();

                    gLivros.atualizarLivro(nomeAntigo, nomeNovo);
                    break;

                case 4:
                    System.out.println("\n--- Deletar Livro ---");
                    System.out.print("Digite o nome do livro a ser deletado: ");
                    String livroDeletado = sc.nextLine();

                    gLivros.deletarLivro(livroDeletado);
                    break;

                case 5:
                    System.out.println("\nPrograma encerrado");
                    continuarRodando = false;
                    break;

                default:
                    System.out.println("\nOpção inválida");
            }

            // separador visual (UX)
            System.out.println("\n========================\n");

        } while (continuarRodando);

        sc.close();
    }
}