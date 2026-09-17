package com.example.nivel2;

public class Exercicio1 {
    public static void main(String[] args) {

        int a, b;
        a = 10;
        b = 5;

        boolean maior = a > b;

        System.out.println("a maior que b? R: " + maior);
        System.out.println("a menor que b? R: " + (a < b));
        System.out.println("a maior ou igual a b? R: " + (a >= b));
        System.out.println("a menor ou igual a b? R: " + (a <= b));
        System.out.println("a igual b? R: " + (a == b));
        System.out.println("a diferente de b? R: " + (a != b));
    }
}