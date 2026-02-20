import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// Cada exercício tem seu próprio Scanner para simplificar a lista.
// Não fechei o Scanner para não fechar o System.in entre exercícios.
        System.out.println("=== EX1 ===");
        Ex1.executar(sc);

        System.out.println("\n=== EX2 ===");
        Ex2.executar(sc);

        System.out.println("\n=== EX3 ===");
        Ex3.executar(sc);

        System.out.println("\n=== EX4 ===");
        Ex4.executar(sc);

        System.out.println("\n=== EX5 ===");
        Ex5.executar(sc);

        System.out.println("\n=== EX6 ===");
        Ex6.executar(sc);

        System.out.println("\n=== EX7 ===");
        Ex7.executar(sc);

        System.out.println("\n=== EX8 ===");
        Ex8.executar();

        System.out.println("\n=== EX9 ===");
        Ex9.executar();

        System.out.println("\n=== EX10 ===");
        Ex10.executar();
    }
}