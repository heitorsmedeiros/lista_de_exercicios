package org.example;
 /*
 Exercício Aula 01/09/2026 - Classificação de Desempenho

  */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 7: ");
        int numero = entrada.nextInt();

        switch (numero) {
            case 1:
                System.out.println("O dia correspondente é: Domingo");
                break;
            case 2:
                System.out.println("O dia correspondente é: Segunda-feira");
                break;
            case 3:
                System.out.println("O dia correspondente é: Terça-feira");
                break;
            case 4:
                System.out.println("O dia correspondente é: Quarta-feira");
                break;
            case 5:
                System.out.println("O dia correspondente é: Quinta-feira");
                break;
            case 6:
                System.out.println("O dia correspondente é: Sexta-feira");
                break;
            case 7:
                System.out.println("O dia correspondente é: Sábado");
                break;
            default:
                System.out.println("Número inválido!");
                break;

        }
    }
}
