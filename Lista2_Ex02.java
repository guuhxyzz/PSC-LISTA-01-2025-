
import java.util.Scanner;

public class Lista2_Ex02 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Digite um número: ");
            int n1 = entrada.nextInt();
            System.out.print("Digite outro número: ");
            int n2 = entrada.nextInt();
            // Contas 
            System.out.printf("Soma: %d + %d = %d%n", n1, n2, n1 + n2);
            System.out.printf("Subtração: %d - %d = %d%n", n1, n2, n1 - n2);
            System.out.printf("Multiplicação: %d x %d = %d%n", n1, n2, n1 * n2);
            if (n2 == 0){
                System.out.println("O número zero não é divisivel");
            } else {
                System.out.printf("Divisão: %d / %d = %d%n", n1, n2, n1 / n2);
            }
        }
    }
}
