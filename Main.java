package personajes;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Personaje Orco ===");
        Juego orco = new Juego(new OrcoFactory());
        orco.mostrarPersonaje();

        System.out.println("\n=== Personaje Humano ===");
        Juego humano = new Juego(new HumanoFactory());
        humano.mostrarPersonaje();

        System.out.println("\n=== Personaje Enano ===");
        Juego enano = new Juego(new EnanoFactory());
        enano.mostrarPersonaje();

        System.out.println("\n=== Personaje Elfo ===");
        Juego elfo = new Juego(new ElfoFactory());
        elfo.mostrarPersonaje();
    }
}
