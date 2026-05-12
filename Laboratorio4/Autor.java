/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Laboratorio4;

/**
 *
 * @author Usuario
 */
public class Autor {
    private String nombre;
    private String nacionalidad;
    
    public Autor(String nombre, String nacionalidad){
        this.nombre=nombre;
        this.nacionalidad=nacionalidad;
    }
    public void mostarInfo(){
        System.out.println("\n===AUTOR===");
        System.out.println("Nombre:"+nombre);
        System.out.println("Nacionalidad:"+nacionalidad);
    }

    public String getNombre() {
        return nombre;
    }
    
    
}
