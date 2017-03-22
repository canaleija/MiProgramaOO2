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
public class Alumno extends Persona implements RepresentanteEscolar{
    
    private Fecha fechaIngreso;
    // matricula del estudiante
    private Matricula matricula;
    private String escuela;
    private String carrera;
    
    public Alumno(String nombre,int edad,char sexo,
            double estatura, Fecha fn, Fecha fi,
            Matricula matri, String escuela,
            String carrera){
        super(nombre,edad,sexo,estatura,fn);
        this.fechaIngreso = fi;
        this.matricula = matri;
        this.escuela = escuela;
        this.carrera = carrera;
    
    }

    /**
     * @return the fechaIngreso
     */
    public Fecha getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * @param fechaIngreso the fechaIngreso to set
     */
    public void setFechaIngreso(Fecha fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    /**
     * @return the matricula
     */
    public Matricula getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the escuela
     */
    public String getEscuela() {
        return escuela;
    }

    /**
     * @param escuela the escuela to set
     */
    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    /**
     * @return the carrera
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * @param carrera the carrera to set
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public void salude(String saludo) {
        System.out.println("Huelum! soy "
                +super.getNombre());
    }
    
}
