package Exer1;

import java.util.Scanner;
public class Exer1 {
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
        int numero1;
        int numero2;
        int soma;
        System.out.println( "Digite o primeiro numero");
        numero1 = input.nextInt();
        System.out.println( "Digite o segundo numero");
        numero2 = input.nextInt();
        soma = numero1 + numero2;
        System.out.println("O resultado é " + soma);
    }
    }  
}
