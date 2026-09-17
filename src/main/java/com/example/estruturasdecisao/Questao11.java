package com.example.estruturasdecisao;

import java.util.Scanner;

public class Questao11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor investido: ");
        double valorInvestido = sc.nextDouble();

        if (valorInvestido <= 10000) {
            System.out.println("Classificação: Bronze");
        } 
        else if (valorInvestido <= 50000) {
            System.out.println("Classificação: Prata");
        } 
        else if (valorInvestido <= 100000) {
            System.out.println("Classificação: Ouro");
        } 
        else {
            System.out.println("Classificação: Platinum");
        }

        sc.close();
    }
}