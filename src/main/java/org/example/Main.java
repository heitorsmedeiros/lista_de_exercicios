package org.example;
 /*
 Exercício Aula 04/09/2026 - Validação de Vale Refeição

  */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o salário: ");
        double salario = scanner.nextDouble();

        Boolean temValeRefeicao = salario <= 4000.0;


        if (temValeRefeicao) {
            System.out.print("O funcionário tem direito ao vale refeição. ");
            

       
            
        } else {
            System.out.println("O funcionário não tem direito ao vale refeição.");
        }

        }
    }
}
