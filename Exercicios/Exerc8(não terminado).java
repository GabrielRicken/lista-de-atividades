package Exer1;

import java.util.Scanner;

public class Exerc8 {
    public static void main(String[] args) {
        try (Scanner input =  new Scanner(System.in)) {
            double salario;
            double aluguel;
            double internet;
            double agua;
            double luz;
            double trasnporte;
            System.out.println("Digite o valor do aluguel: ");
            aluguel = input.nextDouble();
            System.out.println("Digite o valor da internet: ");
            internet = input.nextDouble();
            System.out.println("Digite o valor da agua: ");
            agua = input.nextDouble();
            System.out.println("Digite o valor da luz: ");
            luz = input.nextDouble();
            System.out.println("Digite o valor do trasnporte: ");
            trasnporte = input.nextDouble();
            salario = (aluguel + internet + agua + luz + trasnporte) * 2;
            System.out.println("O salario ideal é: " + salario);
             
        }
        
    }
    
}