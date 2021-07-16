package test;
import java.util.Scanner;



public class Menu {

    public Menu() {
    }
    
    public int MenuPrincipal() {
        int entrada;
        Scanner opcion = new Scanner(System.in);   
        do{ 
           System.out.println(" ");
           System.out.println("Ingresa el numero de la accion que quieres relizar");
           System.out.println("1. Crear archivo.");
           System.out.println("2. Insertar datos.");
           System.out.println("3. Leer datos.");
           System.out.println("4. Cerrar archivo.");
           System.out.println("5. Salir del programa.");
           entrada =opcion.nextInt();
        }while(entrada>5 || entrada <1 );


        return entrada;
    }
     
}
