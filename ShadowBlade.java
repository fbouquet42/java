
public class ShadowBlade extends Card {

    public void execute(Player player, Player foe) {
        foe.damaged(Rand.get(7, 21));
    }

    public String display() {
        return "ShadowBlade";
    }
}
