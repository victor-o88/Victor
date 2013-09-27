/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ej16;

/**
 *
 * @author Administrador
 */
public class Libros implements Comparable{
    
    private String nom_lib;
    private String ISDN;
    private String nom_aut;
    

    public String getNomLi(){
        return this.nom_lib;
    }
    public void setNomLi(String nom_lib){
        this.nom_lib = nom_lib;
    }

    public String getISDN(){
        return this.ISDN;
    }
    public void setISDN(String ISDN){
        this.ISDN = ISDN;
    }
    
    public String getNomAut(){
        return this.nom_aut;
    }
    public void setNomAut(String nom_aut){
        this.nom_aut = nom_aut;
    }
    
    public String toString(){
        return "|  "+this.getNomAut()+"  |  "+this.getNomLi()+"  |";
    }
    
    public Libros(){
        
    }
    
    public Libros(String nom_lib, String ISDN, String nom_aut) {
        this.nom_lib = nom_lib;
        this.ISDN = ISDN;
        this.nom_aut = nom_aut;

    }

    @Override
    public int compareTo(Object o) {
        Libros lib = (Libros) o;
        String nomObjeto = lib.nom_aut.toLowerCase();
        String nomThis = this.nom_aut.toLowerCase();
        return(nomThis.compareTo(nomObjeto));

    }
    
    
}
