package com.company;

public class Libro {
    /*
        Crea una clase Libro con los métodos: préstamo, devolución y toString, cuyo prototipo
        debe ser: public String toString(). Este método debe retornar una cadena que
        represente al objeto. Por ejemplo: si la clase tiene los atributos: título, isbn y autor, una
        cadena que represente a un libro podría ser: “Harry Potter, 9780545582889, Rowling,
        J. K.”. La clase contendrá un constructor por defecto, un constructor con parámetros y
        los métodos de acceso.
        ● Agregar la línea @Override justo arriba del encabezado del método toString. Luego,
        cambiar el nombre del método por: tostring (td en minúscula). ¿Qué sucede?
    */

    private String titulo;
    private int isbn;
    private String autor;

    public Libro() {

    }

    public Libro(Libro libro) {
        this.titulo = libro.getTitulo();
        this.isbn = libro.getIsbn();
        this.autor = libro.getAutor();
    }

    public Libro(String titulo, int isbn, String autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
    }

    public void prestamo() {

    }

    public void devolucion() {

    }

    @Override
    public String toString() {
        return this.titulo + ", " + this.isbn + ", " + this.autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

}
