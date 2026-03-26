import java.util.Scanner;

public class GerenciadorNomes {

        // CRUD ->
        // CREATE = CRIAÇÃO = METODOS = AÇÕES = RETORNOS
        // READ = LEITURA = METODOS = AÇÕES = RETORNOS
        // UPDATE = ATUALIZAR = METODOS = AÇÕES = RETORNOS
        //DELETE = DELETAR = METODOS = AÇÕES = RETORNOS
    String[] nomes = new String[3];

    int pessoas = 0;

    public void CadastrarUsuario() {
        Scanner sc = new Scanner(System.in);

        System.out.println("quantos usuários você quer cadastrar? ");
        int quantidadeNomes = sc.nextInt();

        nomes = new String[quantidadeNomes];


        for (int i = 0; i < nomes.length; i++) {
            System.out.printf("\ninforme o %s nome: ", i+1);

            String nomeInformado = sc.next();

            nomes[i] = nomeInformado;
        }

        System.out.println("Usuário cadastrado com sucesso!");
    }

    public void ListarUsuarios() {

        for (String nome : nomes) {
            if (nome != null)
                System.out.println(nome);
        }
    }

}
