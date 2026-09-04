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

        String classificacao;


        if (nota >= 0 && nota <= 10) {
            

            if (nota >= 9.0) {
                classificacao = "Excelente";
            } else if (nota >= 7.0) {
                classificacao = "Bom";
            } else if (nota >= 5.0) {
                classificacao = "Regular";
            } else {
                classificacao = "Insuficiente";
            }
            

            System.out.println("Classificação do desempenho: " + classificacao);
            
        } else {
            System.out.println("Erro: A nota inserida é inválida. Digite um valor entre 0 e 10.");
        }

        }
    }
}
