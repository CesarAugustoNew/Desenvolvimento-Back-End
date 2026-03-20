import java.util.Scanner;


public class aulaQuatro {
    public static void main(String[] args) {

        //Condicionais

        int idade = 22;
        boolean documento = false;

        if (idade >= 18 && documento == true) {
            System.out.println("Pode entrar na balada" );
        }else {
            System.out.println("Não pode entra na balada");
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero");
        int numeroUsuario = scanner.nextInt();


        // Processamento de dados

        if (numeroUsuario > 0) {
            System.out.println("Numero positivo");
        } else if (numeroUsuario < 0) {
            System.out.println("Numero negativo");
        }else {
            System.out.println("Numero zero");
        }

       //  IMC

        System.out.print("Digite seu peso: ");
        double pesoPessoa = scanner.nextDouble();

        System.out.print("Digite a sua altura: ");
        double alturaPessoa = scanner.nextDouble();

        double imc = pesoPessoa / (alturaPessoa * alturaPessoa);

        if (imc <= 18.5 ) {
            System.out.print("Magreza");
        } else if (imc > 18.5 && imc <= 24.9) {
            System.out.println("Saudável");
        } else if (imc >= 25 && imc <= 29.9 ) {
            System.out.println("Sobrepeso");
        } else if (imc >= 30 && imc <= 34.9 ) {
            System.out.println("Obesidade grau um");
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Obesidade grau dois");
        }else if (imc >= 40){
            System.out.println("Obesidade grau tres");
        }else {
            System.out.println("Ocorreu um erro/tente novamento mais tarde");
        }


    }
}
