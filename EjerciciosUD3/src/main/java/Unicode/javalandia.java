/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unicode;

import java.util.Scanner;

/**
 *
 * @author alu_tarde
 */
/*Los habitantes de Javalandia tienen un idioma algo extraño; 
cuando hablan siempre comienzan sus frases con “Javalín, javalón”, 
para después hacer una pausa más o menos larga 
(la pausa se representa mediante espacios en blancos y/o tabuladores) y, 
a continuación, expresan el mensaje. 
Existe un dialecto que no comienza sus frases con la muletilla anterior, 
pero siempre las termina con una pausa, más o menos prolongada, y la coletilla “javalén, len, len”. 
Se pide diseñar un traductor que, en primer lugar, 
nos diga si la frase introducida está escrita en el idioma de Javalandia 
(en cualquiera de sus dialectos) y, en caso afirmativo, nos muestre sólo el mensaje sin muletillas.
*/
public class javalandia {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        final String prefijo = "Javalín, javalón";
        final String sufijo = "javalén, len, len";
        String entrada = "";
        
        System.out.println("Escribe la frase");
        entrada = sc.nextLine();
        boolean idiomaJavalandia = false;
        
        if (entrada.startsWith(prefijo)){
            idiomaJavalandia = true;
            entrada = entrada.substring(prefijo.length());
            entrada = entrada.stripLeading();
            
        }else if(entrada.endsWith(sufijo)){
            idiomaJavalandia = true;
            entrada = entrada.substring(0, entrada.length() - sufijo.length());
            entrada = entrada.stripTrailing();
            
        }
        
        if (idiomaJavalandia) {
            entrada = entrada.strip();
            System.out.println(entrada);            
        }else{
            System.out.println("No está escrito en el idioma de Javalandia");
        }
        
    }
    
}
