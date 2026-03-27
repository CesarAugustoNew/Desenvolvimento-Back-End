import java.util.ArrayList;

public class GerenciadorLivros {

    ArrayList<String> listaLivros = new ArrayList<>();

    public void cadastrarLivro(String nomeLivro){

        try {

            if (listaLivros.contains(nomeLivro)) {
                System.out.println("Esse livro já está cadastrado");
                return;
            }

            listaLivros.add(nomeLivro);
            System.out.printf("\nO livro: %s foi cadastrado com sucesso", nomeLivro);

        } catch (Exception e) {
            System.out.println("Erro ao cadastrar livro: " + e);
        }
    }

    public void listarLivro(){
        try {

            for (String livro : listaLivros) {
                if (listaLivros != null) {
                    System.out.println(livro);
                }else {
                    System.out.println("Lista de livro vazia");
                }
            }

        } catch (Exception e) {
            System.out.println("Erro ao listar livros" + e);
        }
    }

    public void atualizarLivro(String nomeAntigo, String nomeNovo){
        try {

            int indice = listaLivros.indexOf(nomeAntigo);

            if (indice != -1) {
                listaLivros.set(indice, nomeNovo);
                System.out.println("Livro atualizado com sucesso");
            } else {
                System.out.println("Livro não encontrado");
            }

        } catch (Exception e) {
            System.out.println("Erro ao atualizar livro: " + e);
        }
    }

    public void deletarLivro(String deletarLivro){
        try {

            if (listaLivros.remove(deletarLivro)) {
                System.out.println("Livro deletado com sucesso");
            } else {
                System.out.println("Livro não encontrado");
            }

        } catch (Exception e) {
            System.out.println("Livro não encontrado" + e);
        }
    }





}
