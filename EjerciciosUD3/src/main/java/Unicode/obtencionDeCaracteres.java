/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unicode;

/**
 *
 * @author alu_tarde
 */
public class obtencionDeCaracteres {

    public static void main(String[] args) {
        String cad1 = "Mi nombre es Pepa";
        String cad2 = "        Hola   \n";
        
        System.out.println(cad1.substring(3, 9));
        
        //Strip elimina los espacios del final y principio en blanco e imprime solo lo que haya
        System.out.println(cad2.strip());
        
        //Quita los espacios blancos del principio
        System.out.println(cad2.stripLeading());
        
        //Quita los espacios blancos del final
        System.out.println(cad2.stripTrailing());
    }

}
