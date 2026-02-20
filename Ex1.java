
//importar a biblioteca de print
import java.util.Scanner;

//criar a classe
public class Ex1 {
    public static void executar(Scanner sc) {
//        pedir primeiro numero
        System.out.println("Digite a soma 1:");
        int num1 = sc.nextInt();

//        pedir segundo numero
        System.out.println("Digite a soma 1:");
        int num2 = sc.nextInt();

//        calcula a soma
        int soma = num1 + num2;

        System.out.println("A soma de "+num1 + " + "+num2+ " é " + soma );

//        ---fechar o scanner-- importante
//        sc.close();
    }
}
