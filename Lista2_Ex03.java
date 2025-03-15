import java.util.Scanner;

public class Lista2_Ex03 {
    public static void main(String[] args) {
        double soma = 0;
        try (Scanner entrada = new Scanner(System.in)) {
            for (int i = 0; i < 4; i++) {
                System.out.print("Digite as notas do aluno: ");
                double addNota = entrada.nextDouble();
                soma += addNota;
            }
        }
        double media = soma / 4;
        System.out.printf("A média do aluno é: %.2f", media);
    }
}