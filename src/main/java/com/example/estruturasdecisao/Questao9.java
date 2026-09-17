package com.example.estruturasdecisao;

import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o cargo do funcionário: ");
        String cargo = sc.nextLine();

        if (cargo.equalsIgnoreCase("administrativo")) {
            System.out.println("O funcionário pode participar do programa de idiomas.");
        } else if (cargo.toLowerCase().startsWith("lideran")) {
            System.out.println("O funcionário pode participar do programa de idiomas.");
        } else {
            System.out.println("O funcionário não pode participar do programa de idiomas.");
        }

        sc.close();
    }
}