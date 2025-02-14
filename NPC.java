public class NPC extends Character implements Fighter {
    public NPC(String name, int level) {
        super(name, level);
    }
    public NPC() {
        this(null, 0);
    }
    @Override
    public void fight(Hability hability) {
        System.out.println("El NPC " + getName() + " está luchando con la habilidad " + hability.getName());
    }
}