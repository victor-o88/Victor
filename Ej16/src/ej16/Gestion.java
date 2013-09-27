/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ej16;

import java.util.TreeSet;


/**
 *
 * @author Administrador
 */
public class Gestion {

    TreeSet<Libros> Gestion = new TreeSet<Libros>(); 


    public void addLib(String nom_lib, String ISDN, String nom_aut){
            Libros l = new Libros();
            l.setNomLi(nom_lib);
            l.setISDN(ISDN);
            l.setNomAut(nom_aut);
            
            Gestion.add(l);

     }
    
    public void Listlibro(){
        for (Libros lib : Gestion) {
            System.out.println(lib);
        }
    }
    
}
