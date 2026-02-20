import java.util.Scanner;

public class Ex4 {
    public static void executar(Scanner sc) {
        System.out.println("Digite a temperatura em C: ");
        int celsius = sc.nextInt();
        int Formula_F = ((celsius*9)/5) + 32;
        System.out.println("A temperatura de " + celsius + "C em F é " + Formula_F + "F ");
    }
}
