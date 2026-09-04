package org.example;
 /*
 Exercício Aula 04/09/2026 - Regra de Plano de Saúde

  */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de meses: ");
        double meses = scanner.nextDouble();


        if (meses > 3) {
            System.out.println("O funcionário tem direito ao plano de saúde.");
        } else {
            System.out.println("O funcionário não tem direito ao plano de saúde.");
        }

        scanner.close();
    }
}