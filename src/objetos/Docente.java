/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.ArrayList;

/**
 *
 * @author Roberto Cruz Leija
 */
public abstract class Docente extends Persona implements RepresentanteEscolar{
    
    private Fecha fechaingreso;
    private double sueldo;
    private String gradoestudios;
    private ArrayList<String> materias;

    public Docente(String nombre, int edad, char sexo, double estatura, Fecha fechaNacimiento, 
            Fecha fechaIngreso, double sueldo, String grado ) {
         super(nombre, edad, sexo, estatura, fechaNacimiento);
         this.fechaingreso = fechaIngreso;
         this.sueldo = sueldo;
         this.gradoestudios = grado;
         this.materias = new ArrayList<>();
    
    }

    /**
     * @return the fechaingreso
     */
    public Fecha getFechaingreso() {
        return fechaingreso;
    }

    /**
     * @param fechaingreso the fechaingreso to set
     */
    public void setFechaingreso(Fecha fechaingreso) {
        this.fechaingreso = fechaingreso;
    }

    /**
     * @return the sueldo
     */
    public double getSueldo() {
        return sueldo;
    }

    /**
     * @param sueldo the sueldo to set
     */
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * @return the gradoestudios
     */
    public String getGradoestudios() {
        return gradoestudios;
    }

    /**
     * @param gradoestudios the gradoestudios to set
     */
    public void setGradoestudios(String gradoestudios) {
        this.gradoestudios = gradoestudios;
    }

    /**
     * @return the materias
     */
    public ArrayList<String> getMaterias() {
        return materias;
    }

    /**
     * @param materias the materias to set
     */
    public void setMaterias(ArrayList<String> materias) {
        this.materias = materias;
    }
    
    
    
}
