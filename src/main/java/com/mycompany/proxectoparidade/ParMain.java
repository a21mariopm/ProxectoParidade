package com.mycompany.proxectoparidade;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 * Comproba a paridade dun numero enteiro
 * @author a21mariopm
 */
public class ParMain {

    private static final String O_NUMERO_E_IMPAR = "O número é impar";
    private static final String O_NUMERO_E_PAR = "O número é par";
    /**
     * Le un numero da entrada estandar e comproba a sua paridade
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada=new Scanner(System.in);
       int numeroProba=lerNumero(entrada);
        System.out.println(comprobarParidade(numeroProba));
    }

    /**
     * Indica se numero proba é par ou impar
     * @param numeroPar numero enteiro a comprobar
     * @return cadea indicando a paridade
     */
    static String comprobarParidade(int numeroProba) {
        String resultado;
        if (verificaPar(numeroProba)){
            resultado=O_NUMERO_E_PAR;
        }else{
            resultado=O_NUMERO_E_IMPAR;
        }
        return resultado;
    }
    /**
     * Verifica se numeroProba é par
     * @param numeroPar numero enteiro a comprobar
     * @return booleano con valor true se o numero é par
     */    
    static boolean verificaPar(int numeroProba) {
        return numeroProba%2==0;
    }
    /**
     * Le número da entrada estandar
     * @param in representa a entrada estandar
     * @return enteiro inserido por o usuario
     */
    private static int lerNumero(Scanner in) {
        System.out.println("Introduce un número");
        int numeroProba=in.nextInt();
        return numeroProba;
    }
    
}
