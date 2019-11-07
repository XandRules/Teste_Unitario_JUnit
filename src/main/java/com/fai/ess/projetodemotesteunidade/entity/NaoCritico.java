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
public class NaoCritico extends Componente {

    private static Integer idNovo = 0;

    public NaoCritico(String pn, String sn, String horas, String descricao, Integer ciclos, Integer dias) {
        super(pn, sn, horas, descricao, ciclos, dias);
        setId(++idNovo);
    }

    @Override
    public void incrementaTempoVida(String horas, Integer ciclos, Integer dias) {
        Integer ciclosAtual = getCiclos();
        Integer diasAtual = getDias();
        String horasAtual = getHoras();

        if (diasAtual != null) {
            diasAtual += dias;
            setDias(diasAtual);
        }

        if (ciclosAtual != null) {
            ciclosAtual += ciclos;
            setCiclos(ciclosAtual);
        }

        if (horasAtual != null) {
            Integer horasCalc = Integer.parseInt(horasAtual.split(":")[0]);
            Integer minutosCalc = Integer.parseInt(horasAtual.split(":")[1]);

            Integer horasI = horasCalc + Integer.
                    parseInt(horas.split(":")[0]);
            Integer minutosI = minutosCalc + Integer.
                    parseInt(horas.split(":")[1]);
            
           

            if ((minutosI / 60) > 0) {
                horasI += (minutosI / 60);
                minutosI -= ((minutosI / 60) * 60);
            }

            if(minutosI.toString().length() == 1){
               horasAtual = horasI.toString() + ":" + "0" +minutosI.toString();
            }else{
                horasAtual = horasI.toString() + ":" + minutosI.toString();
            }
            

            setHoras(horasAtual);
        }
    }

}
