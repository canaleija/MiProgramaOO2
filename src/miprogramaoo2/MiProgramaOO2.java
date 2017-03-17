/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprogramaoo2;

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
       Persona laura = new Persona("Laura Garza", 34,'f', 1.66,
               new Fecha(12, 12, 1995));
               
       System.out.println(laura.toString());
    }
    
}
