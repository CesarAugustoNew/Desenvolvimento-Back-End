import java.util.Scanner;


public class aulaCinco_loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        while (true) {
//            System.out.printf("Loop infinito");
//        }

//        do{
//            // rodar pelo menos uma vez
//            // bloco de codigo
//        } while (true);

        int contador = 0;
        double media = 0;
        double soma = 0;

        while (contador < 4){
            System.out.printf("informe a %s nota: ", contador+1);
            double notaUsuario = sc.nextDouble();

            soma = notaUsuario + soma;
            contador++;
        }
        media = soma / contador;
        System.out.printf("A média do aluno é de: " + media);

        if (media >= 7){
            System.out.println("Aprovado");
        } else if (media >= 4 && media <= 6) {
            System.out.println("Recuperação");
        }else {
            System.out.println("Reprovado");
        }




    }
}
