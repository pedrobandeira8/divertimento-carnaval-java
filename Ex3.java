import java.util.Scanner;

public class Ex3 {
    public static void executar(Scanner sc) {

        System.out.println("Olá para armazenar seus dados pessoas preciso que digite o seu Nome");
        String nome = sc.next();

        System.out.println("Agora a idade: ");
        int idade = sc.nextInt();

        System.out.println("Olá, meu nome é " + nome + " e eu tenho " + idade + " anos");

    }
}
