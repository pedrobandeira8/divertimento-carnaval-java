import java.util.Scanner;

public class Ex7 {
    public static void executar(Scanner sc){

        System.out.println("Para obter o perimetro, primeiro digite sua base: ");
        double base = sc.nextDouble();

        System.out.println("Agora digite sua altura: ");
        double altura = sc.nextDouble();

        double formulaPerimetro = (base + altura) * 2;

        System.out.printf("O perimetro do retangula é %.2fcm%n", formulaPerimetro);
        System.out.println("A formula utilizada foi (base + altura) * 2");
    }
}
