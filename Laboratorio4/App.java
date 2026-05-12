/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Laboratorio4;

/**
 *
 * @author Usuario
 */
public class App {
    public static void main(String[]args){
        Autor a1=new Autor("Gabriel Grcia Marquez","Colombiano");
        Autor a2=new Autor("Mario Vargas Losa","Peruano");
        
        String[] paginasLibro1 ={
          "Introduccion",
          "Capitulo 1",
          "Capitulo 2"
        };
        
        String[] paginasLibro2 ={
          "Inicio",
          "Desarrollo",
          "Final"
        };
        
        Libro l1=new Libro("Cien años de soledad","ISBN-111",paginasLibro1);
        Libro l2=new Libro("La ciudad y los perros","ISBN-222",paginasLibro2);
        
         Estudiante e1=new  Estudiante("2026001","Alejandra");
         Estudiante e2=new  Estudiante("2026002","Estrella");
         Estudiante e3=new  Estudiante("2026003","Ivana");
         
         
        Biblioteca b= new Biblioteca("Biblioteca Central UMSA",
                                      "Lunes a Viernes",
                                      "08:00",
                                      "20:00");
        
        
        b.agregarLibro(l1);
        b.agregarLibro(l2);
        b.agregarAutor(a1);
        b.agregarAutor(a2);
        b.prestarLibro(e2, l1);
        b.mostrarEstado();
        
        l1.leer();
        b.cerrarBiblioteca();
    }
    
}
