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
        System.out.println("Informe o nome do usuario");

        String nomeInformado = sc.next();

        if (pessoas < nomes.length) {
            nomes[pessoas] = nomeInformado;
            pessoas++;
            System.out.println("Usuario cadastrado");
        } else {
            System.out.println("Lista cheia");
        }

    }

    public void ListarUsuarios() {

        for (String nome : nomes) {
            if (nome != null)
                System.out.println(nome);
        }
    }

}
