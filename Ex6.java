import java.util.Scanner;
// criar classe
public class Ex6 {
   public static void executar(Scanner sc) {

       System.out.println("Digite o valor do produto que terá 15% desconto: ");
       double  valorProduto = sc.nextDouble();

       double desconto = valorProduto * 0.15;
       double valorFinal = valorProduto - desconto;
//     para nao aparecer numeros infinitos, ultilizei printf e %.2f%n, variavel.( o %.2f substial a variavel que vem dps da ,)
       System.out.printf("O valor final do produto com 15 porcento de desconto é: %.2fR$%n", valorFinal);
    }
}
