/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoneomind;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Tailor
 */
public class ProjetoNeomind {
    
    public static long retornaAnguloRelogio(GregorianCalendar horario){
        long hora = horario.get(Calendar.HOUR_OF_DAY); // pega só a hora
        long minuto = horario.get(Calendar.MINUTE); // pega só o minuto
        long angulo;
        System.out.println("Hora: " + hora + ":" + minuto);        
        //para facilitar a conta, usei somente as 12 horas do relógio de ponteiro
        if(hora > 12){
            hora -= 12;
        }        
        //fórmula para caucular o ângulo entre os ponteiros
        angulo = (30 * hora) - ((11 * minuto) / 2);        
        //verifica se o valor é positivo
        if(angulo < 0){
            angulo *= -1; 
        }           
        //veifica se o ângulo encontrado é o menor entre os ponteiros
        if(angulo > 180){
            angulo = 360 - angulo;
        }  
        return angulo;
    }
    
    public static void main(String[] args) {
                  
        GregorianCalendar hora = new GregorianCalendar();
        
        System.out.println("O menor ângulo entre ponteiros referente à hora atual é: " + retornaAnguloRelogio(hora) + "º");
        
    }
    
}
