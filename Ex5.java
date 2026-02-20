import java.util.Scanner;

public class Ex5 {
    public static void executar(Scanner sc) {

        System.out.println("Digite a nota 1: ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a nota 2: ");
        double nota2 = sc.nextDouble();

        System.out.println("Digite a nota 3: ");
        double nota3 = sc.nextDouble();

        double somaNota = (nota1 + nota2 + nota3);
        double somaAritmetica = somaNota / 3;
//        para nao aparecer numeros infinitos, ultilizei string.format %.2f para poder dimunuir o numeros de casas decimais
        String formatado = String.format("A média aritmética do aluno foi :%.2f", somaAritmetica);

        System.out.println(formatado);
    }
}
