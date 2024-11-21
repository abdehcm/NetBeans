/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioClaseTexto;

/**
 *
 * @author abdelhachim
 */
/*Diseñar la clase Texto que gestiona una cadena de caracteres con algunas caracterśticas:
La cadena de caracteres tendrá una longitud máxima que se especifica en el constructor.
Permite añadir un carácter al principio o al final, siempre y cuando no se exceda la longitud máxima, 
es decir, exista espacio disponible.
Igualmente, permite añadir una cadena, al principio o al final del texto, 
siempre y cuando no se rebase el tamaño establecido.
Es necesario saber cuántas vocales (mayúsculas y minúsculas) hay en el texto.
Cada objeto de tipo Texto tiene que conocer la fecha en la que se creó, 
así como la fecha y hora de la última modificación efectuada.
Deberá existir un método que muestre la información que gestiona cada texto.*/

public class Principal {

    public static void main(String[] args) {
        Texto t = new Texto(5);
        t.mostrar();
        t.addPrincipio("Ho");
        t.addPrincipio(";");
        t.addFinal("La");
        t.addFinal("c");

    }

}
