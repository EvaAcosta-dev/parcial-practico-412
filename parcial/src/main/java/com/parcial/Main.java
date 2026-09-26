package com.parcial;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n SISTEMA DE GESTION DE BIBLIOTECA \n");
        System.out.println("\n LIBRO DE TEXTO UNIAJC \n");
        LibroTextoUNIAJC libroUni = new LibroTextoUNIAJC ("Programación Orientada a Objetos", "Ing.Juan Caicedo", 10, 2, "Programación II", "Ingeniería");
        LibroUni.mostrarInformacion();
        System.out.println("Curso asociado: " + libroUni.getCurso());
        System.out.println("Facultad: " + libroUni.getFacultad());

        // Prestamo y devolucion
        System.out.println("\nPrestamo 1: " + (libroUni:prestamo() ? "Prestamo exitoso" : "No disponible"));
        System.out.println("Prestamo 2: " + (libroUni:prestamo() ? "Prestamo exitoso" : "No disponible"));
        libroUni.mostrarInformacion();

        System.out.println("\nDevolucion 1: " + (libroUni:devolucion() ? "Devolucion exitosa" : "Sin ejemplares prestados"));
        libroUni.mostrarInformacion();

        System.out.println("\n NOVELA \n");
        Novela miNovela = new Novela("Cien años de soledad", "Gabriel García Márquez", 5, 1, "Realismo mágico");
        miNovela.mostrarInformacion();
        System.out.println("Tipo: " + miNovela.getTipo());

        // Prestamo y devolucion
        System.out.println("\nPrestamo 1: " + (miNovela.prestamo() ? "Prestamo exitoso" : "No disponible"));
        System.out.println("Prestamo 2: " + (miNovela.prestamo() ? "Prestamo exitoso" : "No disponible"));
        miNovela.mostrarInformacion();

        System.out.println("\nDevolucion 1: " + (miNovela.devolucion() ? "Devolucion exitosa" : "Sin ejemplares prestados"));
        System.out.println("Devolucion 2: " + (miNovela.devolucion() ? "Devolucion exitosa" : "Sin ejemplares prestados"));
        System.out.println("Devolucion extra: " + (miNovela.devolucion() ? "Devolucion exitosa" : "Sin ejemplares prestados"));
        miNovela.mostrarInformacion();
    }
}