/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fai.ess.projetodemotesteunidade.entity;

/**
 *
 * @author Alexandre
 */
public class LogBook extends BaseEntity{   
    
    private static Integer idNovo = 0;
    private String data;
    private Integer voo;
    private String horasVoadas;
    private Integer ciclosVoador;
    private Integer diasVoados;

    public LogBook(String data, Integer voo, String horasVoadas, Integer ciclosVoador, Integer diasVoados) {
        this.data = data;
        this.voo = voo;
        this.horasVoadas = horasVoadas;
        this.ciclosVoador = ciclosVoador;
        this.diasVoados = diasVoados;
        setId(++idNovo);
    }

    public static Integer getIdNovo() {
        return idNovo;
    }

    public static void setIdNovo(Integer idNovo) {
        LogBook.idNovo = idNovo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Integer getVoo() {
        return voo;
    }

    public void setVoo(Integer voo) {
        this.voo = voo;
    }

    public String getHorasVoadas() {
        return horasVoadas;
    }

    public void setHorasVoadas(String horasVoadas) {
        this.horasVoadas = horasVoadas;
    }

    public Integer getCiclosVoador() {
        return ciclosVoador;
    }

    public void setCiclosVoador(Integer ciclosVoador) {
        this.ciclosVoador = ciclosVoador;
    }

    public Integer getDiasVoados() {
        return diasVoados;
    }

    public void setDiasVoados(Integer diasVoados) {
        this.diasVoados = diasVoados;
    }

   
    
    
}
