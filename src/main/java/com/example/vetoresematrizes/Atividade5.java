//Atividade 5 - Umidade do Solo

package com.example.vetoresematrizes;

import java.util.Scanner;

public class Atividade5 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double umidade[] = new double[8];
        int abaixo = 0;

        for (int i = 0; i < 8; i++) {

            System.out.println("Informe a umidade da área " + (i + 1) + ":");

            umidade[i] = entrada.nextDouble();

            if (umidade[i] < 40) {

                abaixo = abaixo + 1;
            }
        }

        System.out.println("Áreas com umidade inferior a 40%: " + abaixo);

        entrada.close();
    }

}