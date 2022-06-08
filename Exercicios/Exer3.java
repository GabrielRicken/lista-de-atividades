package Exer3;

import java.util.Scanner;

public class Exer3 {
   public static void main(String[] args) {
      try (Scanner input = new Scanner(System.in)) {
         float combust;
         float distan;
         float soma;
         System.out.println("Digite a distancia percorrida: ");
         distan = input.nextInt();
         System.out.println("Quantos km por litro faz seu carro: ");
         combust = input.nextInt();
         soma = distan / combust;
         System.out.println("O consumo de gasolina é: " + soma);
      }
   }

}
