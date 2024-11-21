/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioCuentaCorriente;

/**
 *
 * @author abdelhachim
 */
public class Principal {
    public static void main(String[] args) {

        CuentaCorriente c1, c2, c3; //= new CuentaCorriente("123456789P", "Abdel", 0);

        //c1.sacarDinero(10);
        //c1.ingresarDinero(20, 100);
        //c1.mostrarInformacion();

        System.out.println("");
        //c1 = new CuentaCorriente("99999999-R", "Pepita", g1 );
        //c2 = new CuentaCorriente("98765431-Q", "Ana", g1);
        c3 = new CuentaCorriente("12345678-A", "Sancho");
        //c2.ingresarDinero(800, 100);
       // c2.sacarDinero(200);
        //c2.mostrarInformacion();
        
        
        //c3.saldo = 2000;
        c3.setSaldo(2000);
        c3.dni = "11111111t";
        c3.nombre = "Manuel";
        
        CuentaCorriente c4 = new CuentaCorriente("123569874T", "Abdel", 20);
        
        Gestor g1 = new Gestor ("Antonio Gonzalez", "666 555 444");
        Gestor g2 = new Gestor ("Abdel Hachim", "666 777 888", 10000.0);
        
        

    }

}
