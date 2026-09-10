package org.example;
 /*
 Exercício Aula 10/09/2026 - Regra Investimentos

  */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorInvestido = scanner.nextDouble();
        
        if(valorInvestido <= 10000) {
            System.out.println("Bronze");
        } else if(valorInvestido <= 50000) {
            System.out.println("Prata");
        } else if(valorInvestido <= 100000) {
            System.out.println("Ouro");
        } else {
            System.out.println("Platinum");
        }
    }
}