/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fai.ess.projetodemotesteunidade.entity;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Alexandre
 */
public class AeronaveTest {
    
    public AeronaveTest() {
    }
    
//    @BeforeAll
//    public static void setUpClass() {
//    }
//    
//    @AfterAll
//    public static void tearDownClass() {
//    }
//    
//    @BeforeEach
//    public void setUp() {
//    }
//    
//    @AfterEach
//    public void tearDown() {
//    }

    @Test
    public void testIncrementaTempoVida() {
        System.out.println("incrementaTempoVida");
        String hora = "10:00";
        Integer ciclo = 20;
        Integer dia = 30;
        Aeronave instance = new Aeronave(new ArrayList<>(),new ArrayList<>(),"","00:00",0,0,new Cliente("", ""));
        Aeronave result = new Aeronave(new ArrayList<>(),new ArrayList<>(),"","10:00",20,30,new Cliente("", ""));
        instance.atualizarTempodeVida(hora, ciclo, dia);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
       @Test
    public void testIncrementaTempoDeVidaNull() {
        System.out.println("incrementarTempoVidaNull");
        Aeronave aeronaveAtual = new Aeronave(new ArrayList<>(),new ArrayList<>(),"","00:00",0,0,new Cliente("", ""));
        Aeronave aeronaveEsp = new Aeronave(new ArrayList<>(),new ArrayList<>(),"","00:00",0,0,new Cliente("", ""));
        
     
        assertEquals(aeronaveEsp, aeronaveAtual);
        // TODO review the generated test code and remove the default call to fail.
        //  fail("The test case is a prototype.");
    }
    
    @Test
    public void testIncrementaTempoDeVidaHoras() {
        System.out.println("incrementarTempoVidaHoras");
        String horas = null;
        Integer ciclos = 10;
        Integer dias = 1;
        Aeronave aeronaveAtual = new Aeronave(new ArrayList<>(),new ArrayList<>(),"","00:00",10,1,new Cliente("", ""));
        Aeronave aeronaveEsp = new Aeronave(new ArrayList<>(),new ArrayList<>(),"","00:00",20,2,new Cliente("", ""));

        aeronaveAtual.atualizarTempodeVida(horas, ciclos, dias);
        assertEquals(aeronaveEsp, aeronaveAtual);

        // TODO review the generated test code and remove the default call to fail.
        //  fail("The test case is a prototype.");
    }
//
//    @Test
//    public void testIncrementaTempoVidaCiclos() {
//        System.out.println("incrementaTempoVidaCiclos");
//        Float horas = 7.0F;
//        Integer ciclos = null;
//        Integer dias = 20;
//        Aeronave aeronaveAtual = new Aeronave("BAH", 0.0F, 2, 32, null, null, null, 1);
//        Aeronave aeronaveEsp = new Aeronave("BAH", 7.0F, 2, 52, null, null, null, 1);
//
//        aeronaveAtual.incrementaTempoDeVida(horas, ciclos, dias);
//        assertEquals(aeronaveEsp, aeronaveAtual);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testIncrementaTempoVidaDias() {
//        System.out.println("incrementaTempoVidaDias");
//        Float horas = 7.0F;
//        Integer ciclos = 10;
//        Integer dias = null;
//        Aeronave aeronaveAtual = new Aeronave("BAH", 0.0F, 2, 32, null, null, null, 1);
//        Aeronave aeronaveEsp = new Aeronave("BAH", 7.0F, 12, 32, null, null, null, 1);
//
//        aeronaveAtual.incrementaTempoDeVida(horas, ciclos, dias);
//        assertEquals(aeronaveEsp, aeronaveAtual);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
//    
}
