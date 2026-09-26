package com.parcial;
public class LibroTexto extends Libro {
    private String curso;

    public LibroTexto() {
        super(); // Llama al constructor de la clase padre
        this.curso = "";
    }

    // Constructor con parámetros
    public LibroTexto(String titulo, String autor, int numeroEjemplares, int numeroEjemplaresPrestados, String curso) {
        super(titulo, autor, numeroEjemplares, numeroEjemplaresPrestados); // Llama al constructor de la clase padre
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
