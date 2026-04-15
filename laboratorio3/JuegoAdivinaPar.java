/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Laboratorio3;

/**
 *
 * @author Usuario
 */
public class JuegoAdivinaPar extends JuegaAdivinaNumero {
    public JuegoAdivinaPar(int vidas){
        super(vidas);
    }

    /**
     *
     * @param num
     * @return
     */
    @Override
    public boolean validaNumero(int num){
       if(!(num >= 0 && num <= 10)){
           return false;
       } 
       if (num % 2 !=0){
           System.out.println("Error: el numero debe ser PAR");
           return false;
       }
       return true;
    }
    
    @Override
    protected void generaNumero() {
        numeroAdivinar = (int)(Math.random() * 6) * 2; // pares
    }
    
    
    
}
