package Almacenamiento;


public class MainDiscos {
    public static void main(String[] args) {
        Cd cd = new Cd("Sony", 0.7);
        DiscoDuro discoDuro = new DiscoDuro("Mundo Digital", 1024);
        Lp lp = new Lp("Metamark", 0.4);
        BlueRay bluRay = new BlueRay("Samsung", 27);


        System.out.println("\n=== Disco Duro ===");
        discoDuro.gírarDisco();
        discoDuro.almacenarDatos("Documentos importantes");
        discoDuro.leerDatos();
        discoDuro.reportarInformación();

        System.out.println("=== CD ===");
        cd.gírarDisco();
        cd.almacenarDatos("Música clásica");
        cd.leerDatos();
        cd.reportarInformación();

        System.out.println("\n=== BluRay ===");
        bluRay.gírarDisco();
        bluRay.almacenarDatos("Película en HD");
        bluRay.leerDatos();
        bluRay.reportarInformación();

        System.out.println("\n=== LP ===");
        lp.gírarDisco();//Si lees esto,que tengas un buen dia!
        lp.almacenarDatos("Jazz antiguo");
        lp.leerDatos();
        lp.reportarInformación();


    }
}
