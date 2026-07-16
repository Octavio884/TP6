class Libro {
    private String titulo;
    private String autor;
    private int numeroEjemplares;
    private int numeroPrestados;
    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.numeroEjemplares = 0;
        this.numeroPrestados = 0;
    }

    public Libro(String titulo, String autor, int numeroEjemplares, int numeroPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
        this.numeroPrestados = numeroPrestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }

    public void setNumeroEjemplares(int numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }

    public int getNumeroPrestados() {
        return numeroPrestados;
    }

    public void setNumeroPrestados(int numeroPrestados) {
        this.numeroPrestados = numeroPrestados;
    }

    public boolean Prestar() {
        if (this.numeroEjemplares > this.numeroPrestados) {
            this.numeroPrestados++;
            return true;
        }

        return false;
    }

    public boolean Devolver() {
        if (this.numeroPrestados > 0) {
            this.numeroPrestados--;
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "Libro: '" + titulo + "'\n" +
               "Autor: " + autor + "\n" +
               "Ejemplares totales: " + numeroEjemplares + "\n" +
               "Ejemplares prestados: " + numeroPrestados + "\n" +
               "Ejemplares disponibles: " + (numeroEjemplares - numeroPrestados);
    }

    public static void main(String[] args) {

        Libro L1 = new Libro("El Principito", "A. de Saint-Exupéry", 2, 1);

        System.out.println("--- Estado Inicial ---");
        System.out.println(L1);
        System.out.println();

        System.out.println("Intentando prestar otro ejemplar...");
        if (L1.Prestar()) {
            System.out.println("Préstamo exitoso!");
        } else {
            System.out.println("Error: No hay ejemplares disponibles.");
        }

        System.out.println(L1);
        System.out.println();

        System.out.println("Intentando prestar un tercer ejemplar...");
        if (L1.Prestar()) {
            System.out.println("Préstamo exitoso!");
        } else {
            System.out.println("Error: No hay ejemplares disponibles.");
        }

        System.out.println();

        System.out.println("Devolviendo un ejemplar...");
        if (L1.Devolver()) {
            System.out.println("Devolución procesada con éxito.");
        } else {
            System.out.println("Error: No hay libros prestados para devolver.");
        }

        System.out.println(L1);
    }
}