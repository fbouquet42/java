import Java.utils.Random

public class Life
{
    private int _life;

    public Life(int life) {
        _life = life;
    }

    public void damaged(int dmg) {
        _life -= dmg;
    }

    public void healed(int care) {
        _life += care;
    }
    
    public boolean isUnderZero() {
        return (_life > 0);
    }

    public int value() {
        return _life;
    }
}
