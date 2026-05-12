/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Laboratorio4;

/**
 *
 * @author Usuario
 */
public class Pagina {
    private int Npaginas;
    private String Cpagina;
    
    public Pagina(int Npaginas, String Cpaginas){
        this.Npaginas= Npaginas;
        this.Cpagina= Cpaginas;
    }
    public void mostrarPagina(){
        System.out.println("Paginas: "+ Npaginas+": "+ Cpagina);
    }

   
}
