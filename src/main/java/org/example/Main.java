package org.example;
 /*
Exercício Aula 11/09/2026 - Caixa de Supermercado 
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        String continuar;

        do {
            System.out.print("Digite o valor do produto: ");
            double valor = scanner.nextDouble();
            total += valor;

            System.out.print("Deseja continuar registrando? (S/N): ");
            continuar = scanner.next();
        } while (continuar.equalsIgnoreCase("S"));

        System.out.println("\nTotal da compra: R$ " + total);

        scanner.close();
    }
}