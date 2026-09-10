package org.example;
 /*
 Exercício Aula 10/09/2026 - Regra Empréstimo

  */

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salario = scanner.nextDouble();
        double parcela = scanner.nextDouble();
        
        if(parcela <= (salario * 0.30)) {
            System.out.println("Empréstimo aprovado");
        } else {
            System.out.println("Empréstimo recusado");
        }
    }
}