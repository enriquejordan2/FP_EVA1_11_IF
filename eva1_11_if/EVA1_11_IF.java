/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_if;

import java.util.Scanner;

/**
 *
 * @author Jose Enrique
 */
public class EVA1_11_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //LOGICA BOOLEANA----> OPCIONES VERDADERAS O FALSAS
        int edad;
        Scanner captu = new Scanner(System.in);
        System.out.println("Captura Edad:");
        edad =captu.nextInt();
       //DETERMINA SI ES UN ADULTO O NO
        //Las operaciones logicas solo generan como 
        //Resultado un verdaderp(True) o un Falso(False)
        // si son varias instrucciones, hay que
           //aguparlas con llaves
    //MAYOR >==18 
    if(edad >=18){ //Bloque para el verdadero 
       System.out.println("Es un adulto");   
    }else{ //Bloque para el falso
       System.out.println("Menor de edad");

    
    }
    
  }

}