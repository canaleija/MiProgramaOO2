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
public class Matricula {
    private Fecha fechaIngreso;
    private Fecha fechaNacimiento;
    private String matricula;
    
    public Matricula(Fecha fechaIngreso, Fecha fechaNaci){
        this.fechaIngreso = fechaIngreso;
        fechaNacimiento = fechaNaci;
        this.matricula = "";
        calculaMatricula();
    }
    // concatenar lo necesario para 
    // construir la matricula 
    private void calculaMatricula (){
       this.matricula = this.fechaIngreso.getAnio()+"-"
               +this.fechaNacimiento.getAnio()+""+
               this.fechaNacimiento.getMes()+""+
               this.fechaNacimiento.getDia();
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }
    
    
}
