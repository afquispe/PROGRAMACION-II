/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Laboratorio4;
import java.util.ArrayList;
/**
 *
 * @author Usuario
 */
public class Biblioteca {
    private String nombre;
    private ArrayList <Libro> libros;
    private ArrayList <Autor> autores;
    private ArrayList<Prestamo> prestamos;
    private Horario horario;
    public Biblioteca(String nombre, String dias, String hapertura , String hcierre) {
        this.nombre=nombre;
        libros = new ArrayList<>();
        autores =new ArrayList<>();
        prestamos = new ArrayList<>();
        horario = new Horario(dias, hapertura , hcierre);
    }
    public void agregarLibro(Libro libro){
        libros.add(libro);
    }
    public void agregarAutor(Autor autor){
        autores.add(autor);
    }
    public void prestarLibro(Estudiante estudiante, Libro libro){

    Prestamo p = new Prestamo(estudiante, libro);

    prestamos.add(p);

    System.out.println("Prestamos realizado correctamente");
}
    public void mostrarEstado(){
        System.out.println("\n ===BIBLIOTECA===");
        System.out.println("Nombre:"+nombre);
        System.out.println("\n ----HORARIO----");
        horario.mostrarHorario();
        System.out.println("\n---LIBROS---");
        for(Libro l:libros){
            System.out.println(l.getTitulo());
        }
        System.out.println("\n ---AUTORES---");
        for(Autor a:autores){
            System.out.println(a.getNombre());
        }
        System.out.println("\n---PRESTAMOS---");
        for(Prestamo p:prestamos){
            p.mostrarInfo();
        }
    }
        
    
    public void cerrarBiblioteca() { 
            
        System.out.println("\nLa biblioteca esta cerrando...");
        prestamos.clear();
        System.out.println("Todos los prestamos fueron eliminados.");
    }
}
    

