
public class PoisonousArrow extends Card {

    public void execute(Player player, Player foe) {
        foe.addState(new PoisonousState(foe));
    }

    public String display() {
        return "PoisonousArrow";
    }
}
