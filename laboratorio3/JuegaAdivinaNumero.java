/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Laboratorio3;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class JuegaAdivinaNumero extends Juego {
    protected int numeroAdivinar;

    public JuegaAdivinaNumero(int vidas) {
        super(vidas);
    }
    public boolean validaNumero(int num){
        return num >=0 && num <=10;
    }
    protected void generaNumero() {
       numeroAdivinar = (int)(Math.random() * 11);
    }
    public void juega(){

        Scanner sc = new Scanner(System.in);

        reiniciarPartida();
        generaNumero(); // 🔥 ÚNICA generación

        System.out.println("Adivina un numero entre 0 y 10:");

        while(true){
            int intento = sc.nextInt();

            if(!validaNumero(intento)){
                System.out.println("Numero invalido. Intenta de nuevo:");
                continue;
            }

            if(intento == numeroAdivinar){
                System.out.println("¡¡Acertaste!!");
                actualizaRecord();
                break;
            }else{

                if(quitaVidas()){
                    if(intento < numeroAdivinar){
                        System.out.println("El numero es MAYOR:");
                    }else{
                        System.out.println("El numero es MENOR:");
                    }
                }else{
                    System.out.println("Te quedaste sin vidas. El número era: " + numeroAdivinar);
                    break;
                }
            }
        }
    }
}
