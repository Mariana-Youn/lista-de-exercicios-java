package com.example.estruturasrepeticao;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double venda = 0;
        double soma = 0;

        for (int contador = 1; contador <= 5; contador++) {
            System.out.println("Informe o valor da venda: ");
            venda = entrada.nextDouble();
            soma = soma + venda;
        }

        System.out.println("O total é de R$: " + soma);

        entrada.close();
    }
}