/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fai.ess.projetodemotesteunidade.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Alexandre
 */
public class Aeronave extends BaseEntity implements Voavel {

    private final List<Componente> componenteList;
    private final List<LogBook> loogBookList;
    private static Integer idNovo = 0;
    private String prefixo;
    private String horas;
    private Integer ciclos;
    private Integer dias;
    private final Cliente dono;

    public Aeronave(List<Componente> componenteList, List<LogBook> loogBookList, String prefixo, String horas, Integer ciclos, Integer dias, Cliente dono) {
        this.componenteList = componenteList;
        this.loogBookList = loogBookList;
        this.prefixo = prefixo;
        this.horas = horas;
        this.ciclos = ciclos;
        this.dias = dias;
        this.dono = dono;
    }

    public static Integer getIdNovo() {
        return idNovo;
    }

    public static void setIdNovo(Integer idNovo) {
        Aeronave.idNovo = idNovo;
    }

    Aeronave(ArrayList<Componente> arrayList, ArrayList<LogBook> arrayList0, String string, String string0, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public String getHoras() {
        return horas;
    }

    public void setHoras(String horas) {
        this.horas = horas;
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

    public List<Componente> getComponenteList() {
        return componenteList;
    }

    public List<LogBook> getLoogBookList() {
        return loogBookList;
    }

    @Override
    public void atualizarTempodeVida(String hora, Integer ciclo, Integer dia) {
        Integer horasCalc = Integer.parseInt(this.horas.split(":")[0]);
        Integer minutosCalc = Integer.parseInt(this.horas.split(":")[1]);
        Integer horasI = horasCalc + Integer.parseInt(horas.split(":")[0]);
        Integer minutosI = minutosCalc + Integer.parseInt(horas.split(":")[1]);

        this.ciclos += ciclos;
        this.dias += dias;

        if ((minutosI / 60) > 0) {
            horasI += (minutosI / 60);
            minutosI -= ((minutosI / 60) * 60);
        }

        this.horas = horasI.toString() + ":" + minutosI.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.componenteList);
        hash = 97 * hash + Objects.hashCode(this.loogBookList);
        hash = 97 * hash + Objects.hashCode(this.prefixo);
        hash = 97 * hash + Objects.hashCode(this.horas);
        hash = 97 * hash + Objects.hashCode(this.ciclos);
        hash = 97 * hash + Objects.hashCode(this.dias);
        hash = 97 * hash + Objects.hashCode(this.dono);
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
        final Aeronave other = (Aeronave) obj;
        if (!Objects.equals(this.prefixo, other.prefixo)) {
            return false;
        }
        if (!Objects.equals(this.horas, other.horas)) {
            return false;
        }
        if (!Objects.equals(this.componenteList, other.componenteList)) {
            return false;
        }
        if (!Objects.equals(this.loogBookList, other.loogBookList)) {
            return false;
        }
        if (!Objects.equals(this.ciclos, other.ciclos)) {
            return false;
        }
        if (!Objects.equals(this.dias, other.dias)) {
            return false;
        }
        if (!Objects.equals(this.dono, other.dono)) {
            return false;
        }
        return true;
    }
    
    

}
