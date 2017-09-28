/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ristinolla;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javafx.scene.control.Button;

/**
 *
 * @author roman
 */
public class Tarkistaja {
    
    private List<Button> lista;
    private Map<Integer, Button> mappi;
    private boolean peliLoppu;
    
    public Tarkistaja(List<Button> lista){
        this.lista = lista;  
    }
    
    public Tarkistaja(Map<Integer, Button> mappi){
        this.mappi = mappi; //TODO
       // this.lista = new ArrayList<>();
    }
    
    public void testi(){
        for(Button value : mappi.values()){
            lista.add(value);
        }
    }
    
    public boolean kolmeMappi(){
        if(this.mappi.get(1).getText().equals(this.mappi.get(2).getText())){
            if(this.mappi.get(1).getText().equals(this.mappi.get(3).getText())){
                if(this.mappi.get(1).getText()!=" "){
                    return true;
                }
            }
        }
        if(this.mappi.get(4).getText().equals(this.mappi.get(5).getText())){
            if(this.mappi.get(4).getText().equals(this.mappi.get(6).getText())){
                if(this.mappi.get(4).getText()!=" "){
                    return true;
                }
            }
        }
        if(this.mappi.get(7).getText().equals(this.mappi.get(8).getText())){
            if(this.mappi.get(7).getText().equals(this.mappi.get(9).getText())){
                if(this.mappi.get(7).getText()!=" "){
                    return true;
                }
            }
        }
        if(this.mappi.get(1).getText().equals(this.mappi.get(4).getText())){
            if(this.mappi.get(1).getText().equals(this.mappi.get(7).getText())){
                if(this.mappi.get(1).getText()!=" "){
                    return true;
                }
            }
        }
        if(this.mappi.get(2).getText().equals(this.mappi.get(5).getText())){
            if(this.mappi.get(2).getText().equals(this.mappi.get(8).getText())){
                if(this.mappi.get(2).getText()!=" "){
                    return true;
                }
            }
        }
        if(this.mappi.get(3).getText().equals(this.mappi.get(6).getText())){
            if(this.mappi.get(3).getText().equals(this.mappi.get(9).getText())){
                if(this.mappi.get(3).getText()!=" "){
                    return true;
                }
            }
        }
        if(this.mappi.get(1).getText().equals(this.mappi.get(5).getText())){
            if(this.mappi.get(1).getText().equals(this.mappi.get(9).getText())){
                if(this.mappi.get(1).getText()!=" "){
                    return true;
                }
            }
        }
        if(this.mappi.get(3).getText().equals(this.mappi.get(5).getText())){
            if(this.mappi.get(3).getText().equals(this.mappi.get(7).getText())){
                if(this.mappi.get(3).getText()!=" "){
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean onkoTaysi(){
//        int maara = 0;
//        for(Button b : this.lista){
//            if(b.getText()!= " "){
//                maara++;
//            }
//        }
//        if(maara == 9){
//            return true;
//        }
//        return false;
        int maara = 0;
        for(Button value : this.mappi.values()){
            if(value.getText()!=" "){
                maara++;
            }
        }
        if(maara == 9){
            return true;
        }
        return false;
    }
    
    public boolean kolme(){
        if(this.lista.get(0).getText().equals(this.lista.get(3).getText())){
           if(this.lista.get(0).getText().equals(this.lista.get(6).getText())) {
               if(this.lista.get(0).getText()!=" "){
                   return true;
               }
           }
        }else if(this.lista.get(1).getText().equals(this.lista.get(4).getText())){
           if(this.lista.get(1).getText().equals(this.lista.get(7).getText())) {
               if(this.lista.get(1).getText()!=" "){
                   return true;
               }
           }
        }else if(this.lista.get(2).getText().equals(this.lista.get(5).getText())){
           if(this.lista.get(2).getText().equals(this.lista.get(8).getText())) {
               if(this.lista.get(2).getText()!=" "){
                   return true;
               }
           } // GOOD
        }else if(this.lista.get(0).getText().equals(this.lista.get(1).getText())){
           if(this.lista.get(0).getText().equals(this.lista.get(2).getText())) {
               if(this.lista.get(0).getText()!=" "){
                   return true;
               }
           }
        } else if(this.lista.get(3).getText().equals(this.lista.get(4).getText())){
           if(this.lista.get(3).getText().equals(this.lista.get(5).getText())) {
               if(this.lista.get(3).getText()!=" "){
                   return true;
               }
           }
        } else if(this.lista.get(6).getText().equals(this.lista.get(7).getText())){
           if(this.lista.get(6).getText().equals(this.lista.get(8).getText())) {
               if(this.lista.get(6).getText()!=" "){
                   return true;
               }
           }
        } else if(this.lista.get(0).getText().equals(this.lista.get(4).getText())){
           if(this.lista.get(0).getText().equals(this.lista.get(8).getText())) {
               if(this.lista.get(0).getText()!=" "){
                   return true;
               }
           }
        } else if(this.lista.get(6).getText().equals(this.lista.get(4).getText())){
           if(this.lista.get(6).getText().equals(this.lista.get(2).getText())) {
               if(this.lista.get(6).getText()!=" "){
                   return true;
               }
           }
        }
        return false;
    }
}
