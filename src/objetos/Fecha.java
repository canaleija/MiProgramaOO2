/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author Roberto Cruz Leija
 */
public class Fecha {
    // atributos 
    private int dia;
    private int mes;
    private int anio;
    
    // agregar constructor donde pida los datos 
    public Fecha(int dia, int mes, int anio){
      this.dia = dia;
      this.mes = mes;
      this.anio = anio;
    }

    /**
     * @return the dia
     */
    public int getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * @return the mes
     */
    public int getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * @return the anio
     */
    public int getAnio() {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }
    // sobre escritura de un metodo

    @Override
    public String toString() {
       String aux = this.dia+"/"+this.mes+"/"+this.anio;
       return aux;
    }
    
    
}
