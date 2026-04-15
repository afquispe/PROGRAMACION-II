/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Laboratorio3;

/**
 *
 * @author Usuario
 */
public class Juego {
    protected int numeroVidas;
    protected int record;
    
    public Juego(int vidas){
        this.numeroVidas=vidas;
        this.record=0;
    }
    public void reiniciarPartida(){
        
    }
    public void actualizaRecord(){
        if(numeroVidas>record){
            record=numeroVidas;
            System.out.println("Nuevo récord: "+record);
        }
    }
    public boolean quitaVidas(){
        numeroVidas --;
        if(numeroVidas>0){
            System.out.println("Te quedan"+numeroVidas+" vidas");
            return true;
        }else{
            System.out.println("No te quedan vidas");
            return false;
        }
    }
    
}
