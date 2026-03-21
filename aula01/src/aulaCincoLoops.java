import java.util.Scanner;


public class aulaCincoLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        while (true) {
//            System.out.printf("Loop infinito");
//        }

//        do{
//            // rodar pelo menos uma vez
//            // bloco de codigo
//        } while (true);

//        int contador = 0;
//        double media = 0;
//        double soma = 0;

//        while (contador < 4){
//            System.out.printf("informe a %s nota: ", contador+1);
//            double notaUsuario = sc.nextDouble();

//            soma = notaUsuario + soma;
//            contador++;
//        }
//        media = soma / contador;
//        System.out.println("A média do aluno é de: " + media);

//        if (media >= 7){
//            System.out.println("Aprovado");
//        } else if (media >= 4 && media < 7) {
//            System.out.println("Recuperação");
//        }else {
//            System.out.println("Reprovado");
//        }




//        int incremento = 0;
//        do{
//            System.out.println(incremento);
//            incremento++;
//        } while (incremento < 4);

//        for (int i =0; i <= 5; i++){
//            System.out.println(i);
//        }
        System.out.printf("Digite um valor a ser multiplicado: ");
        int numeroMultiplicado = sc.nextInt();


        for (int i = 1; i <= 10; i++) {
            System.out.println(numeroMultiplicado + " x " + i + " = " + numeroMultiplicado*i );
        }

    }
}