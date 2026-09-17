package com.example.estruturasdecisao;

import java.util.Scanner;

public class Questao13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da transação: ");
        double valorTransacao = sc.nextDouble();

        if (valorTransacao > 10000) {
            System.out.print("Transação suspeita! Sinalizada para análise.");
        } else {
            System.out.print("Transação autorizada.");
        }

        sc.close();
    }
}
