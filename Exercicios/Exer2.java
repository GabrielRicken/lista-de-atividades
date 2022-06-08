package Exer2;

import java.util.Scanner;
public class Exer2 {
 public static void main(String[] args) {
   try (Scanner input = new Scanner(System.in)) {
     int numero1;
     int numero2;
     int soma, mult, sub;
     double div;
     System.out.println("Digite o primeiro numero: ");
     numero1 = input.nextInt();
     System.out.println("Digite o segundo numero: ");
     numero2 = input.nextInt();
     soma = numero1 + numero2;
     mult = numero1 * numero2;
     sub = numero1 - numero2;
     div = numero1 / numero2;
     System.out.println("A soma é " + soma);
     System.out.println("A subtracao é " + sub);
     System.out.println("A multiplicacao é " + mult);
     System.out.println("A divisao é " + div);
    }
    }
}
