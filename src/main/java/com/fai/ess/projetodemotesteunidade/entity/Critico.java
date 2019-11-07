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
public class Critico extends Componente {

    public Critico(String pn, String sn, String horas, String descricao, Integer ciclos, Integer dias) {
        super(pn, sn, horas, descricao, ciclos, dias);
    }

    @Override
    public void atualizarTempodeVida(String horas, Integer ciclos, Integer dias) {
        Integer ciclosAtual = getCiclos();
        Integer diasAtual = getDias();
        String horasAtual = getHoras();
        
        if (dias != 0) {
            diasAtual += dias;
            setDias(diasAtual);
        }
        
        if (ciclos != 0) {
            ciclosAtual += ciclos + 1;
            setCiclos(ciclosAtual);
        }

        if (horas != null) {
            Integer horasCalc = Integer.parseInt(horasAtual.split(":")[0]);
            Integer minutosCalc = Integer.parseInt(horasAtual.split(":")[1]);

            Integer horasI = horasCalc + Integer.
                        parseInt(horas.split(":")[0]);
            Integer minutosI = minutosCalc + Integer.
                        parseInt(horas.split(":")[1]) + 30;

            if ((minutosI / 60) > 0) {
                horasI += (minutosI / 60);
                minutosI -= ((minutosI / 60) * 60);
            }

            horasAtual = horasI.toString() + ":" + minutosI.toString();
            
            setHoras(horasAtual);
        }
    }

    
}
