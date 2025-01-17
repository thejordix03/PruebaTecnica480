package Almacenamiento;

public class BlueRay extends Disco {
    public BlueRay(String brand, double capacidad) {
        super(brand, capacidad, "BluRay");
    }

    @Override
    public void almacenarDatos(String datos) {
        System.out.println("Escribiendo datos con láser en el BluRay...");
        contenido = datos;
    }

    @Override
    public void leerDatos() {
        System.out.println("Leyendo datos con láser desde el BluRay...");
        System.out.println("Contenido: " + contenido);
    }
}
