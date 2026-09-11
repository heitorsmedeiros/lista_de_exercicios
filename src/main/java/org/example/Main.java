package org.example;
 /*
Exercício Aula 11/09/2026 - Pesquisa de Satistfação 
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int avaliacoes = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite a nota de satisfação do cliente " + i + ": ");
            scanner.nextDouble();
            avaliacoes++;
        }

        System.out.println("\nQuantidade de avaliações registradas: " + avaliacoes);

        scanner.close();
    }
}