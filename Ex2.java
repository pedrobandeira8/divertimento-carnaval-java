import java.util.Scanner;

public class Ex2 {
    public static void executar(Scanner sc) {
        System.out.println("calcule a area do circulo, digite o valor do raio: formula(3,14 * raiorˆ2) ");

        double raio = sc.nextDouble();

        double raio_potencia = Math.pow (raio, 2);
        double area = 3.14 * raio_potencia;

        System.out.println("A área do circulo é "+ area + " cm2");
// fechar scanner(n fechei porque esta no main
//        sc.close();
    }
}
