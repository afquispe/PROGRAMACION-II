/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Laboratorio4;

/**
 *
 * @author Usuario
 */
public class Horario {
    private String dias;
    private String hapertura;
    private String hcierre;
    public Horario(String dias, String hapertura,String hcierre){
        this.dias=dias;
        this.hapertura=hapertura;
        this.hcierre=hcierre;
    }
    public void mostrarHorario(){
        System.out.println("\n ===HORARIO===");
        System.out.println("Dias:" +dias);
        System.out.println("Hora de Apertura:"+hapertura);
        System.out.println("Hora de Cierre: "+hcierre);
    }
}
