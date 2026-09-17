package com.example.nivel3;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int nota1, nota2, nota3;

        // entrada de dados
        System.out.println("Informe a primeira nota: ");
        nota1 = entrada.nextInt();

        System.out.println("Informe a segunda nota: ");
        nota2 = entrada.nextInt();

        System.out.println("Informe a terceira nota: ");
        nota3 = entrada.nextInt();

        double media = (double) (nota1 + nota2 + nota3) / 3;

        System.out.println("Nota Media: " + media);

        entrada.close();
    }
}