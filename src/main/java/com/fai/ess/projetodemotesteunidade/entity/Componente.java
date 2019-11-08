/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fai.ess.projetodemotesteunidade.entity;

import java.util.Objects;

/**
 *
 * @author Alexandre
 */
public abstract class Componente extends BaseEntity implements Voavel{    
    
    private String pn;
    private String sn;
    private String horas;
    private String descricao;
    private Integer ciclos;
    private Integer dias;

    public Componente(String pn, String sn, String horas, String descricao, Integer ciclos, Integer dias) {
        this.pn = pn;
        this.sn = sn;
        this.horas = horas;
        this.descricao = descricao;
        this.ciclos = ciclos;
        this.dias = dias;
    }

    
    
    public String getPn() {
        return pn;
    }

    public void setPn(String pn) {
        this.pn = pn;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getHoras() {
        return horas;
    }

    public void setHoras(String horas) {
        this.horas = horas;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getCiclos() {
        return ciclos;
    }

    public void setCiclos(Integer ciclos) {
        this.ciclos = ciclos;
    }

    public Integer getDias() {
        return dias;
    }

    public void setDias(Integer dias) {
        this.dias = dias;
    }

    
    public void atualizarTempodeVida(String horas, Integer ciclos, Integer dias) {
      
        if (this.ciclos != null) {
            this.ciclos += ciclos;
        }
        
        if (this.dias != null) {
            this.dias += dias;
        }

        if (this.horas != null) {
            Integer horasCalc = Integer.parseInt(this.horas.split(":")[0]);
            Integer minutosCalc = Integer.parseInt(this.horas.split(":")[1]);

            Integer horasI = horasCalc + Integer.parseInt(horas.split(":")[0]);
            Integer minutosI = minutosCalc + Integer.parseInt(horas.split(":")[1]);

            if ((minutosI / 60) > 0) {
                horasI += (minutosI / 60);
                minutosI -= ((minutosI / 60) * 60);
            }

            this.horas = horasI.toString() + ":" + minutosI.toString();
        }
    
    }  

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.pn);
        hash = 31 * hash + Objects.hashCode(this.sn);
        hash = 31 * hash + Objects.hashCode(this.horas);
        hash = 31 * hash + Objects.hashCode(this.descricao);
        hash = 31 * hash + Objects.hashCode(this.ciclos);
        hash = 31 * hash + Objects.hashCode(this.dias);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Componente other = (Componente) obj;
        if (!Objects.equals(this.pn, other.pn)) {
            return false;
        }
        if (!Objects.equals(this.sn, other.sn)) {
            return false;
        }
        if (!Objects.equals(this.horas, other.horas)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.ciclos, other.ciclos)) {
            return false;
        }
        if (!Objects.equals(this.dias, other.dias)) {
            return false;
        }
        return true;
    }
    
    
    
}
