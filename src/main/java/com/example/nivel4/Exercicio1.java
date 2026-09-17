package com.example.nivel4;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double valorReais, cotacaoDolar;

        System.out.println("Informe o valor em Reais: ");
        valorReais = entrada.nextDouble();

        System.out.println("Informe a cotacao atual do Dolar: ");
        cotacaoDolar = entrada.nextDouble();

        double valorDolares = valorReais / cotacaoDolar;

        System.out.println("Valor em Dolares: " + valorDolares);

        entrada.close();
    }
}