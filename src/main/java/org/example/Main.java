package org.example;
 /*
 Exercício Aula 10/09/2026 - Regra Curso de Idiomas

  */

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o cargo do funcionário: ");
        String cargo = scanner.nextLine();
        
        if (cargo.equalsIgnoreCase("administrativo") || cargo.equalsIgnoreCase("liderança") || cargo.equalsIgnoreCase("lideranca")) {
            System.out.println("O funcionário pode participar do programa de idiomas.");
        } else {
            System.out.println("Não pode participar do programa de idiomas.");
        }
    }
}