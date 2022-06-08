package Exer1;

import java.util.Scanner;

public class Exer6 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double Juros;
            double deposito;
            double rendimento;
            System.out.println("Digite o valor do deposito: ");
            deposito = input.nextInt();
            Juros = (deposito * 0.007);
            rendimento = (deposito + Juros);
            System.out.println("O valor de rendimento foi de: " + rendimento);

        }

    }

}
