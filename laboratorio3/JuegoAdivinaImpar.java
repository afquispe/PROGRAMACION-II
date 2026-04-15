/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Laboratorio3;

/**
 *
 * @author Usuario
 */
public class JuegoAdivinaImpar extends JuegaAdivinaNumero {
    public JuegoAdivinaImpar(int vidas){
        super(vidas);
        
    }
    @Override
    public boolean validaNumero(int num) {

        if (num < 0 || num > 10) {
            System.out.println("Número fuera de rango.");
            return false;
        }

        if (num % 2 == 0) { // <-- aquí detecta pares
            System.out.println("Error: debes ingresar un número IMPAR.");
            return false;
        }

        return true;
    }
    
    @Override
    protected void generaNumero() {
        numeroAdivinar = (int)(Math.random() * 5) * 2 + 1; // impares
    }
}
