package org.example;
 /*
Exercício Aula 11/09/2026 - Soma de Vendas do Dia

*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o valor da venda " + i + ": ");
            double valor = scanner.nextDouble();
            total += valor;
        }

        System.out.println("\nFaturamento total do dia: R$ " + total);

        scanner.close();
    }
}