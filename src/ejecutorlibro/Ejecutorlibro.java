/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejecutorlibro;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Ejecutorlibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int eleccion,nlibros;
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("cuantos libros desea ingresar");
        nlibros= entrada.nextInt();
        
        ArrayList<libro> obj1= new ArrayList<>();
      
      for(int i=0; i<nlibros; i++){
           System.out.println("Que tipo de libro quieres?:\n1: libros de texto\n2: libros de investigacion\n3: Novelas");
        eleccion=entrada.nextInt();
        
        String titulo, autor, curso, facultad, genero;
        double precio;
        
        switch(eleccion){
            case 1:
                System.out.println("Titulo:");
                titulo=entrada.next();
                entrada.nextLine();
                System.out.println("Autor:");
                autor=entrada.next();
                entrada.nextLine();
                System.out.println("Precio:");
                precio=entrada.nextDouble();
                System.out.println("curso o programa al que pertenece:");
                curso=entrada.next();
                entrada.nextLine();
                System.out.println("");
                System.out.println("");
                System.out.println("");
                
                
                obj1.add(new librosdetexto(titulo, autor, precio, curso));
                break;
                
            case 2:
                 System.out.println("Titulo:");
                titulo=entrada.next();
                entrada.nextLine();
                System.out.println("Autor:");
                autor=entrada.next();
               entrada.nextLine();
                System.out.println("Precio:");
                precio=entrada.nextDouble();
                System.out.println("facultad que lo publica:");
                facultad=entrada.next();
                entrada.nextLine();
                System.out.println("");
                System.out.println("");
                System.out.println("");
                
                
                obj1.add(new librosinvestigacion(titulo, autor, precio, facultad));
                break;
                
            case 3:
                 System.out.println("Titulo:");
                titulo=entrada.next();
                entrada.nextLine();
                System.out.println("Autor:");
                autor=entrada.next();
               entrada.nextLine();
                System.out.println("Precio:");
                precio=entrada.nextDouble();
                System.out.println("genero literario:");
                genero=entrada.next();
                entrada.nextLine();
                System.out.println("");
                System.out.println("");
                System.out.println("");
                
                
                obj1.add(new novelas(titulo, autor, precio, genero));
                break;
                
                default:
                System.out.println("opcion no valida");
                break;
        }
      }

      
      for(libro lib : obj1){
          lib.calcularprecio();
          System.out.println(lib.toString());
          System.out.println("");
      }
        
    }
    
}
