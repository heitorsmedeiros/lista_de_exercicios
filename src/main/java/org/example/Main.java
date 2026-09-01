package org.example;
 /*
 Exercício Aula 01/09/2026 - Classificação de Desempenho

  */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do aluno (entre 0 e 10): ");
        double nota = scanner.nextDouble();

        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida! A nota deve estar entre 0 e 10.");
        } else {
            if (nota >= 9.0) {
                System.out.println("Classificação: Excelente");
            } else if (nota >= 7.0) {
                System.out.println("Classificação: Bom");
            } else if (nota >= 5.0) {
                System.out.println("Classificação: Regular");
            } else {
                System.out.println("Classificação: Insuficiente");
            }
        }
    }
}
