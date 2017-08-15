/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

/**
 *
 * @author Español
 */
public class Metodos {
    int edad=18;
    String nombre ="juan";
     String direccion ="Av. Chiclana 3444";
     public void imprimiredad(){
         System.out.println(edad);
     }
     public void imprimirnombre(){
         System.out.println(nombre);
     }
     public void imprimirdireccion(){
         System.out.println(direccion);
     }
     public void imprimiredad(int numero1){
         System.out.println(numero1);
        
     }
     public void imprimiredad(int numero2,int numero3){
         System.out.println(numero2+" "+numero3);
     }
       public void suma(int numero2,int numero3){
         System.out.println(numero2+numero3);
     }
       public void imprimirresta(int numero2,int numero3){
           int resta;
           resta =numero2-numero3;
         System.out.println(resta);
     }
    
    public static void main(String[] args) {
        System.out.println("hola mundo");
        
        
        Metodos objeto1 =new Metodos();
        Metodos Miguel = new Metodos();
        Metodos Pedro = new Metodos();
        
        Miguel.edad=25;
        Miguel.nombre = "Miguel";
        Miguel.direccion= "Av. caseros 3444";
        
        Pedro.edad=28;
        Pedro.nombre = "pedrito";
        Pedro.direccion= "Av. garay 3444";
        
        objeto1.imprimiredad();
        Miguel.imprimiredad();
        Miguel.imprimirnombre();
        Miguel.imprimirdireccion();
        
        Pedro.imprimiredad();
        Pedro.imprimirnombre();
        Pedro.imprimirdireccion();
        
        Miguel.imprimiredad(38);
        
        int numero2=23;
        Miguel.imprimiredad(numero2);
        
       
        int numero3 =20;
         Miguel.imprimiredad(numero2, numero3);
       
       
         
        Miguel.suma(numero2,numero3);
        Miguel.imprimirresta(numero2, numero3);
    }
    
    
}
