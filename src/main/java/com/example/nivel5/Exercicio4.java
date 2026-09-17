package com.example.nivel5;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double capital, taxa;
        int tempo;

        System.out.println("Informe o capital inicial: ");
        capital = entrada.nextDouble();

        System.out.println("Informe a taxa de juros mensal: ");
        taxa = entrada.nextDouble();

        System.out.println("Informe o tempo em meses: ");
        tempo = entrada.nextInt();

        double juros = capital * (taxa / 100) * tempo;
        double montante = capital + juros;

        System.out.println("Juros: " + juros);
        System.out.println("Montante final: " + montante);

        entrada.close();
    }
}