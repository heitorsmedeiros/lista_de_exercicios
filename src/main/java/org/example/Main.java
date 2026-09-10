package org.example;
 /*
Exercício Aula 10/09/2026 - Eligibilidade Cartão de Crédito Premium

*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double renda = scanner.nextDouble();
        int score = scanner.nextInt();
        
        if(renda > 8000 && score > 700) {
            System.out.println("Cartão Premium aprovado");
        } else {
            System.out.println("Cartão Premium recusado");
        }
    }
}