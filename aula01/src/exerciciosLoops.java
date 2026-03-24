import java.util.Scanner;

public class exerciciosLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1 Exiba os números de 1 até 10 utilizando for.

    //    for (int i = 0; i <= 10; i++) {
    //        System.out.println(i);
    //    }

        // 2  Contagem regressiva (while)

//        int i = 10;
//        while (i >= 0) {
//            System.out.println(i);
//            i--;
//        }

        // 3 Exiba os números pares de 0 até 20.

    //    for (int i = 0; i <= 20; i++) {
    //        if (i % 2 == 0) {
    //            System.out.println(i);
    //        }
    //    }


        // 4 Some os números de 1 até 100

//        int soma = 0;
//        for (int i = 1; i <= 100; i++) {
//            soma = soma + i;
//        }
//        System.out.println("Soma total: " + soma);

        // Exercício 5 — Tabuada
//        System.out.printf("Digite um valor para ver a tabuada: ");
//        int numeroMultiplicado = sc.nextInt();
//
//
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(numeroMultiplicado + " x " + i + " = " + numeroMultiplicado*i );
//        }

        //  Exercício 6 — Contador com do-while
//        int contador = 0;
//
//        do {
//            System.out.println(contador + 1);
//            contador++;
//        } while (contador < 5);

        // 7 Exercício 7 — Soma de pares
//        int soma = 0;
//        for (int i = 0; i <= 50; i++){
//            if (i % 2 == 0) {
//                soma = soma + i;
//            }
//            System.out.println(soma);
//        }

//        System.out.println("Digite o numero a ser fatorado: ");
//        int fatorial = sc.nextInt();
//
//        int total = 1;
//
//        for (int i = 1; i <= fatorial; i++) {
//            total *= i;
//        }
//
//        System.out.println("O fatorial é: " + total);


        // Exercício 9 — Média de valores
//        double soma = 0;
//
//        for (int i = 1; i <= 10; i++){
//            System.out.println("Digite 10 numeros para calcular a media deles: ");
//            double numerosDitados = sc.nextDouble();
//            soma = soma + numerosDitados;
//
//        }
//            double media = soma / 10;
//
//            System.out.println("A media dos 10 numeros digitados é: " + media);


       //  Exercício 10 — Múltiplos de 3

//        for (int i = 0; i <= 50; i++) {
//            if (i % 3 == 0) {
//                System.out.println(i);
//            }
//        }

//        Crie um programa que:
//        1. Continue rodando enquanto o usuário digitar um número diferente de 0.
//        2. Quando digitar 0 → o programa para.
//
//        boolean continua = true;
//        while (continua) {
//            System.out.println("Esse programa vai executar ate voce digitar zero");
//            int numero = sc.nextInt();
//            if (numero == 0){
//                continua = false;
//            }
//        }

//        Desafio 2 — Soma até parar
//        Crie um programa que:
//
//        1. Continue pedindo números.
//        2. Some todos os valores.
//        3. Pare quando o usuário digitar 0.
//        4. Mostre o total

//        boolean verdade = true;
//        int soma = 0;
//
//        while (verdade) {
//
//            System.out.println("Os numeros digitados serao somados ate a digitacao do 0");
//            int numero = sc.nextInt();
//
//            soma = soma + numero;
//            System.out.println(soma);
//        }



//          Desafio 3 — Menu com repetição

//        boolean menu = true;
//
//        while (menu) {
//            System.out.println("1. Ola");
//            System.out.println("2. Digitar numero");
//            System.out.println("0. Sair");
//
//            int escolha = sc.nextInt();
//
//            if (escolha == 1) {
//                System.out.println("Olá!");
//            } else if (escolha == 2) {
//                System.out.println("Digite um numero: ");
//                int numero = sc.nextInt();
//                System.out.println("Você digitou: " + numero);
//            } else if (escolha == 0) {
//                menu = false;
//            }
//        }
      //   Desafio Final — Jogo de Adivinhação
//        boolean acertou = true;
//        int tentativasUsuario = 0;
//        final int numeroSorteado = 7;

//        while (acertou) {
//            System.out.println("Tente adivinhar o numero para encerrar o programa: ");
//            int tentativa = sc.nextInt();
//
//            if (tentativa == numeroSorteado) {
//                System.out.println("Acertou");
//                acertou = false;
//            }else{
//                tentativasUsuario++;
//                System.out.println("tentativas usadas = " +tentativasUsuario);
//            }
//
//
//
//        }

    }

}
