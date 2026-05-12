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
public class Libro {
    private String titulo;
    private String isbn;
    
    private ArrayList<Pagina> paginas;
    
    public Libro(String titulo, String isbn, String []contenidoPaginas){
        this.titulo =titulo;
        this.isbn=isbn;
        paginas = new ArrayList<>();
        
        for(int i=0; i<contenidoPaginas.length;i++){
            Pagina p = new Pagina(i+1, contenidoPaginas[i]);
            paginas.add(p);
            
        }
    }
        public void leer(){
            System.out.println("\n===LIBRO===");
            System.out.println("Titulo: "+titulo);
            System.out.println("ISBN: "+isbn);
            
            System.out.println("\n ---PAGINAS---");
            for (Pagina p: paginas){
                p.mostrarPagina();
            }
        }

    public String getTitulo() {
        return titulo;
    }

    
        
        
        
}
    
    

