/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofuturo;

/**
 *
 * @author jesusbinadetrives
 */
public class Proyectofuturo {

// Jesus Binade Trives - proyecto futuro
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Estudiante: "+args[0]);
        System.out.println("Modulos matriculados: "+args[1]);
        System.out.println("Horas semanales de estudio: "+args[2]);
        
        // TODO code application logic here
    }
   
    
    private static String veredicto(String valor1, String valor2){
        
 
        valor1 = "10";
        valor2 = "5";
     
        System.out.println(valor1.equals(valor2));
        
        if (valor1.equals(valor2)){
            return "Bien. Pero una de estudio para cada módulo puede ser insuficiente.";
        }
        
        if (Integer.valueOf(valor1) < Integer.valueOf(valor2)){
            return "Poco tiempo de estudio. Debes dedicar más tiempo.";
        }
        
        return "Ideal. Trabajas los contenidos en casa.";
        
        
        
    }
       
   }
