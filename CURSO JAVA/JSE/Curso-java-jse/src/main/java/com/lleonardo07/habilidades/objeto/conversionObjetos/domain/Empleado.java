package com.lleonardo07.habilidades.objeto.conversionObjetos.domain;

/**
 *
 * @author Leand
 */
public class Empleado {
    
    private String nombre;
    private double sueldo;

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    
    public String getObtenerDetalles(){
        return "Nombre: " + this.nombre + ", sueldo: " + this.sueldo; 
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", sueldo=" + sueldo + '}';
    }
}
