public class aulaTresOperadores {
    public static void main (String[] args) {

        //Operadores -> Comparacao

        int a = 10 + 5 * 2 - (2 * 2) / 2;
        double b = 5 - 4 / 2 + (16 * 0.5);

        System.out.println(a > b); // true
        System.out.println(a < b); // false
        System.out.println(a == b); // false
        System.out.println(a != b); // true
        System.out.println(a >= b); // true
        System.out.println(a <= b); // false


        System.out.println("Comparação de String");

        String valor1 = "ab";
        String valor2 = "ac";

        System.out.println(valor1.equals(valor2));












    }
}
