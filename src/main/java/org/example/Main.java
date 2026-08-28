package org.example;
 /*
 Nível 1
3.	Conversão de Tipos (Casting Implícito e Explícito): Declare uma variável do tipo float e atribua um valor fracionado. Em seguida, declare uma variável do tipo long e atribua a ela o valor da variável float usando casting explícito. Por fim, declare uma variável do tipo double e atribua a ela o valor da variável long (casting implícito). Exiba todos os valores no console.
  */

public class Main {
    public static void main() {
        double valorDouble = 2.99;
        long valorLong = (long) valorDouble; //casting explícito
        double novoValorDouble = valorLong; //casting implícito
        System.out.println(valorDouble);
        System.out.println(valorLong);
        System.out.println(novoValorDouble);

        }
}
