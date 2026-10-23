//Exercício 2 - Função que Soma Dois Números

package com.example.funcoes;

public class Exercicio2
{
    public static void main(String args[])
    {
        int resultado = somar(10, 5);

        System.out.println("Resultado da soma: " + resultado);
    }

    public static int somar(int num1, int num2)
    {
        return num1 + num2;
    }
}