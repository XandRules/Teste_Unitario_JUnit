/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fai.ess.projetodemotesteunidade.entity;

import java.util.List;

/**
 *
 * @author Alexandre
 */
public class Cliente extends BaseEntity {

    private static Integer idNovo = 0;
    String email;
    String nome;
     private List<Aeronave> aeronaveList;

    public Cliente(String email, String nome) {
        setId(++idNovo);
        this.email = email;
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aeronave> getAeronaveList() {
        return aeronaveList;
    }

    public void setAeronaveList(List<Aeronave> aeronaveList) {
        this.aeronaveList = aeronaveList;
    }
    
    

}
