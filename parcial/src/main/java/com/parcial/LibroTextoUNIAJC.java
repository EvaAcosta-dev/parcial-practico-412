package com.parcial;

public class LibroTextoUNIAJC extends LibroTexto {
    private String facultad;

    // Constructor vacío
    public LibroTextoUNIAJC() {
        super();
        this.facultad = "";
    }

    // Constructor con parámetros
    public LibroTextoUNIAJC(String titulo, String autor, int numeroEjemplares, int numeroEjemplaresPrestados, String curso, String facultad) {
        super(titulo, autor, numeroEjemplares, numeroEjemplaresPrestados, curso);
        this.facultad = facultad;
    }

    // Getters y Setters
    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
}