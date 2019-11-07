/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fai.ess.projetodemotesteunidade.entity;

import java.util.ArrayList;
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
    
    
}
