/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fai.ess.projetodemotesteunidade.entity;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Alexandre
 */
public class NaoCriticoTest {
    
    public NaoCriticoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of incrementaTempoVida method, of class NaoCritico.
     */
    @Test
    public void testIncrementaTempoVida() {
        System.out.println("incrementarTempoVida");
        String horas = "5:00";
        Integer ciclos = 100;
        Integer dias = 30;
        NaoCritico instance = new NaoCritico("123", "ABC", "0:00", "TEST01", 0, 0);
        String expResultHoras = "5:00";
        Integer expResultCiclos = 100;
        Integer expResultDias = 30;
        instance.incrementaTempoVida(horas, ciclos, dias);
        assertEquals(expResultHoras, instance.getHoras());
        assertEquals(expResultCiclos, instance.getCiclos());
        assertEquals(expResultDias, instance.getDias());
    }
    
}
