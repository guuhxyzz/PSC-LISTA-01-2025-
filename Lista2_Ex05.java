import java.util.Scanner;

public class Lista2_Ex05 {
    public static void main(String[] args) {
        int qntdAlemanha, qntdPortugal, qntdItalia;
        double precoAlemanha, precoPortugal, precoItalia, precoTotal = 0;
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Viagem Eurotrip");

            System.out.print("Digite o preço da viagem para a Alemanha: ");
            precoAlemanha = entrada.nextDouble();
            System.out.print("Quantas pessoas vão para Alemanha: ");
            qntdAlemanha = entrada.nextInt();
            System.out.print("Digite o preço da viagem para a Portugal: ");
            precoPortugal = entrada.nextDouble();
            System.out.print("Quantas pessoas vão para Portugal: ");
            qntdPortugal = entrada.nextInt();
            System.out.print("Digite o preço da viagem para a Itália: ");
            precoItalia = entrada.nextDouble();
            System.out.print("Quantas pessoas vão para Itália: ");
            qntdItalia = entrada.nextInt();
        }
        double totalAlemanha = qntdAlemanha * precoAlemanha;
        System.out.printf("A viagem de Alemanha, vão %d pessoas, e o total da viagem vai ser: R$%.2f\n", qntdAlemanha, totalAlemanha);
        double totalPortugal = qntdPortugal * precoPortugal;
        System.out.printf("A viagem de Portugal, vão %d pessoas, e o total da viagem vai ser: R$%.2f\n", qntdPortugal, totalPortugal);
        double totalItalia = qntdItalia * precoItalia;
        System.out.printf("A viagem de Itália, vão %d pessoas, e o total da viagem vai ser: R$%.2f\n", qntdItalia, totalItalia);
        precoTotal = totalAlemanha + totalPortugal + totalItalia;
        System.out.printf("A viagem total, vai ser: R$%.2f", precoTotal);
        
    }
}
