/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ristinolla;

/**
 *
 * @author roman
 */
public enum Pelaaja {
    X("X"), 
    O("O");
    
    private String arvo;
    
    private Pelaaja(String arvo){
        this.arvo = arvo;
    }
    
    public void setArvo(String arvo){
        this.arvo = arvo;
    }
    
    public String getArvo(){
        return this.arvo;
    }
}
