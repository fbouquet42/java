import java.util.*;

public class Player {
    private String _name;

    private int _life = 100;
    protected List<State> _states;
    protected Deck _deck;

    public void execute(int command, Player foe) {
        _deck.get(command - 1).execute(this, foe);
        _deck.remove(command);
        _deck.drawCard();
    }

    public String getActionList() {
        String actionList = "";

        for (int i = 0; i < _deck.size(); i++) {
            actionList += String.valueOf((i+1)) + ")"+ _deck.get(i).display() + " ";
        }
        return actionList;
    }

    public Player(String name, PoolCard pool) {
        _name = name;
        _deck = new Deck(pool);
        _states = new ArrayList<State>();
        for (int i = 0; i < 3; i++)
            _deck.drawCard();
    }

    public void damaged(int dmg) {
        _life -= dmg;
    }

    public void healed(int care) {
        _life += care;
    }

    public int getLife() {
        return _life;
    }

    public void addState(State newState) {
        _states.add(newState);
    }

    public void update()
    {
        for (int i = _states.size() - 1; i >= 0; i--) {
            _states.get(i).execute();
            if (_states.get(i).end())
                _states.remove(i);
        }
    }
}
