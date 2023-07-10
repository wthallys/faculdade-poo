import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ladoA = scanner.nextInt();
        int ladoB = scanner.nextInt();
        int ladoC = scanner.nextInt();

        if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) {
            if ( ladoA == ladoB && ladoA == ladoC){
                System.out.println("Triângulo equilátero!");
            } else if (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) {
                System.out.println("Triângulo isósceles!");
            } else {
                System.out.println("Triângulo escaleno!");
            }
        } else {
            System.out.println("Não é triangulo!");
        }
    }
}
/*
* Crie um programa capaz de ler três valores para os lados de um triângulo e verificar se os lados fornecidos formam realmente um triângulo. Se esta condição for verdadeira, deve ser indicado qual tipo de triângulo foi formado: isósceles, escaleno ou equilátero. Sabendo que:
Um triângulo é chamado de equilátero se todos os lados possuem a mesma medida. Um triângulo é chamado de isósceles se dois lados possuem a mesma medida. Um triângulo é chamado de escaleno se todos os lados possuem medidas diferentes.

* */