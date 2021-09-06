
public class PoisonousState extends State {
    private int _life;

    public void execute() {
        _player.damaged(Rand.get(0, 4));
        _life -= 1;
        if (_life == 0)
            _end = true;
    }

    public PoisonousState(Player p)
    {
        super(p);
        _life = 8;
    }
}
