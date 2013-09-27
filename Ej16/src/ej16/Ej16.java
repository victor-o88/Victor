/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ej16;

import java.io.*;
import java.util.*;

/**
 *
 * @author Administrador
 */
public class Ej16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int op;
        Gestion gestion = new Gestion();
        String nom_lib, ISDN, nom_aut;
        
        do{
            System.out.println("1. Agregar libro");
            System.out.println("2. Listar libros");
            System.out.println("3. Salir");
            
            op=Integer.parseInt(bf.readLine());
            
            switch(op)
            {
                case 1:
                    System.out.println("Nombre Libro");
                    nom_lib=bf.readLine();
                    System.out.println("ISDN");
                    ISDN=bf.readLine();
                    System.out.println("Nombre Autor");
                    nom_aut=bf.readLine();
   
                    gestion.addLib(nom_lib, ISDN, nom_aut);
                    break;
                
                case 2:
                    gestion.Listlibro();
                    break;
           
            }
        }while(op!=3);
    }
}
