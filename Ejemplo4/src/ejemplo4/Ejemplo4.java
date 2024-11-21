/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo4;

/**
 *
 * @author alu_tarde
 */
public class Ejemplo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        short x = 7;
        int y = 5;
        float f1 = 13.5f;
        float f2 = 8f;
        double d1 = 4.5;
        char c1 = '6';
        boolean b1 = true;

        System.out.printf("%s", "Hola\n");
        System.out.printf("un valor entero tipo short: %d\n", x);
        System.out.printf("un valor entero tipo int: %d\n", y);
        System.out.printf("%d", x / y);
        System.out.printf("\n");
        System.out.printf("Ejemplo sin formato\n");
        System.out.printf("Tambien se pueden poner literales: %d\n", 5);
        //No se puede asignar un valor int a un flotante
        //System.out.printf("%f", x/y);
        System.out.printf("Un valor real tipo float: %f\n", f1);
        System.out.printf("%f\n", f1 / f2);
        System.out.printf("Un valor real tipo double: %f\n", d1);
        System.out.printf("%f\n", f1 / d1);
        //System.out.printf("caracter: %c\n", x/y);
        System.out.println("El valor de x es " + x + " y el valor de y es " + y);
    }

}
