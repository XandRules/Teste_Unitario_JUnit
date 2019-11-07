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
public class CriticoTest {
    
    public CriticoTest() {
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
     * Test of incrementaTempoVida method, of class Critico.
     */
    @Test
    public void testIncrementaTempoVidaPorHoras() {//Controlado por horas
        System.out.println("incrementarTempoVida");
        String horas = "110:00";
        Integer ciclos = 0;
        Integer dias = 0;
        Critico instance = new Critico("PN001", "SN001", "0:00", "TEST01", 0, 0);
        String expResultHoras = "110:30";        
        instance.incrementaTempoVida(horas, ciclos, dias);        
        assertEquals(expResultHoras, instance.getHoras());
    }
    
    @Test
    public void testIncrementaTempoVidaPorCiclos() {//Controlado por ciclos
        System.out.println("incrementarTempoVida");
        String horas = "0:00";
        Integer ciclos = 10;
        Integer dias = 0;
        Critico instance = new Critico("PN001", "SN001", "0:00", "TEST01", 10, 0);
        Integer expResultCiclos = 21;        
        instance.incrementaTempoVida(horas, ciclos, dias);        
        assertEquals(expResultCiclos, instance.getCiclos());
    }
    
    @Test
    public void testIncrementaTempoVidaPorDias() {//Controlado por ciclos
        System.out.println("incrementarTempoVida");
        String horas = "0:00";
        Integer ciclos = 0;
        Integer dias = 120;
        Critico instance = new Critico("PN001", "SN001", "0:00", "TEST01", 0, 0);
        Integer expResultDias = 120;        
        instance.incrementaTempoVida(horas, ciclos, dias);        
        assertEquals(expResultDias, instance.getDias());
    }
    
}
