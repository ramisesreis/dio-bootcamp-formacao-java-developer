package edu.fundamentos.aula03;

public class OperadorTernario {
    public static void main(String[] args) {
        int a, b;
        a = 5;
        b = 6;

        //  String resultado = "";
        //  if(a==b)
        //      resultado = "verdadeiro";
        //  else
        //      resultado = "falso";

        String resultado = a == b ? "verdadeiro":"falso"; //Operador Ternário.

        System.out.println(resultado);
    }
}
