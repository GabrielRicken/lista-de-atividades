package Exer1;

import java.util.Scanner;

public class Exerc7 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
          double preco;
          double acrescimo;
          double valor_venda;
        System.out.println("Digite o valor do preco do produto: ");
        preco = input.nextDouble();
        System.out.println("Digite o valor do acrecimo em % : "); 
        acrescimo = input.nextDouble();
        valor_venda = (preco * acrescimo)/100 + preco;
        System.out.println("O valor de valor de venda foi: " + valor_venda);
        }
    }
    
}
