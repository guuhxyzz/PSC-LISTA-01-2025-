
import java.util.Scanner;

public class Lista2_Ex04 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            double valorGasolina, qntdGasolina, valorPago, total;
            String litro_valorPago;
            System.out.print("Digite o preço da gasolina: ");
            valorGasolina = entrada.nextDouble();
            System.out.println("Me fale quantos litros você quer ou o valor que você quer abastecer:\n(L para litros, V para valor que você quer abastecer)");
            litro_valorPago = entrada.next();
            switch (litro_valorPago.toUpperCase()) {
                case "L" -> {
                    System.out.print("Quantos litros você vai abastecer: ");
                    qntdGasolina = entrada.nextDouble();
                    total = valorGasolina * qntdGasolina;
                    System.out.printf("Você irá pagar: %.2f", total);
                }
                case "V" -> {
                    System.out.print("Quanto que você irá pagar: ");
                    valorPago = entrada.nextDouble();
                    double totalLitros = valorPago / valorGasolina;
                    System.out.printf("Você vai abastecer %.2f litros ", totalLitros);
                }
                default -> {
                }
            }
        }
    }
}
