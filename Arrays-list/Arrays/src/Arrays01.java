import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {
        //array - posições fixas (definir)
        //array -> tipos unicos (homogenios)
        //arrays -> sempre começarão com indice 0
        // arrays -> tipo[] nomeGenerico = new tipo[tamanho];

        String[] cestaFrutas = new String[5];
//        try {
//            System.out.println(cestaFrutas[5]);
//        }catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("erro" + e);
//        }

        cestaFrutas[0] = "Abacate";
        cestaFrutas[1] = "Tomate";
        cestaFrutas[2] = "Morango";
        cestaFrutas[3] = "Goiaba";
        cestaFrutas[4] = "Lichia";

//        System.out.println(cestaFrutas.length);

        //maneira para visualização dos dados
        for (int i = 0; i < cestaFrutas.length; i++) {
            System.out.println(cestaFrutas[i]);
        }

        //outro modo
        for(String frutas: cestaFrutas){
            System.out.println(frutas);
        }


        String[] cestaFrutas2 = {"banana", "maçã", "mamão", "uma"};

        System.out.println(cestaFrutas2[0]);


        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um valor para armazenar os nomes: ");
        int valorInformado = sc.nextInt();

        String[] nomes = new String[valorInformado];

        for (int i = 0; i < nomes.length; i++) {
            System.out.printf("\ninforme o %s nome: ", i+1);

            String nomeInformado = sc.next();

            nomes[i] = nomeInformado;
        }

        for (String nome : nomes) {
            System.out.println(nome);
        }

        // criar duas listas
        // 1 lista de nomes
        // 2 listas de idade
        // exibir o nome e a idade da pessoa (juntos)

        String[] nomesP = {"Cesar", "Carlos", "Diego", "Gustavo", "Luiz", "Thiago"};

        int[] idade = {20, 18, 21, 22, 25, 26};

        for (int i = 0; i < 5; i++){
            System.out.printf("\n%s nome : %s e idade: %s", i+1, nomesP[i], idade[i]);
        }













    }
}
