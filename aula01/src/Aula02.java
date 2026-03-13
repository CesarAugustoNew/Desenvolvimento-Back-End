import java.util.Scanner;

public class Aula02 {

    public static void main(String[] args) {

        //instanciando a funcao Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ola, informe o seu nome: ");
        String nomeUsuario = scanner.nextLine();

        System.out.println("Seja bem vindo ao sistema: " + nomeUsuario);

    }
}
