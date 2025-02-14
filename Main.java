public class Main {
    public static void main(String[] args) {
        Player player = new Player("Juan", 10);
        NPC npc = new NPC("Enemigo", 5);
        Hability hability = new Hability("Fuego", Type.MAGICO, Range.CORTA);
        player.fight(hability);
        npc.fight(hability);
    }
}