package Almacenamiento;

public class Lp extends Disco {

    public Lp(String brand, double capacidad) {
        super(brand, capacidad, "LP (Disco de Vinilo)");
    }

    @Override
    public void almacenarDatos(String datos) {
        System.out.println("Grabando datos en el LP...");
        contenido = datos;
    }

    @Override
    public void leerDatos() {
        System.out.println("Reproduciendo datos desde el LP...");
        System.out.println("Contenido: " + contenido);
    }
}
