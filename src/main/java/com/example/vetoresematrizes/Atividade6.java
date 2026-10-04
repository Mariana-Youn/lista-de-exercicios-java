//Atividade 6 - Produção Agrícola por Mês e Cultura

package com.example.vetoresematrizes;

import java.util.Scanner;

public class Atividade6 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double producao[][] = new double[4][3];
        double totalCultura1 = 0;
        double totalCultura2 = 0;
        double totalCultura3 = 0;

        for (int i = 0; i < 4; i++) {

            System.out.println("Mês " + (i + 1));

            for (int j = 0; j < 3; j++) {

                System.out.println("Informe a produção da cultura " + (j + 1) + ":");
                producao[i][j] = entrada.nextDouble();

                if (j == 0) {
                    totalCultura1 = totalCultura1 + producao[i][j];
                } else if (j == 1) {
                    totalCultura2 = totalCultura2 + producao[i][j];
                } else {
                    totalCultura3 = totalCultura3 + producao[i][j];
                }
            }
        }

        System.out.println("Produção total da cultura 1: " + totalCultura1);
        System.out.println("Produção total da cultura 2: " + totalCultura2);
        System.out.println("Produção total da cultura 3: " + totalCultura3);

        entrada.close();
    }
}