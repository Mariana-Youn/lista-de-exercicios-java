//Atividade 7 - Monitoramento de Chuvas

package com.example.vetoresematrizes;

import java.util.Scanner;

public class Atividade7 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double chuva[][] = new double[7][4];
        double totalArea1 = 0;
        double totalArea2 = 0;
        double totalArea3 = 0;
        double totalArea4 = 0;

        for (int i = 0; i < 7; i++) {

            System.out.println("Dia " + (i + 1));

            for (int j = 0; j < 4; j++) {

                System.out.println("Informe a quantidade de chuva da área " + (j + 1) + ":");

                chuva[i][j] = entrada.nextDouble();

                if (j == 0) {
                    totalArea1 = totalArea1 + chuva[i][j];
                } else if (j == 1) {
                    totalArea2 = totalArea2 + chuva[i][j];
                } else if (j == 2) {
                    totalArea3 = totalArea3 + chuva[i][j];
                } else {
                    totalArea4 = totalArea4 + chuva[i][j];
                }
            }
        }

        System.out.println("Total de chuva da área 1: " + totalArea1);
        System.out.println("Total de chuva da área 2: " + totalArea2);
        System.out.println("Total de chuva da área 3: " + totalArea3);
        System.out.println("Total de chuva da área 4: " + totalArea4);

        entrada.close();
    }
}
