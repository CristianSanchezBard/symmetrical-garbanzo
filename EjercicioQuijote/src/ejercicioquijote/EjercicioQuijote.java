/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioquijote;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Alumno Presencial
 */
public class EjercicioQuijote {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        Buscadores b= new Buscadores();
        File f= new File ("C:\\Users\\Alumno Presencial\\Documents\\NetBeansProjects\\EjercicioQuijote\\ElQuijote.txt");
        
        System.out.println(b.contarLineas(f));
        //b.limpiarTexto(f);
      //  System.out.println("El numero de quijotes es " + b.contarQuijotes(new File ("C:\\Users\\Alumno Presencial\\Documents\\NetBeansProjects\\EjercicioQuijote\\ElQuijote.txt"), "quijote"));
        
        
    }
    
}
