package personajes;

public class Juego {
    private Cuerpo cuerpo;
    private Arma arma;
    private Montura montura;
    private Armadura armadura;

    public Juego(PersonajeFactory factory) {
        this.cuerpo = factory.crearCuerpo();
        this.arma = factory.crearArma();
        this.montura = factory.crearMontura();
        this.armadura = factory.crearArmadura();
    }

    public void mostrarPersonaje() {
        cuerpo.mostrar();
        arma.mostrar();
        montura.mostrar();
        armadura.mostrar();
    }
}
