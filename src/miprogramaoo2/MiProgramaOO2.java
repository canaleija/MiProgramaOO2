/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprogramaoo2;

import objetos.Docente;
import objetos.Fecha;
import objetos.Persona;

/**
 *
 * @author Roberto Cruz Leija
 */
public class MiProgramaOO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Docente acuna = new Docente("Hector Alejandro", 30, 'm', 1.80, 
                 new Fecha(23, 11, 1985), new Fecha(1, 8, 2014), 5000, "Maestría") {
            @Override
            public void salude(String saludo) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        System.out.println(acuna.getEstatura());
        acuna.getMaterias().add("Introduccion a la Programación");
        
        System.out.println(acuna.toString());
    }
    
}
