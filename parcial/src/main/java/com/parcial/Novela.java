package com.parcial;

public class Novela extends Libro {
    private String tipo;

    // Constructor vacío
    public Novela() {
        super();
        this.tipo = "";
    }

    // Constructor con parámetros
    public Novela(String titulo, String autor, int numeroEjemplares, int numeroEjemplaresPrestados, String tipo) {
        super(titulo, autor, numeroEjemplares, numeroEjemplaresPrestados);
        this.tipo = tipo;
    }

    // Getters y Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}