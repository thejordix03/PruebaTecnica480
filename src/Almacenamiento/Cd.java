package Almacenamiento;


public class Cd extends Disco {
    public Cd(String brand, double capacidad) {
        super(brand, capacidad, "CD");
    }

    @Override
    public void almacenarDatos(String datos) {
        System.out.println("Escribiendo datos con láser en el CD...");
        contenido = datos;
    }

    @Override
    public void leerDatos() {
        System.out.println("Leyendo datos con láser desde el CD...");
        System.out.println("Contenido: " + contenido);
    }
}
