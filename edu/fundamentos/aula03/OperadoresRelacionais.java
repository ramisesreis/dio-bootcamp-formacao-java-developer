package edu.fundamentos.aula03;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        String nomeUm = "Ramisés";
        String nomeDois = "Ramisés";
        String nomeTres = new String("Ramisés");

        System.out.println(nomeUm == nomeDois);
        System.out.println(nomeUm == nomeTres);
    }
}
