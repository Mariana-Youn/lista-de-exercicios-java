package com.example.estruturasdecisao;

import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("O funcionário utiliza veículo próprio para trabalhar? (S/N): ");
        String resposta = sc.nextLine();

        if (resposta.equalsIgnoreCase("S")) {
            System.out.println("Ele pode solicitar auxílio combustível.");
        } else {
            System.out.println("Ele não pode solicitar auxílio combustível.");
        }

        sc.close();
    }
}