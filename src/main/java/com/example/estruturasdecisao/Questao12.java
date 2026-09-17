package com.example.estruturasdecisao;

import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a renda mensal: ");
        double rendaMensal = sc.nextDouble();

        System.out.print("Digite o score de crédito: ");
        double scoreCredito = sc.nextDouble();

        if (rendaMensal > 8000 && scoreCredito > 700) {
            System.out.println("Cartão Premium aprovado!");
        } else {
            System.out.println("Cartão Premium recusado.");
        }

        sc.close();
    }

}
