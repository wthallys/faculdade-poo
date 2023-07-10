import java.util.Arrays;
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

//        if (a > b && b > c) {
//            System.out.printf("%d %d %d", a, b, c);
//        } else if (a > c && c > b) {
//            System.out.printf("%d %d %d", a, c, b);
//        } else if (b > a && a > c) {
//            System.out.printf("%d %d %d", b, a, c);
//        } else if (b > c && c > a) {
//            System.out.printf("%d %d %d", b, c, a);
//        } else if (c > b && b > a) {
//            System.out.printf("%d %d %d", b, a, c);
//        } else if (c > a && a > b) {
//            System.out.printf("%d %d %d", c, a, b);
//        }

        int[] numbers = {a, b, c};
        Arrays.sort(numbers);
        System.out.printf("%d %d %d", numbers[2], numbers[1], numbers[0]);
    }
}
