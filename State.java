
public abstract class State {

    protected Player _player;
    protected boolean _end;

    public abstract void execute();

    public boolean end() {
        return _end;
    }

    public State(Player p)
    {
        _player = p;
        _end = false;
    }
}
