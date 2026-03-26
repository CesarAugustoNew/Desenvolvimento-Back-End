import java.util.Scanner;

public class teste {

    public static void main(String[] args) {
        GerenciadorNomes gnomes = new GerenciadorNomes();



        Scanner sc = new Scanner(System.in);
        boolean continuarRodando = true;
        int opcaoUsuario;

        do {
            System.out.println("---MENU---");
            System.out.println("1. Opção 1: Cadastrar Usuarios");
            System.out.println("2. Opção 2: Listar Usuarios");
            System.out.println("0. Opção 0: Encerrar Programa");

            opcaoUsuario = sc.nextInt();

            switch (opcaoUsuario) {
                case 1:
                    gnomes.CadastrarUsuario();
                    break;
                case 2:
                    gnomes.ListarUsuarios();
                    System.out.println(gnomes.nomes);
                    break;
                case 0:
                    System.out.println("Desligando programa");
                    continuarRodando = false;
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }

        }while (continuarRodando);

        sc.close();

    }
}

