import java.util.Scanner;

public class Questao3 {
    // Número bissexto
    public static void main(String[] args) {
        int ano = new Scanner(System.in).nextInt();

//        if ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))) {
//            System.out.println("Ano bissexto!");
//        } else {
//            System.out.println("Não é bissexto!");
//        }

        boolean bissexto = ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0)));
        System.out.println(bissexto ? "Ano bissexto!" : "Não é bissexto!");

        // multiplo de 4
        // nao sao multiplos de 100
        // exceto multiplos de 400
    }
}
