/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareabbdd2;

/**
 *
 * @author marta
 */

import java.sql.Date;

public class Empleado {
    private int numemp;
    private String nombre;
    private int edad;
    private int oficina;
    private String puesto;
    private Date contrato;

    public Empleado(int numemp, String nombre, int edad, int oficina, String puesto, Date contrato) {
        this.numemp = numemp;
        this.nombre = nombre;
        this.edad = edad;
        this.oficina = oficina;
        this.puesto = puesto;
        this.contrato = contrato;
    }

    public Date getContrato() {
        return contrato;
    }

    public void setContrato(Date contrato) {
        this.contrato = contrato;
    }

    public int getNumemp() {
        return numemp;
    }

    public void setNumemp(int numemp) {
        this.numemp = numemp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getOficina() {
        return oficina;
    }

    public void setOficina(int oficina) {
        this.oficina = oficina;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "Empleado{" + "numemp=" + numemp + ", nombre=" + nombre + 
                ", edad=" + edad + ", oficina=" + oficina + ", puesto=" + 
                puesto + ", contrato=" + contrato + '}';
    }
}
