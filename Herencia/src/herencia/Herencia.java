/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.Date;

/**
 *
 * @author GARACHIN
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado e1 = new Empleado(25000, "Juan");
        System.out.println("Imprimir el objeto Empleado1");
        System.out.println(e1);
        
        Empleado e2 = new Empleado(15000, "Pedro");
        e2.setEdad(25);
        e2.setGenero('M');
        e2.setDireccion("Bogota, Colombia");
        System.out.println("\nImprimimos el objeto Empleado2");
        System.out.println(e2);
        
        Cliente c1 = new Cliente(new Date(), false);
        System.out.println("\nImprimimos el objeto Cliente1");
        System.out.println(c1);
        
        //completamos el objeto Persona asociado a este objeto cliente
        c1.setNombre("Karla");
        c1.setEdad(22);
        c1.setGenero('F');
        c1.setDireccion("Mexico, DF");
        System.out.println("\nVolvemos a imprimir el objeto cliente1");
        System.out.println(c1);
    }
    
}
