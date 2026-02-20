public class Ex10 {
    public static void executar() {
        System.out.println("Explicação: da erro porque o valor é double(1.0), o codigo tenta guardar isso em int(novoValor)e o Java nao converte automaticamente de double pra int pq pode perder casas decimais.");

        // Código original (daria erro):
        // double valor = 10;
        // int novoValor = valor % 3;  // erro: possible lossy conversion from double to int
        // System.out.println(novoValor);

        // Versão que roda no Main:
        double valor = 10;
        double novoValor = valor % 3;
        System.out.println(novoValor);
    }
}
