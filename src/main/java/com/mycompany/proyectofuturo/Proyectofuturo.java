
package com.mycompany.proyectofuturo;


public class Proyectofuturo {

    public static void main(String[] args) {
        
        System.out.println("Estudiante: " + args[0]);
      
        System.out.println(veredicto(args[2], args[1]));
    }


    private static String veredicto(String valor1, String valor2) {
       
    if (valor1.equals(valor2)) {
    return "Bien, pero necesitas esforzarte algo más.";
    }
    if (Integer.valueOf(valor1) < Integer.valueOf(valor2)){
    return "Poco tiempo de estudio. Necesitar dedicar más tiempo.";
    }
    return "Genial. Trabajas bien en casa.";
        
       
    }
    
}    