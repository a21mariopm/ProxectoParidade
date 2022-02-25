package com.mycompany.proxectoparidade;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;

/**
 * Proba unitaria da clase ParMain
 * @author a21mariopm
 */
public class ParMainTest {
    
    /**
     * Constructor por defecto
     */
    public ParMainTest() {
    }

    /**
     * Test of main method, of class ParMain.
     */
    @Test
    @Disabled
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ParMain.main(args);
    }

    /**
     * Test of comprobarParidade method, of class ParMain para o numero 0
     */
    @Test
    public void testComprobarParidadeCero() {
        System.out.println("comprobarParidade do cero");
        int numeroProba = 0;
        String resultadoEsperado = "O número é par";
        String resultado = ParMain.comprobarParidade(numeroProba);
        assertEquals(resultadoEsperado, resultado);
    }
   
    /**
     * Test do metodo ComprobarParidade de un numero par positivo
     */
    @Test
    public void testComprobarParidadeParPositivo() {
        System.out.println("comprobarParidade do 2");
        int numeroProba = 2;
        String expResult = "O número é par";
        String result = ParMain.comprobarParidade(numeroProba);
        assertEquals(expResult, result);
    }
    
    /**
     * Test do metodo ComprobarParidade de un numero impar positivo
     */
    @Test
    public void testComprobarParidadeImparPositivo() {
        System.out.println("comprobarParidade do 1");
        int numeroProba = 1;
        String expResult = "O número é impar";
        String result = ParMain.comprobarParidade(numeroProba);
        assertEquals(expResult, result);
    }
  
    /**
     * Test do metodo ComprobarParidade de un numero impar negativo
     */
    @Test
    public void testComprobarParidadeImparNegativo() {
        System.out.println("comprobarParidade do -1");
        int numeroProba = -1;
        String expResult = "O número é impar";
        String result = ParMain.comprobarParidade(numeroProba);
        assertEquals(expResult, result);
    }
    
    /**
     * Test do metodo ComprobarParidade de un numero par negativo
     */
    @Test
    public void testComprobarParidadeParNegativo() {
        System.out.println("comprobarParidade do -2");
        int numeroProba = -2;
        String expResult = "O número é par";
        String result = ParMain.comprobarParidade(numeroProba);
        assertEquals(expResult, result);
    }

    

    /**
     * Test do metido VerificaPar para un numero O
     */
    @Test
    public void testVerificaPar0() {
        System.out.println("verificaParCero");
        int numeroProba = 0;
        assertTrue(ParMain.verificaPar(numeroProba));

    }

    /**
     * Test do metido VerificaPar para un numero par positivo
     */
    @Test
    public void testVerificaPar10() {
        System.out.println("verificaParde10");
        int numeroProba = 10;
        assertTrue(ParMain.verificaPar(numeroProba));

    }

    /**
     * Test do metido VerificaPar para un numero impar
     */
    @Test
    public void testVerificaImpar11() {
        System.out.println("verificaParde11");
        int numeroProba = 11;
        assertFalse(ParMain.verificaPar(numeroProba));
    }
    
    
    
}
