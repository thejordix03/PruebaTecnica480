package Almacenamiento;

public class DiscoDuro extends Disco {
    public DiscoDuro(String brand, double capacidad) {
        super(brand, capacidad, "Disco Duro");
    }

    @Override
    public void almacenarDatos(String datos) {
        System.out.println("Escribiendo datos con cabezal magnético en el disco duro...");
        contenido = datos;
    }

    @Override
    public void leerDatos() {
        System.out.println("Leyendo datos con cabezal magnético desde el disco duro...");
        System.out.println("Contenido: " + contenido);
    }
}
