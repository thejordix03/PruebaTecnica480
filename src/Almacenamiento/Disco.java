package Almacenamiento;

public abstract class Disco {
    protected String brand;
    protected double capacidad;
    protected String contenido;
    protected String tipo;

    // Constructor
    public Disco(String brand, double capacidad, String tipo) {
        this.brand = brand;
        this.capacidad = capacidad;
        this.tipo = tipo;
        this.contenido = "Vacío"; // Contenido inicial
    }

    public void gírarDisco() {
        System.out.println(tipo + " girando...");
    }

    public void reportarInformación() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Marca: " + brand);
        System.out.println("Capacidad: " + capacidad + " GB");
        System.out.println("Contenido: " + contenido);
    }

    // Métodos abstractos que cada subclase implementará
    public abstract void almacenarDatos(String datos);
    public abstract void leerDatos();
}
