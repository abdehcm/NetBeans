/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioClaseHora;

/**
 *
 * @author abdelhachim
 */
public class Hora {

    enum diaSemana {
        LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
    }

    private int hora;
    private int minuto;
    private int segundo;
    diaSemana ds;

    public Hora(String ds) {
        this.ds = diaSemana.valueOf(ds);
    }

    public void setHora(int hora) {
        if (0 <= hora && hora <= 23) {
            this.hora = hora;
        } else {
            this.hora = 0;
        }
    }

    public void setMinuto(int minuto) {

        if (0 <= minuto && minuto <= 59) {
            this.minuto = minuto;
        } else {
            this.minuto = 0;
        }
    }

    public void setSegundo(int segundo) {
        if (0 <= segundo && segundo <= 59) {
            this.segundo = segundo;
        } else {
            this.segundo = 0;
        }
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    /*public void mostrarHora() {

        if (segundo == 59) {
            segundo = 0;
            segundo = segundo + 1;
        }else{
            System.out.println(hora + ":" + minuto + ":" + (segundo + 1));
            System.out.println(hora + ":" + minuto + ":" + (segundo + 2));
            System.out.println(hora + ":" + minuto + ":" + (segundo + 3));
        }
        
    }*/
    public void incrementarSegundo() {
        segundo++;
        if (segundo == 60) {
            segundo = 0;
            minuto++;
            if (minuto == 60) {
                minuto = 0;
                hora++;
                if (hora == 24) {
                    hora = 0;
                }
            }
        }
    }

}
