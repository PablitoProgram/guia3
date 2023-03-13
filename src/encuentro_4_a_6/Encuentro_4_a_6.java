/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro_4_a_6;

import java.util.Scanner;


/**
 *
 * @author User
 */
public class Encuentro_4_a_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EJEMPLO DE IF
        /*Scanner leer = new Scanner (System.in);
        
        int num1, num2;
        
        
        System.out.println("ingrese dos numeros enteros");

        
        num1 = leer.nextInt();
        
        num2 = leer.nextInt();
        
        if (num1 > 25 || num2 > 25) {
            System.out.println(" los dos o uno de los numeros es mayor a 25");
          
        } else {
            System.out.println("Ningun numero es mayor a 25");
        }  
    } */
        //SWITCH
        //variable tipo motor
        
       /* Scanner leer = new Scanner (System.in);
        
        int tipoMotor;
        
        System.out.println("ingrese el numero de opcion de motor ");
        
        tipoMotor = leer.nextInt();
        
        switch (tipoMotor) {
            case 1:
                System.out.println("La bomba es una bomba de agua");  
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor válido para tipo de bomba");
        }
        
        */
       //Ejercicio1
       /*Scanner leer = new Scanner (System.in);
       
       int num1;
       
        System.out.println("escriba un numero");
        
        num1 = leer.nextInt();
        
               
        if ( num1 % 2 == 0 ) {
            System.out.println("el num es par");
        }else {
            System.out.println("no es par");   
        }
   */ 
       //ejercicio2
       
    /*   Scanner leer = new Scanner (System.in);
       
       String palabra1, palabra2;
       palabra2 = "eureka";
               
        System.out.println("ingrese la palabra eureka ");
        
       palabra1 = leer.nextLine();
       
        if (palabra1.equals(palabra2)) {
            System.out.println("son iguales");
        } else {
            System.out.println("no son iguales");
        }
       
    */
    // ejercicio3
    
   /* Scanner leer = new Scanner (System.in);
    
    String palabra;
    
        System.out.println("Ingrese una palabra o frase de 8 de longitud");
        
        palabra = leer.nextLine();
        
        if (palabra.length() == 8) {
            System.out.println("la palabra es correcta");
        } else {
            System.out.println("la palabra es incorrecta");
        }
            
        }
     */
   // ejercicio4
   
   /* Scanner leer = new Scanner (System.in);
   
   String frase;
   
   
        System.out.println("Ingrese una frase o palabra");
        
    frase = leer.nextLine();

    //int longitud = frase.length();
    
    String a = frase.substring(0,1);
    
        if (a.equals("a")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }  
            
        }
    */
   
   // ejercicio5
    //Escriba un programa en el cual se ingrese un valor limite positivo, y a continuacion solicite numeros al usuario hasta que la suma de los numeros introducidos supere el li // mite inicial.
       
   /* Scanner leer = new Scanner (System.in);
    
    int num1, i = 0;
    
        do {
            System.out.println("Ingrese un numero");
            num1 = leer.nextInt();
            i = num1 + i;
        } while (i <= 50);
    */
   // Ejercicio6
     /*   Scanner leer = new Scanner (System.in);
        
        int num1, num2, opcion, form;
        
        String SN = null;
        
        System.out.println("Elija dos numeros: ");
        
        num1 = leer.nextInt();
        
        num2 = leer.nextInt();
        
        System.out.println("Ahora elija una opciom: 1-sumar 2-restar 3-multiplicar 4-dividir 5-salir");
        
      
            
        
        do {
              opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                 form= num1 + num2;
                    System.out.println("la suma es " + form);
                 
                break;
                case 2:
                    form= num1 - num2;
                    System.out.println("la resta da " + form); 
                break;
                case 3:
                   form= num1 * num2;
                    System.out.println ("la multiplicacion da: " + form);  
                break;
                case 4:
                     form= num1 / num2;
                    System.out.println("la divicion da: " + form);
                    break;
                case 5:    
                    System.out.println("desea salir? (S/N)");
                    
                    SN = leer.nextLine();
                    
            }
        } while (opcion != 5);
        
        
        */
     //EJERCICIO8
    /* Scanner leer = new Scanner (System.in);
           
     int num;
     
        System.out.println("Ingrese la cantidad de espacio que quiere que tenga el cuadrado");
        
     num = leer.nextInt();
     
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
        System.out.println(" ");
        for (int i = 0; i < num-2; i++) {
            System.out.print("*");
            for (int j = 0; j < num-2; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
             System.out.println(" ");
        }
        
         for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
*/
  }
