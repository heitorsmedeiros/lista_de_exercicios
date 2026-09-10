package org.example;
 /*
Exercício Aula 10/09/2026 - Detecção de Transação Suspeita

*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorTransacao = scanner.nextDouble();
        
        if(valorTransacao > 10000) {
            System.out.println("Transação suspeita. Sinalizada para análise.");
        } else {
            System.out.println("Transação normal.");
        }
    }
}