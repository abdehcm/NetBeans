/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alumnodaoenmac;

import java.util.Date;

/**
 *
 * @author abdelhachim
 */
public class Alumno {

    private final int TAM_NOMBRE = 30;
    private int id;
    private String nombre;
    private Date fechaNac;
    private double notaMedia;
    private String curso;

    public Alumno(int id) {
        this.id = id;
    }

    public Alumno(int id, String nombre, Date fechaNac, double notaMedia, String curso) {
        this.id = id;
        this.setNombre(nombre);
        this.fechaNac = fechaNac;
        this.notaMedia = notaMedia;
        this.setCurso(curso);
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public String getCurso() {
        return curso;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.substring(0, Math.min(TAM_NOMBRE, nombre.length()));
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public void setCurso(String curso) {
        this.curso = curso.substring(0, Math.min(2, nombre.length()));
    }

    @Override
    public String toString() {
        return "Alumno{" + "id= " + id + ", nombre= " + nombre + ", fechaNac= " + fechaNac + ", notaMedia= " + notaMedia + ", curso= " + curso + '}';
    }

}
