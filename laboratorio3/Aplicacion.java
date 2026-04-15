/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Laboratorio3;

/**
 *
 * @author Usuario
 */
public class Aplicacion {
    public static void main(String[] args) {

        // Crear instancia del juego con, por ejemplo, 3 vidas
        JuegaAdivinaNumero juego1 = new JuegaAdivinaNumero(3);
        JuegoAdivinaPar juego2 = new JuegoAdivinaPar(3);
        JuegoAdivinaImpar juego3 = new JuegoAdivinaImpar(3);
        
        
        // Llamar al método juega
        System.out.println("===JUEGO NORMAL===");
        juego1.juega();
        System.out.println("\n=== JUEGO PARES ===");
        juego2.juega();
        System.out.println("\n=== JUEGO IMPARES ===");
        juego3.juega();
        
    }
    
}