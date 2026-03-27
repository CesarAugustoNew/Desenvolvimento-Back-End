import java.util.ArrayList;

public class GerenciadorLivros {

    ArrayList<String> listaLivros = new ArrayList<>();

    public void cadastrarLivro(String nomeLivro) {
        try {
            // verificar duplicado sem contains
            for (String livro : listaLivros) {
                if (livro.equals(nomeLivro)) {
                    System.out.println("\nEsse livro já está cadastrado");
                    return;
                }
            }

            listaLivros.add(nomeLivro);
            System.out.printf("\nO livro: %s foi cadastrado com sucesso\n", nomeLivro);

        } catch (Exception e) {
            System.out.println("\nErro ao cadastrar livro: " + e);
        }
    }

    public void listarLivro() {
        try {
            // verificar se está vazia sem isEmpty
            if (listaLivros.size() == 0) {
                System.out.println("\nLista de livros vazia");
                return;
            }

            for (String livro : listaLivros) {
                System.out.println(livro);
            }

        } catch (Exception e) {
            System.out.println("\nErro ao listar livros: " + e);
        }
    }

    public void atualizarLivro(String nomeAntigo, String nomeNovo) {
        try {
            boolean encontrado = false;

            for (int i = 0; i < listaLivros.size(); i++) {
                if (listaLivros.get(i).equals(nomeAntigo)) {
                    listaLivros.set(i, nomeNovo);
                    encontrado = true;
                    System.out.println("\nLivro atualizado com sucesso");
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("\nLivro não encontrado");
            }

        } catch (Exception e) {
            System.out.println("\nErro ao atualizar livro: " + e);
        }
    }

    public void deletarLivro(String deletarLivro) {
        try {
            boolean removido = false;

            for (int i = 0; i < listaLivros.size(); i++) {
                if (listaLivros.get(i).equals(deletarLivro)) {
                    listaLivros.remove(i);
                    removido = true;
                    System.out.println("\nLivro deletado com sucesso");
                    break;
                }
            }

            if (!removido) {
                System.out.println("\nLivro não encontrado");
            }

        } catch (Exception e) {
            System.out.println("\nErro ao deletar livro: " + e);
        }
    }
}