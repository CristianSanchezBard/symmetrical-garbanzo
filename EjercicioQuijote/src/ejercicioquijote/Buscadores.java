/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioquijote;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;

/**
 *
 * @author Alumno Presencial
 */
public class Buscadores {

    FileReader fr;
    FileWriter fw;
    BufferedWriter bw;
    BufferedReader br;
    FileInputStream fis;
    FileOutputStream fos;

    public void buscar(String nombreFichero) throws Exception {

        try {
            File dir = new File("");

            File[] fichero = dir.listFiles(new FilenameFilter() {
                public boolean accept(File dir, String nombre) {
                    return true;
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public int contarLineas(File f) {
        int totalLineas = 0;
        try {
            br = new BufferedReader((new FileReader(f)));
            while (br.readLine() != null) {
                totalLineas++;
            }

        } catch (Exception e) {
        }
        return totalLineas;

    }

    public void limpiarTexto (File f) {
        int numQuijotes=0;
        String cadena;
        try {
        br= new BufferedReader((new FileReader(f)));
        bw= new BufferedWriter((new FileWriter(new File ("ElQuijoteLimpio.txt"))));
        while ((cadena = br.readLine()) != null) {
            
                
            bw.write(cadena.replaceAll("\\p{Punct}", " ")+ "\n");
            bw.flush();
            }
            
        } 
        catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (Exception e) {
        }
        
    }
}
