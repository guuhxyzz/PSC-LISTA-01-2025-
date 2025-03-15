import java.util.Scanner;

public class Lista2_Ex01 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Digite um número: ");
            int num = entrada.nextInt();
            System.out.println("Número: " + num);
        }
    }
}
