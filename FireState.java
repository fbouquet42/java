
public class FireState extends State {
    private int _life;

    public void execute() {
        if (_life == 2)
            _player.damaged(Rand.get(3, 7));
        else if (_life == 1)
            _player.damaged(Rand.get(1, 4));
        _life -= 1;
        if (_life == 0)
            _end = true;
    }

    public FireState(Player p)
    {
        super(p);
        _life = 2;
    }
}
