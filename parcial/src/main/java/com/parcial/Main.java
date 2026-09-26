package com.parcial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n SISTEMA DE GESTION DE BIBLIOTECA \n");
        System.out.println("\n--- LIBRO 1 ---");

        Libro libro1 = new Libro(
                "El principito",
                "Antoine de Saint-Exupéry",
                10,
                2
        );

        libro1.mostrarInformacion();

        System.out.println("\n--- LIBRO 2 ---");

        Libro libro2 = new Libro();

        System.out.print("Ingrese el título: ");
        libro2.setTitulo(scanner.nextLine());

        System.out.print("Ingrese el autor: ");
        libro2.setAutor(scanner.nextLine());

        System.out.print("Ingrese el número de ejemplares: ");
        libro2.setNumeroEjemplares(scanner.nextInt());

        System.out.print("Ingrese el número de ejemplares prestados: ");
        libro2.setNumeroEjemplaresPrestados(scanner.nextInt());

        scanner.nextLine();
        System.out.println("\nInformación del libro 2:");
        libro2.mostrarInformacion();

        System.out.println("\n LIBRO DE TEXTO UNIAJC \n");
        LibroTextoUNIAJC libroUni = new LibroTextoUNIAJC ("Programación Orientada a Objetos", "Ing.Juan Caicedo", 10, 2, "Programación II", "Ingeniería");
        libroUni.mostrarInformacion();
        System.out.println("Curso asociado: " + libroUni.getCurso());
        System.out.println("Facultad: " + libroUni.getFacultad());

        // Prestamo y devolucion
        System.out.println("\nPrestamo 1: " + (libroUni.prestamo() ? "Prestamo exitoso" : "No disponible"));
        System.out.println("Prestamo 2: " + (libroUni.prestamo() ? "Prestamo exitoso" : "No disponible"));
        libroUni.mostrarInformacion();

        System.out.println("\nDevolucion 1: " + (libroUni.devolucion() ? "Devolucion exitosa" : "Sin ejemplares prestados"));
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