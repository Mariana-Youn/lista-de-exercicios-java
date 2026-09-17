package com.example.nivel4;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int a, b, auxiliar;

        System.out.println("Informe o valor de A: ");
        a = entrada.nextInt();

        System.out.println("Informe o valor de B: ");
        b = entrada.nextInt();

        System.out.println("Antes da troca:");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        auxiliar = a;
        a = b;
        b = auxiliar;

        System.out.println("Depois da troca:");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        entrada.close();
    }
}