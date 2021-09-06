import java.util.*;

public abstract class PoolCard
{
    private List<Pair<Card, Integer>> _pool;
    private int _weight;

    public PoolCard()
    {
        _pool = new ArrayList<Pair<Card, Integer>>();
    }

    protected void addCard(Card card, int w) {
        _pool.add(new Pair<Card, Integer>(card, Integer.valueOf(w)));
        _weight += w;
    }

    public Card drawCard() {
        int random = Rand.get(1, _weight);
        int i = 0;

        for (Pair<Card, Integer> pair : _pool) {
            if (pair.getValue1() + i >= random)
                return pair.getValue0();
            i += pair.getValue1();
        }
        return null;
    }
}
