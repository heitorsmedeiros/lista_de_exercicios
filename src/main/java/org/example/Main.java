package org.example;
 /*
Exercício Aula 10/09/2026 -  Concessão de Isenção de Tarifas

*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldoMedio = scanner.nextDouble();
        
        if(saldoMedio > 5000) {
            System.out.println("Isenção de tarifa concedida.");
        } else {
            System.out.println("Tarifa mantida.");
        }
    }
}