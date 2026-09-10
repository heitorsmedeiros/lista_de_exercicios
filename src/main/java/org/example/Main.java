package org.example;
 /*
Exercício Aula 10/09/2026 - Controle de Eventos

*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o nome do participante " + i + ": ");
            String nome = scanner.nextLine();
            System.out.println("Participante " + nome + " registrado com sucesso!\n");
        }

        scanner.close();
    }
}