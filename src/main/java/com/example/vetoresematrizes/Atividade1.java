//Atividade 1 - Produção de Milho por Semana

package com.example.vetoresematrizes;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double producao[] = new double[7];
        double total = 0;
        double media;
        double maior = 0;

        for (int i = 0; i < 7; i++) {
            System.out.println("Informe a produção de milho da semana " + (i + 1) + ":");
            producao[i] = entrada.nextDouble();

            total = total + producao[i];

            if (producao[i] > maior) {
                maior = producao[i];
            }
        }

        media = total / 7;

        System.out.println("Produção total: " + total + " toneladas");
        System.out.println("Média semanal: " + media + " toneladas");
        System.out.println("Maior produção: " + maior + " toneladas");

        entrada.close();
    }
}