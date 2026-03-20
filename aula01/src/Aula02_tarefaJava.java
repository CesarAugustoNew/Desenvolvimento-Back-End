import java.util.Scanner;

public class Aula02_tarefaJava {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo numero: ");
        int num2 = scanner.nextInt();


        int soma = num1 + num2;
        int sub = num1 - num2;
        int multi = num1 * num2;
        int div = num1 / num2;


        System.out.println("A soma é: " + soma);
        System.out.println("A Subtração é: " + sub);
        System.out.println("A Multiplicação é: " + multi);
        System.out.println("A Divisão é: " + div);




        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.printf("A sua media é %.2f", media);


        System.out.print("Digite seu peso: ");
        double pesoPessoa = scanner.nextDouble();

        System.out.print("Digite sua Altura: ");
        double alturaPessoa = scanner.nextDouble();

        double imc = pesoPessoa / (alturaPessoa * alturaPessoa);

        System.out.printf("O seu imc é: %.2f", imc);

    }





}
