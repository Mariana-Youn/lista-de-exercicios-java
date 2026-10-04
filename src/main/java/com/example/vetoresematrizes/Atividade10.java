//Atividade 10 - Produção de Frutas por Pomar

package com.example.vetoresematrizes;

import java.util.Scanner;

public class Atividade10 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double producao[][] = new double[4][12];
        double maior = 0;
        int pomarMaior = 0;

        for (int i = 0; i < 4; i++) {

            double total = 0;

            System.out.println("Pomar " + (i + 1));

            for (int j = 0; j < 12; j++) {

                System.out.println("Informe a produção do mês " + (j + 1) + ":");

                producao[i][j] = entrada.nextDouble();

                total = total + producao[i][j];
            }

            if (total > maior) {
                maior = total;
                pomarMaior = i + 1;
            }
        }

        System.out.println("Pomar com maior produção anual: " + pomarMaior);
        System.out.println("Maior produção anual: " + maior);

        entrada.close();
    }
}