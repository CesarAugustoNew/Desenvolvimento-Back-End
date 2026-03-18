import java.util.Scanner;

public class aulaDoisScanner {

    public static void main(String[] args) {

        //instanciando a funcao Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ola, informe o seu nome: ");
        String nomeUsuario = scanner.nextLine();

        System.out.print("Informe agora a sua idade: ");
        int idadeUsuario = scanner.nextInt();

        System.out.print("Qual é a sua altura ? ");
        double alturaUsuario = scanner.nextDouble();

        System.out.println("\nSeja bem vindo ao sistema! \nUsúario: " + nomeUsuario + "\nIdade: " + idadeUsuario + "\nAltura: " + alturaUsuario);

        scanner.close();































    }
}
