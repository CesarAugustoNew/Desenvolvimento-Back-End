import java.util.Scanner;


public class exerciciosCondicionais {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Exercício 2 — Número Par ou Impar

//        System.out.println("Digite um numero");
//        int numero = scanner.nextInt();
//
//        if (numero % 2 == 0) {
//            System.out.println("Numero é par");
//        }else {
//            System.out.println("Numero é impar");
//        }

     //   Exercício 2 — Número Positivo ou Negativo

//        System.out.println("Digite um numero");
//        int numero = scanner.nextInt();
//
//        if (numero > 0) {
//            System.out.println("Numero positivo");
//        } else if (numero < 0) {
//            System.out.println("Numero negativo");
//        }else {
//            System.out.println("Numero é zero");
//        }

        // Exercício 3 — Maior de Idade

//        System.out.println("Digite a sua idade");
//        int idadeUsuario = scanner.nextInt();
//
//        if (idadeUsuario >= 18) {
//            System.out.println("Voce e maior de idade");
//        } else {
//            System.out.println("Voce e menor de idade");
//        }

        // Exercício 4 — Classificação de Nota

//        System.out.println("Digite a sua nota: ");
//        int notaAluno = scanner.nextInt();
//
//        if (notaAluno >= 7) {
//            System.out.println("Voce esta aprovado");
//        } else if (notaAluno >= 5 && notaAluno < 7) {
//            System.out.println("Voce esta de recuperação");
//        }else {
//            System.out.println("Voce esta reprovado");
//        }

        // Exercício 5 — Maior entre dois números

//        System.out.println("Digite o primeiro numero: ");
//        int numeroUm = scanner.nextInt();
//
//        System.out.println("Digite o segundo numero: ");
//        int numeroDois = scanner.nextInt();
//
//        if (numeroUm > numeroDois) {
//            System.out.printf("Numero %s > %s", numeroUm, numeroDois);
//        } else if (numeroDois > numeroUm) {
//            System.out.printf("Numero %s > %s", numeroDois, numeroUm);
//        } else {
//            System.out.println("Os numeros são iguais");
//        }

        // Exercício 6 — Menu com Switch

//        System.out.println("1. Cadastrar ");
//        System.out.println("2. Editar");
//        System.out.println("3. Excluir");
//        System.out.println("4. Sair");
//        System.out.println("Outro valor -> Opcão invalida");
//
//        int opcao = scanner.nextInt();
//
//        switch (opcao) {
//            case 1:
//                System.out.println("Bem vindo ao cadastro");
//                break;
//            case 2:
//                System.out.println("Edição");
//                break;
//            case 3 :
//                System.out.println("Excluir");
//                break;
//            case 4 :
//                System.out.println("Sair");
//                break;
//            default:
//                System.out.println("Opção inválida!");
//        }

//        Exercício 7 — Dia da Semana

//        System.out.println("Digite um dia da semana de 1 a 7: ");
//        int diaDaSemana = scanner.nextInt();
//
//        switch (diaDaSemana) {
//            case 1:
//                System.out.println("Domingo");
//                break;
//            case 2:
//                System.out.println("Segunda");
//                break;
//            case 3:
//                System.out.println("Terça");
//                break;
//            case 4:
//                System.out.println("Quarta");
//                break;
//            case 5:
//                System.out.println("Quinta");
//                break;
//            case 6:
//                System.out.println("Sexta");
//                break;
//            case 7:
//                System.out.println("Sabado");
//                break;
//            default:
//                System.out.println("Opção invalida");
//                break;
//        }



//              Exercício 8 — Calculadora Simples

//        System.out.println("Digite o primeiro numero: ");
//        int numeroUm = scanner.nextInt();
//
//        System.out.println("Digite o segundo numero: ");
//        int numeroDois = scanner.nextInt();
//
//        System.out.println("Escola um operador");
//        System.out.println("1. +");
//        System.out.println("2. -");
//        System.out.println("3. *");
//        System.out.println("4. /");
//
//        int operador = scanner.nextInt();
//
//        switch (operador) {
//            case 1:
//                int soma = numeroUm + numeroDois;
//                System.out.printf("A soma dos numeros é %s", soma);
//                break;
//            case 2 :
//                int subtracao = numeroUm - numeroDois;
//                System.out.printf("A subtracao dos numeros é %s", subtracao);
//                break;
//            case 3 :
//                int multiplicacao = numeroUm * numeroDois;
//                System.out.printf("A multiplicação dos numeros é %s", multiplicacao);
//                break;
//            case 4 :
//                double divisao = (double) numeroUm / numeroDois;
//                System.out.printf("A divisão dos numeros é %.2f", diviso);
//                break;
//            default:
//                System.out.println("Opcao invalida");
//                break;
//        }

        // Exercício 9 — Classificação de Temperatura

//        System.out.println("Digite uma tempetarura");
//        int tempetaruta = scanner.nextInt();
//
//        if (tempetaruta >= 35) {
//            System.out.println("Temperatura muito quente");
//        } else if (tempetaruta >= 25 && tempetaruta < 35) {
//            System.out.println("Temperatura agradavel");
//        } else if (tempetaruta >= 15 && tempetaruta < 25) {
//            System.out.println("Temperatura frio");
//        }else {
//            System.out.println("Muito frio");
//        }

//        System.out.println("Digite seu usuario: ");
//        String usuario = scanner.nextLine();
//
//        System.out.println("Digite a sua senha: ");
//        int senha = scanner.nextInt();
//
//        String usuarioCorreto = "admin";
//        int senhaCorreta = 1234;
//
//        if (!usuario.equals(usuarioCorreto) || senha != senhaCorreta) {
//            System.out.println("Usuario ou senha incorreto.");
//        }else{
//            System.out.println("Bem vindo ao sistema.");
//        }

        // Desafio 1 — Múltiplas Condições (Pode Dirigir)

//        System.out.println("Digite a sua idade");
//        int idade = scanner.nextInt();
//
//        System.out.println("Voce tem carteira ? Responda com 1 para sim 2 para nao");
//        int carteira = scanner.nextInt();
//
//        if (idade < 18 || carteira == 2) {
//            System.out.println("Voce não pode dirigir.");
//        }else {
//            System.out.println("Voce pode dirigir");
//        }



    }

}

