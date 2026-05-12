
package Laboratorio4;

import java.util.Date;

public class Prestamo {

    private Date fechaPrestamo;
    private Date fechaDevolucion;

    private Estudiante estudiante;
    private Libro libro;

    // CONSTRUCTOR
    public Prestamo(Estudiante estudiante,
                    Libro libro) {

        this.estudiante = estudiante;
        this.libro = libro;

        fechaPrestamo = new Date();

        fechaDevolucion = null;
    }

    public void mostrarInfo() {

        System.out.println("\n=== PRESTAMO ===");

        System.out.println(
                "Estudiante: "
                + estudiante.getNombre()
        );

        System.out.println(
                "Libro: "
                + libro.getTitulo()
        );

        System.out.println(
                "Fecha Prestamo: "
                + fechaPrestamo
        );
    }
}

