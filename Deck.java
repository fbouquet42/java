import java.util.*;

public class Deck
{
    private List<Card> _deck;
    private PoolCard _pool;

    public Deck(PoolCard pool) {
        _pool = pool;
        _deck = new ArrayList<Card>();
    }

    public Card get(int i) {
        return _deck.get(i);
    }

    public Card remove(int i) {
        return _deck.remove(i);
    }
    
    public void drawCard() {
        _deck.add(_pool.drawCard());
    }

    public int size() {
        return _deck.size();
    }
}
