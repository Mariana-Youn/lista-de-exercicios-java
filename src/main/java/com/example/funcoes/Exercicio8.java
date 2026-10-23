//Exercício 8 - Função que Calcula o Fatorial de um Número

package com.example.funcoes;

public class Exercicio8
{
    public static void main(String args[])
    {
        int resultado = calcularFatorial(5);

        System.out.println("O fatorial do número é: " + resultado);
    }

    public static int calcularFatorial(int numero)
    {
        int fatorial = 1;

        for (int i = 1; i <= numero; i++)
        {
            fatorial = fatorial * i;
        }

        return fatorial;
    }
}