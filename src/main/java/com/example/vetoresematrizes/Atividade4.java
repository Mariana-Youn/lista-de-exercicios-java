//Atividade 4 - Produção de Hortaliças por Talhão

package com.example.vetoresematrizes;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double producao[] = new double[5];
        double total = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe a produção do talhão " + (i + 1) + ":");
            producao[i] = entrada.nextDouble();

            total = total + producao[i];
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Produção do talhão " + (i + 1) + ": " + producao[i]);
        }

        System.out.println("Produção total: " + total);

        entrada.close();
    }
}