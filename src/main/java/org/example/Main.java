package org.example;
 /*
 Exercício Aula 10/09/2026 - Regra de Auxílio Combustível

  */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("O funcionário utiliza veículo próprio para trabalhar? (S/N): ");
        String resposta = scanner.nextLine();
        
        if(resposta.equalsIgnoreCase("S")) {
            System.out.println("Ele pode solicitar auxílio combustível.");
        } else {
            System.out.println("Não possui auxílio disponível");
        }
    }
}