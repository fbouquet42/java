
public class Hate extends Card {

    public void execute(Player player, Player foe) {
        foe.damaged(Rand.get(8, 11));
        player.healed(Rand.get(1, 10));

    }

    public String display() {
        return "Hate";
    }
}
