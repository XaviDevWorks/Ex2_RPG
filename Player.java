public class Player extends Character implements Fighter {
    public Player(String name, int level) {
        super(name, level);
    }
    public Player() {
        this(null, 0);
    }
    @Override
    public void fight(Hability hability) {
        System.out.println("El jugador " + getName() + " está luchando con la habilidad " + hability.getName());
    }
}